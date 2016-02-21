package org.sunflow.core;
public interface LightSource extends org.sunflow.core.RenderObject {
    public int getNumSamples();
    public void getSamples(org.sunflow.core.ShadingState state);
    public void getPhoton(double randX1, double randY1, double randX2, double randY2,
                          org.sunflow.math.Point3 p,
                          org.sunflow.math.Vector3 dir,
                          org.sunflow.image.Color power);
    public float getPower();
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1447328137000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAALVYe2wcRxmfO78dJ36ksfN0bMeJSBruaEMpwWmo49iNw9k5" +
                                          "fGkqnDSXud25u032dje7s/bZJShUautWEEXgkvCo+ScVBfURISqQoFUQEm3V" +
                                          "gtSqohREyx9IlEdEIySQCFC+b2bvdm/PdkAtJ+3c3sw333zv3zf35FVS59ik" +
                                          "mxk8xmcs5sSGDZ6ktsPUIZ06zmGYSysXauhfj78zvjtK6ifJqjx1xhTqsBGN" +
                                          "6aozSTZphsOpoTBnnDEVdyRt5jB7inLNNCbJGs0ZLVi6pmh8zFQZEhyhdoK0" +
                                          "U85tLeNyNuox4GRTAiSJC0nig+HlgQRpUUxrxidfGyAfCqwgZcE/y+GkLXGS" +
                                          "TtG4yzU9ntAcPlC0yc2Wqc/kdJPHWJHHTuq3eSY4mLitygR9l1v/dv18vk2Y" +
                                          "YDU1DJML9ZwJ5pj6FFMTpNWfHdZZwTlNPkdqEmRFgJiT/kTp0DgcGodDS9r6" +
                                          "VCD9Sma4hSFTqMNLnOotBQXipLeSiUVtWvDYJIXMwKGRe7qLzaBtT1lbqWWV" +
                                          "io/eHJ+/cLztuzWkdZK0akYKxVFACA6HTIJBWSHDbGdQVZk6SdoNcHaK2RrV" +
                                          "tVnP0x2OljMod8H9JbPgpGsxW5zp2wr8CLrZrsJNu6xeVgSU96suq9Mc6Nrp" +
                                          "6yo1HMF5ULBZA8HsLIW487bUntIMlZPN4R1lHfs/BQSwtaHAeN4sH1VrUJgg" +
                                          "HTJEdGrk4ikIPSMHpHUmBKDNyfolmaKtLaqcojmWxogM0SXlElA1CUPgFk7W" +
                                          "hMkEJ/DS+pCXAv65Or7n3H3GASNKIiCzyhQd5V8Bm7pDmyZYltkM8kBubNmR" +
                                          "+ArtfG4uSggQrwkRS5rvf/banTu7r7woaTYsQnMoc5IpPK1cyqx6dePQ9t01" +
                                          "KEajZToaOr9Cc5FlSW9loGhBheksc8TFWGnxysRPP3P2O+xPUdI8SuoVU3cL" +
                                          "EEftilmwNJ3ZdzGD2ZQzdZQ0MUMdEuujpAHeE5rB5OyhbNZhfJTU6mKq3hS/" +
                                          "wURZYIEmaoZ3zciapXeL8rx4L1qEkAZ4SASejxP5WYEDJ/fE82aBxalCDc0w" +
                                          "40nbRP3RoYZK45w58K7CqmXGHdfI6uZ03LGVuGnnyr8V02ZQbXJ5njJdW2Ex" +
                                          "DDDr/8e6iFqtno5EwOAbw+muQ6YcMHWV2Wll3t03fO3p9MsylDD8PXtwshFO" +
                                          "iXmnxPCUWOAUEokI5jfhadKT4IdTkNFQUlu2p+49eGKurwZCyJquRSsWRYpt" +
                                          "KP2AjSGpRDLfkbIe++XP/7ArSqJ+3rcGCnaK8YFArCHPDhFV7b4ch23GgO43" +
                                          "F5NffvTqQ0eFEECxZbED+3EcghiDwgkF6IEXT7/59luXXo+WBa/hUGzdDGAW" +
                                          "J400A5WKKpyTpnLJkYrd9B58IvD8Gx/UESdk+HQMeTHcUw5iywqYIyLe1wLk" +
                                          "VRl8AoKa2TLf0GiblqoJop5dun9+QT30+C0yczsq82wYYOSpX/zrldjF3760" +
                                          "iLObuGl9WGdTTA9IVotHVjQEY6JclsA1rTQ/+JHVCV7MCoe1ZKAX8CG5JwDJ" +
                                          "2EvYpsJUQISloLkETzuWBuPw8S/c/8f1h/fmT4jjg/CKvOoAGXBnEkGxzH1z" +
                                          "yIRhlt8ee/Klu7YpX4oKPMDaugiOVG4aCBoTDrUZAJ+BauHMSji0L5yCYVuk" +
                                          "lR099Nn0c2f6o6QWAAJAkVMoYoA33eHDK2r6QClP8KhGMELWtAtUx6USqDXz" +
                                          "vG1O+zOiNrTLsAUnt2KUboSnw6t64htXOy0cu2QtEfTdYuzFoV9ESBRft+Kw" +
                                          "TZB9CCJmm5+KUKZ1CF30SP/dBjhby2o0ozMsEv9s3XrLs38+1yaDUYeZkot2" +
                                          "3piBP79uHzn78vG/dws2EQXbBL9c+GQSe1b7nAdtm86gHMXPv7bpqy/QxwDF" +
                                          "ADkcbZYJMCBeqUKh9gm17xDjYGhtPw67OVmZY3zcLaQoNLjMgbP6/MTBZjfl" +
                                          "QvFI2loBCteUB8e3Jk8oc/3J38mEXbfIBkm35on4F4+8cfIVEeaNmGXl4Ark" +
                                          "0KCdCzi4TbgDi8b2ZZrbSnniZzrePvWNd56S8oR7iRAxm5t/5L3YuXnpP9lw" +
                                          "banqeYJ7ZNMVkq53uVPEjpHfP3Pmh0+ceSjqWTzGSY3m9cLojYhXRQFTKi0o" +
                                          "5dz/cOuPznfUjEBijZJG19BOu2xUrUzZBsfNBEzq92cygQMSY1nnJLLDslD4" +
                                          "/iVMG2jh08r5199deeTd568JQ1XeAYLQNkYtaZt2HD6B7LvC4HqAOnmg++iV" +
                                          "8WNt+pXrwHESOCrQ+DqHbECKYgUQetR1Db/68U86T7xaQ6IjpFk3qTpCsduG" +
                                          "ngkqA3Py0AoUrU/eKbN/uhGGNhHepCrgMYc2L56dwwWLi3ya/UHX9/Z8a+Et" +
                                          "gaGCw63lWiMaqhg8PV6t6XlftaYyKyM3QtNUnqrQy+NthgkOmWXyOovDvZw0" +
                                          "Q16XkhqnRr3Ixa8xTmqnTE1eHw7jcFwu3PPfWRMnji1mohl44p6J4h+giRoE" +
                                          "VYP4PRJQJKRUvWpCy8PClsWfE4Iv94eSubuC5i5AXw2dPWTprtL62qr1Iwyj" +
                                          "cNeiDLQC3JQwvkxbHOgs46mzOMC1owk8lcybXLaFed8p5vt2SjsurYPnds8p" +
                                          "t3+ATgnq8sgya1/A4QFoQ1FPc5rZN3IjNAYmraqT0ou+dR78361T5GRF4C6A" +
                                          "VWFt1X8K8h6sPL3Q2ti1cPcboq8p31VbAMeyrq4HanCwHtdbNstqQusWWRMt" +
                                          "8XWRk7ZwWkMO4pcQ9YIk+zrIFyDjWN/FW5BoAWAEiPD1m1DNI5UXlLJ51tzI" +
                                          "PIE7zZYKOBB/xpTgyJV/x6SVZxYOjt937WOPyyuOotPZWeSyAkBItm7lTrV3" +
                                          "SW4lXvUHtl9fdblpawkZ26XAfixuCITPMfC9ha5aH2qCnP5yL/TmpT3P/2yu" +
                                          "/jUAlqMkQjlZfTTwV4i8h0An5cK14GiiGmyhixfd2cD2r83s3Zn9y68FBnjg" +
                                          "vHFp+rTS9I9zs71OJBYlTaOkDkCfFSdJs+bsnzEmmDJlVyB3fcZ0jfJ/Nqsw" +
                                          "pij+SSOs4hlzZXkWe21O+qo7k+rrCIAjpNU+5O51AhV9vWtZwVVh1U/LlEMr" +
                                          "QzylE2OWVbr57RVWtyyRM5dF2v0H8PifUGUVAAA=");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1447328137000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAALU5eezjWHme35w7e8zsALvLsrvsLgPqEvg5iePE0XA5jnM4" +
                                          "TuLEjpOYllnHR+z4jP0cx6Fb0e3BtkgUlaUFCbb/gApoOVQVtVJFu1XVAgJV" +
                                          "okK9pAKqKvWgSOwfPdRtS5+d35H5zeysEDSSX57f+973vvvz+97z30fOhgGS" +
                                          "8z07mdse2NfWYH9h4/sg8bVwn2FxTg5CTaVsOQwFOHZdefyLl/79pQ8Zl/eQ" +
                                          "cxLyKtl1PSAD03PDoRZ69kpTWeTS8Shta04IkMvsQl7JaARMG2XNEFxjkTt3" +
                                          "lgLkKntIAgpJQCEJaEYCSh5DwUV3a27kUOkK2QXhEvk55BSLnPOVlDyAPHYj" +
                                          "El8OZOcADZdxADFcSN9FyFS2eB0gjx7xvuX5JoY/kkOf/c33XP6d08glCblk" +
                                          "unxKjgKJAHATCbnL0ZyZFoSkqmqqhNzraprKa4Ep2+Ymo1tCroTm3JVBFGhH" +
                                          "QkoHI18Lsj2PJXeXkvIWRArwgiP2dFOz1cO3s7otzyGv9x3zuuWwkY5DBi+a" +
                                          "kLBAlxXtcMkZy3RVgLz+5IojHq92IABcet7RgOEdbXXGleEAcmWrO1t25ygP" +
                                          "AtOdQ9CzXgR3AciDL4s0lbUvK5Y8164D5IGTcNx2CkLdkQkiXQKQ15wEyzBB" +
                                          "LT14Qks7+vl+720ffK/bcvcymlVNsVP6L8BFj5xYNNR0LdBcRdsuvOvN7G/I" +
                                          "9335mT0EgcCvOQG8hfm9n33xXW955IWvbmFedwuY/myhKeC68snZPd98iHqi" +
                                          "ejol44LvhWaq/Bs4z8yfO5i5tvah5913hDGd3D+cfGH4Z9P3fVb73h5ysY2c" +
                                          "Uzw7cqAd3at4jm/aWtDUXC2Qgaa2kTs0V6Wy+TZyHvZZ09W2o31dDzXQRs7Y" +
                                          "2dA5L3uHItIhilRE52HfdHXvsO/LwMj6ax9BkPPwQU7Bh0C2vzvTBiBj1PAc" +
                                          "DZUV2TVdD+UCL+U/VairyijQQthX4azvoWHk6rYXo2GgoF4wP3pXvECDYWBu" +
                                          "AN6LAkXbTw3M//9DvU65uhyfOgUF/tBJd7ehp7Q8W9WC68qzUY1+8fPXv753" +
                                          "ZP4H8gDIQ3CX/YNd9tNd9nd2QU6dypC/Ot1tq0moBwt6NIx1dz3B/wzz5DOP" +
                                          "n4Ym5MdnUimuMxd7IHs5Ddc98fLxt5E6fzsLeAq0xwf+q2/Pnv77/8wo3A2h" +
                                          "KcK9W9j8ifUS+vzHH6Te8b1s/R0w2gAZWgd05EdOet4NzpK64EnJwSB6jLf4" +
                                          "Weff9h4/96d7yHkJuawcRGhRtiON12CUvGiGh2EbRvEb5m+MMFt3unbgyVDu" +
                                          "J+na2fbaYThMmT+7qzHYT6HT/sVM+/dkMPf+EP5Owed/0yfVRDqwtesr1IFz" +
                                          "PXrkXb6/PnUKIGeL+5X9fLr+sVTHJwWcEvB23v/EX//5P2N7yN5xiL60k/Sg" +
                                          "EK7thIUU2aUsANx7bDJCoKXC+ruPch/+yPff/+7MXiDEG2614dW0TSmGOQ7m" +
                                          "il/66vJvvvPtT35r78jGTgOYF6OZbSqwE2YpC3Kim65sZwJ5HCD3L2zl6iHX" +
                                          "IkxhkLCrC7uSieo1MGlnpKVa2d/G/cyNIEVXX8Zcd3L1deVD3/rB3eIP/vDF" +
                                          "myz1RsF0Zf/aVkMZVWuI/v6TXtSSQwPClV7o/fRl+4WXIEYJYlRghgv7AXTc" +
                                          "9Q1iPIA+e/5v//hP7nvym6eRvQZy0fZktSGnaRUGR2DATGxAn1/773zXNrjF" +
                                          "F2BzOfNNJOP/dVtyMre+51gQrAfT3wf+4UPf+LU3fAfSwSBnV6kNQwp2pNWL" +
                                          "0i+CX37+Iw/f+ex3P5DpBIZS7qXNH/1UipXINnhj1mYDua3G0u5b0uatabN/" +
                                          "qKYHUzVt4wwrh6DrqSb8IlAzTd02dHCB6UBrWx2kO/SpK9+xPv5Pn9umspNx" +
                                          "4gSw9syzv/rD/Q8+u7fzAfGGm3L47prtR0RG9N1HqnzsdrtkKxr/+IWn/uDT" +
                                          "T71/S9WVG9MhDb/2PveX//ON/Y9+92u3iMlnbO/QKNO2eLBt+oe/smLBXZNW" +
                                          "KWyThz9WnGrFWBmuHb1fIVQGK1uh3svPuhrD14JIprt+PHa8UtXsxVUL15vW" +
                                          "0q3zk0gt4lEeK6oLrRKiM4nhjZEcgTFNT+bWivJyvCLW9NGwzS8HXmM0oB1M" +
                                          "nAN+6RlDOllX2zat0u2EH1ANKjcrzlaqg3KqRQImhylYGGMYtllhGx3DGyKP" +
                                          "V03LWVvE2lFCPOSbdalsgZAbtaV8eeM0p3wSTuTI0BcVYrNagE7Z1JnlYl1Y" +
                                          "G8IyrDV7Zdnb8ILkG2Hf94Sa69ZpUU2GAF/UKqbL9nrUjGmGeYkVzbLvGMSm" +
                                          "MZBoIzFUr5MfEThgtV7Si7x1qTkUSJNnqLxrznMtez4Y+qPROlibqt5MSJ1a" +
                                          "xnNJodEk17TYSZMXQLOUbEZVF5AKZ1P5RCmOlwpqqQzXGjOtlhAtMY2flhzW" +
                                          "BMl8WLULK1RdFYiVVZxO66NCnemyVSlmcH9RbjS6gt8b6y1VkmLB7nGWuqSd" +
                                          "YWPOmAJqCX6+Pleanlrnq0FZpOpV3pFLBt8Qlt0e6/Y9UBtMTJ/VeHMkgvGq" +
                                          "PmXak27caQ61ypLdyDUgFOzZcjwWTQ/VWkwOVdgNiDZjS5U6edmadtZig6TI" +
                                          "cktoM7Ux36rPmupAlKwyr3o9pSV3isNABKLL5dfFvr2A3kq0qsyMm/vNcD3G" +
                                          "N34xDgiKDaQgZHpRea2Jc35ULYfRstpVyr3ALydeodVt4CO2JpFEK2Tb4xJR" +
                                          "mY1c0O7aEtcrDQt2Sw/R2oCPgdwitV4pbBXEYMTM5y2BodVmYJVMq83x3Zbf" +
                                          "Gjm1Tr2X6J7tyB3AykvFWzjjtTfv5vmJTdtkgRpx84ZVGRtdi2bQOp/zqQm5" +
                                          "KuP9oOJiLaxJ8r1O26Q2iTFQcZGoORW/7iTS1AZWl7Bq0aznDHNkAPRmKeLn" +
                                          "80EQW0MeD1Y6OpNdIaoEldiThWk4cLuegrd9rlNQkuW6rGrcoAryhQ4tLyTB" +
                                          "k/tBlVLwhs2Pq7bXNGqGZoUKITTGTXedhEOOw7hiP7fmRmqb4CNPHGEKS9M6" +
                                          "DBNO3GMwSd0060VpsFGlQb476qp0FC18sqXReFDD+4kx60mGzgijstNZYgaP" +
                                          "xqOhNG3TjuxJ2EYxZX+isUSwLrGFJW2RUokneW2x5vDxlK4zqE4TRbm2lm2q" +
                                          "ruTjUt6dDTls6E2lTgmPcaJToZbOpNlS9XY5kvIY2xSjpusmASHmIVGzCYO7" +
                                          "C0YdF+l1vV4PUEIrm40lcD2cjvvkLM450aA8VbqtsVgc2zYG8pjex/xqN0zs" +
                                          "ep3gJiAOjUbfnDjumqNG4z45oj2rjS90Q1Y7QqmtClavMRjZUdHPlapasxMF" +
                                          "sUQlzDIa8uF4OPVBhyuSC77pD+usbs3aWi434dAKGfBLGGkCpUm5coeYNsiA" +
                                          "anF1oyFWZiXFKGLNeb+ENfCerq+E5SCvNWiaWkszup7DaGVumPV4bjXKbXoi" +
                                          "VFC8akeTiZcb12TUGDU3ar1JjplSPk/i407HTwTfZRlrGqjVGk60V3WiuUZH" +
                                          "NK9audagqwktZRTjZhIvp+2E1Qoxa4lDmyC9jlwUWD3fNGf20mM8H1cjt5ob" +
                                          "CFg+l4aSTbgkivF02uf9CboJbHXRwCrlvMn2Z1HTro6bqiCQ1bbogZa4GNDT" +
                                          "MqPYIVkIhAGaY1oiJVa6lKcVpA45IagmzsR1pkivpn7IjAZt3vZYixY20bgW" +
                                          "cTHBowpK6AUD1R2htFjMUaqz6ntkc1Jzaau53rQKm6Q9NGxAaBrasaPK1J+U" +
                                          "vA7XrcvR3OyLzZJM1TyhHowkksnV5KjV5RdmnsUTaipGlj3MV6s9N68U9bJX" +
                                          "HoxJkiEtsetNPRLDtFa9UwzKA8rmiI7R7NLsGJBgtC6P+GV9slk1C/3cpm/2" +
                                          "AoENSRguip3RzOPduAzKJQNM+kleiYoDQOuCOo02DU+s0nxtqINcJxakWpWi" +
                                          "GMfBc51RRypQDSzPc6haWxizpOjlvU03pFfVEJsEbIgRuUIi10dTTbI8UMR8" +
                                          "s8ZVqlFr41aIVRNV47BIDyazGltVcs0BrxVmFZdUgUOU563uhFtVZv4yQQfr" +
                                          "uN4g65Yyk6ZMl6ppy1HHqM6dQmVdX0ybBuDicqUvOtIUeicrD7weu+jOZ1wZ" +
                                          "7Qo1aaHbg1WjXbS9GgW0UY3QMMYiPAXFGIxw6MlMb9csB8M9t9Qo5QhFb4u0" +
                                          "Jvec5sQukYGV71AqtTFLwmxeN4lZUZKCGe+6prQJNG417ql4mSe8YcUckmsH" +
                                          "ByjOYtNo4vpc1Y5hVFtqU6Yi9bqitcSxSOTohd/SYXxyjHxO0fjFcixsmvwU" +
                                          "c6oK6y2mxmQ4aAgdM+/h6gZV+hG3cfXRgq6ZC4lpFqq1flRcj4LRRqrBD44a" +
                                          "vVlWi0oyH3T5acF1GZath3a9hJpit1lcGHkiwAvVqqppAiSTYAaFiUZO2UHP" +
                                          "mgJZAsVWvVyrsCuq1FqSfdeZ53KmSIx7IOdPgrhF830qGOTqy9aMpjrT+Wig" +
                                          "gWGhPkPLxIgoC5W1PCi3F37DwpaCT4UqjGJza0liXJInPUgjqnVmPTQyms2e" +
                                          "0dJ8Kph3p0qRxctqHI9ZE0tkdNSaVFGJkHM0mMtNKi5j9tjsyktjTnAiNMaJ" +
                                          "rQN5mnSSLjYAvZG7DAZJrgeMudV3xpOk763qKynODwrliWUs3WGAtdcysRac" +
                                          "pSvQBa0VVxZKI44wjtPHw667MAuOZ9ilkl9mSkZubg49WpxyJW7IDJjOcLQa" +
                                          "+1RCcJQdjnW61F5VSxofzSIKN3FyEhdVbiz4AWDLxWVQaMfJQulpZp0dUBgz" +
                                          "iFfWetbqz8NS2dn0u1TBiy3CVpLZhJUbmkr4+AoU+UUYBVPOVUPCB1iOFObu" +
                                          "kgjniVxAydKg4Q0KDU7BA6mHtRc9cuoE8lLIe1FOHVYIrFwQ8OawUaLKpDhu" +
                                          "gMKE6BBGOeRYbFAEZkHhlJm3JHysIM7IrpYEy1JLdqm4BdRZLwTLQRSOoQwA" +
                                          "MRkPrYoUj61uv+Qrg+q0beU2QbuR1BfjHtoY4zWPHJO0ydULTqHea+Ojic0y" +
                                          "eAFs2lybrmykaadfq6FrX5gnjIiuy7woraf9BahilXGfS5IIfjlx0ljjE9Kq" +
                                          "tYFTsYVAxPhxyZ6sRi1gV3V1ZvtybEnF8oTUzXVEtQWuq1NVQ8blVnFJuRye" +
                                          "sKjg+ALGocUkQhcj0l52rcHClnRBiMWSSRh50sWVTqHUNM2mkxjmWleLSr0Y" +
                                          "EFiISW41KRONmruYr1oNPxcIfLVd3YSVQp+pTW1B7lt1i9IbvMqEuVnobmjH" +
                                          "qTO2mNQwXZHyC51Be8sw9s1Fjuf7YcmwN9LEGmtFGDeXXsXKBQHVJhd+b5TD" +
                                          "+3iBNMTqagykWBSNwghlbbobDDaJTRf7Y3EW4JWhOAZJMuziaqO4yrcIztRH" +
                                          "zZEITxJvT48Y7R/tlHdvdhg/qsjCw106kf8RTjfr220IkAvyLAQBPAID5I6j" +
                                          "EvF2951q1KnDw//DN9W7hpoLz9rb+kx6tnv45Uqy2bnuk08/+5za/1QhPdel" +
                                          "KOtwW+D5b7W1lWbvbHgGYnrzy59hu1lF+rjO9JWn/+VB4R3Gk1mh5ab6F4tc" +
                                          "TFdyaeH/qMD/+hN0nkT5me7zX2u+Sfn1PeT0UdXpplr5jYuu3VhruhhoIApc" +
                                          "4ajiFCCP33Tw9RRNjQLteN83Pyp/6fqXn7q6h5zZLcWlGB4+Udi6U/cCR7bT" +
                                          "DQ6L8xeBEXjx8chulQuK9VJqEw/B58pB9Tb7T2df5aftq9fHlnWTyewd2ejw" +
                                          "wEAC5E3HBRbKs21oA6nUr45cJ6tHyDNbS4ud/33pjYUv/esHL29P6zYcOVTD" +
                                          "W14ZwfH4a2vI+77+nv94JENzSkmvO45LRsdg2xr6q44xk0EgJykd65//i4c/" +
                                          "9hX5E6eRU21oY+ZGy4rayEH9NSXKyNhWsnZ+Ym6RNtcBcvdcA73I4WXHt7Uw" +
                                          "A33njh9SADltHlxEZf755CtVH3Y3ygbefaSyrL6+D59HD1T26I+lshuZO/VK" +
                                          "3s3Dg4TpztPLrW1UiG8jnvemTQCQi1A8t5HNmZVnqsfCCX9c4STwQQ+Eg/4E" +
                                          "hXM+gzp/KxbOqV40216X/MpxcyjG+3fF6MjA2Oc8aA/Y4fwDN82LWlqDxG6J" +
                                          "wHTkuZY6hxdkZD5zGw18OG1+AcZUqAHO8MC2pPzUsbB/8ccQdvogr4VP5UDY" +
                                          "lZ+gsHe5+MRt5n4rbT4K81bKoRdrwa3UA6OkJ+/438d+FK7XALlz5xInDSUP" +
                                          "3HQZvL3AVD7/3KUL9z83+qssWB9dMt7BIhf0yLZ37x12+uf8QIOfQhnkNj77" +
                                          "2d9nAHL5pANCb0n/MiI/vQV7HtK3AwaghW57u0BfgCEIAqXdL6b3FTup9UCv" +
                                          "mWCuvJJgjpbsXjik6Ti7RT9MndH2Hv268oXnmN57Xyx/anvhodjyZpNiucAi" +
                                          "57e56ij9Pvay2A5xnWs98dI9X7zjjYefCvdsCT62sR3aXn/rLEI7Psji/ub3" +
                                          "7//dt/32c9/Oiu7/B6Wx0cTeIAAA");
}
