package org.apache.batik.ext.awt.image.renderable;
public interface SpecularLightingRable extends org.apache.batik.ext.awt.image.renderable.FilterColorInterpolation {
    org.apache.batik.ext.awt.image.renderable.Filter getSource();
    void setSource(org.apache.batik.ext.awt.image.renderable.Filter src);
    org.apache.batik.ext.awt.image.Light getLight();
    void setLight(org.apache.batik.ext.awt.image.Light light);
    double getSurfaceScale();
    void setSurfaceScale(double surfaceScale);
    double getKs();
    void setKs(double ks);
    double getSpecularExponent();
    void setSpecularExponent(double specularExponent);
    java.awt.geom.Rectangle2D getLitRegion();
    void setLitRegion(java.awt.geom.Rectangle2D litRegion);
    double[] getKernelUnitLength();
    void setKernelUnitLength(double[] kernelUnitLength);
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1471028785000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAMUaC5AcRbV375PN/e9C/smRXDbohbAriVHwkkDuuEsONslx" +
                                          "F670AmxmZ3t3J5mdGWZ67zbBKKIWkSpSCMdHhLMsg4lUCBQFpRSCQcsABWLx" +
                                          "ExH5iJQikYKUpVCC4HvdMzuzs3sbVLa8qumd6X79+v3f6+47/Baps0zSSTUW" +
                                          "YbsNakX6NTYkmRZN9qmSZW2Dvrh8U430t0vf2HJ2kNSPkZaMZG2WJYsOKFRN" +
                                          "WmNksaJZTNJkam2hNIkzhkxqUXNcYoqujZHZijWYNVRFVthmPUkRYFQyY6Rd" +
                                          "YsxUEjlGB20EjCyOASVRTkl0g3+4J0aaZN3Y7YLP84D3eUYQMuuuZTHSFtsp" +
                                          "jUvRHFPUaEyxWE/eJKcburo7reosQvMsslNdY4vg/NiaEhF03d36j/evzbRx" +
                                          "EcySNE1nnD1rmFq6Ok6TMdLq9varNGtdRr5CamKk0QPMSDjmLBqFRaOwqMOt" +
                                          "CwXUN1Mtl+3TOTvMwVRvyEgQI0uLkRiSKWVtNEOcZsAQYjbvfDJwu6TAreCy" +
                                          "hMUbTo9O3nRp2z01pHWMtCraCJIjAxEMFhkDgdJsgprWhmSSJsdIuwbKHqGm" +
                                          "IqnKHlvTHZaS1iSWA/U7YsHOnEFNvqYrK9Aj8GbmZKabBfZS3KDsr7qUKqWB" +
                                          "1zkur4LDAewHBhsUIMxMSWB39pTaXYqWZORU/4wCj+ELAACmzshSltELS9Vq" +
                                          "EnSQDmEiqqSloyNgeloaQOt0MECTkQXTIkVZG5K8S0rTOFqkD25IDAHUTC4I" +
                                          "nMLIbD8YxwRaWuDTkkc/b21Zu/9ybZMWJAGgOUllFelvhEmdvknDNEVNCn4g" +
                                          "JjatiN0ozXlwX5AQAJ7tAxYwP/7yiXNXdh59VMAsLAOzNbGTyiwuH0i0PLWo" +
                                          "r/vsGiQjZOiWgsov4px72ZA90pM3IMLMKWDEwYgzeHT42JeuuIMeD5KGQVIv" +
                                          "62ouC3bULutZQ1GpuZFq1JQYTQ6SmVRL9vHxQTID3mOKRkXv1lTKomyQ1Kq8" +
                                          "q17n3yCiFKBAETXAu6KldOfdkFiGv+cNQsgMeEgAngwRf0uwYcSMZvQsjUqy" +
                                          "pCmaHh0ydeTfikLESYBsM9EEWP2uqKXnTDDBqG6moxLYQYbaA+iZ0gSLKllQ" +
                                          "fxTUkQRWEiqNjhhUzqkQAZV0hoGVDWNvBG3P+L+smkdZzJoIBEBNi/xBQgX/" +
                                          "2qSrgCUuT+Z6+08ciT8uDBCdxpYiI+cAIRFBSIQTwkMqEBLhhERcQiJlCSGB" +
                                          "AF//FCRImAgoeBeECojVTd0jl5y/Y19XDdimMVGL6slz313ofMBEH+E8Sqwb" +
                                          "MW777ZN/WR0kQTegtHoywQhlPR4jRpwd3FzbXTq2mZQC3Es3D11/w1tXbedE" +
                                          "AMSycguGse0D44WIDJHtm49e9sIrLx94NlggvIZBFM8lIBkyEpISEAIlmTEy" +
                                          "sxDLBGOnfAR/AXg+xAd5xA5hlx19tnMsKXiHYXjEEeDv8xjp/fg6GVBUWB/c" +
                                          "SzcHkRLgjYd0lOzi6SISj6YHrpycSm69/UwRNzqKvbwfktidv/nXE5GbX32s" +
                                          "jNHMZLpxhkrHqeohvwWXLCpHNvNg7aT2uPxSy3V/vD+c7g2S2hjpAPnlJBUL" +
                                          "iw1mGlKWvMuO6k0JqFHcUmGJp1TAGsfUZZqETDVdyWBjCenj1MR+Rk7xYHAK" +
                                          "GQzZK6YvI/ykP3Llmwu2rc/s4AbpLQxwtTrIaThzCNN5IW2f6hO/H+WPNh9+" +
                                          "bONp8nVBnskwK5TJgMWTeryKgEVNCilbQ3awpxkW7fKHAb+04vKKJdJ98Qf3" +
                                          "hrkWZkI6ZxKEX8iUnf7Fi7JRj+OIuFQIhJDSzayk4pAj8gaWMfUJt4fHp3bh" +
                                          "F2AgjegG+BK24zX/xdE5BrZzRTzj8J28XYpNmFtXEF+XY3MaB/s0WNtprq+D" +
                                          "B6gQblEj4Ys0ULuSUtBBMAp90Lr8zPv+ur9NGLIKPY6KVp4cgds/v5dc8fil" +
                                          "73ZyNAEZCxw3HrlgImvOcjFvME1pN9KR/9rTi7/ziHQb5F/IeZayh/I0RuxY" +
                                          "iET1cbbX87bXN9aPzRfA+dKUjYgsYseLz/yn8QIIDE9j+55qNi5f++w7zaPv" +
                                          "PHSCs1xcDnuD8WbJ6BG6xqYHY89cfzrYJFkZgPvs0S0Xt6lH3weMY4BRBias" +
                                          "rSZQly8K3TZ03YzfPfyLOTueqiHBAdKg6lJyQMLCE8oHMDVqZSC/5Y1zzhXm" +
                                          "NBGCpo3Li5RIsKQDtXRqef33Zw3GNbbnJ3PvXXtw6mWeBkSoXlUwZ46mE55u" +
                                          "25y7/ydzLlZ8QGQE/NzIAb5YwTLGsBkBy7AKlmGS7gp7JFPJQtoct6vM6N6O" +
                                          "V3bd+sadIhP4S1IfMN03efVHkf2TwplE3b6spHT2zhG1Oye0jbOK9rG00ip8" +
                                          "xsCf79r7wKG9VwVtJiOM1I7riqj9B7HZJpQa+y/1jx3DfqU24FgHPBFbqZFP" +
                                          "UKlenakVxng5k4Y6AzydF1uOo4dP4uguMBdQpgoCKlj9altAq6tj9QYHuLyC" +
                                          "lPZiMw5Ssmwp4Xfc5X6iCtzzFLYAnrNs7s+qknnsqzB2NTZfhxCMiSDHi88R" +
                                          "WVLR6bvc+gsLnZEcFKo+B141tEPeFx56XXj7/DITBNzsQ9FrRp/f+QSveEJY" +
                                          "khXqDE/BBaWbJ9c7/o0/F3ved0DxnNSheqZ+VeMGoJgEsfp532r96bUdNQNQ" +
                                          "pAySUE5TLsvRwWRx+TPDyiU8NLm7dN7hJQhrcEYCKwwj79rHN6rlHWfAs862" +
                                          "j3XV8Y79HOB7FYzk+9jcAkZiFRuJz0m+Wy0nQRy9thB6q+QkhyuMHcHmICN1" +
                                          "4CQXcIj9LteHqqX6+fBstLneWE3V31+B9QewuRdYtxzWPQq/r1oKx5wQs1mP" +
                                          "VUnhxyqMPYrNw4zMwqhon1T05w1dg/DiU//Pq6X+NfBcaMvgwmqq/5kKgngO" +
                                          "mydBEFZ5QXiM4ddVEASfvgieUVsQo1UyhlcrjL2GzYuMNPEKig3TtLNXhypq" +
                                          "Pq/6sWpKUz0bGYayX9LSKl11niuZ31fLRFbCs92WzPbqmMjrHODtCuI5gc2b" +
                                          "IB7LIx6fbRyvggRacGwpPJItAalKtvFBhbEPsXlXBIoLqKlR9SJNYTGqpVmm" +
                                          "+EatUBHxLbwoTC5uPPYz6wd/ukeUT+XqLd8Z/qGDIfnF7LHXnX3MNQVpLHSk" +
                                          "scmWBv9lZPQTOklG64725RKK7JxRVwkzbuiWT7/d9Ehv6ofLnvzq1LI/8O1/" +
                                          "SLFGJRMqyDK3J5457xx+5fjTzYuP8POqWixEUYDN/mun0lulossiLvtWaALi" +
                                          "dX+ZSnRR0eklvyV1j83ueObzzx389o0TQvEVdte+efP+uVVNXPnaeyVnKLh+" +
                                          "XZkNt2/+WPTwrQv61h/n893jOpx9dr703B8k6s5ddUf278Gu+l8GyYwx0ibb" +
                                          "t5KjkprDg/ExkJnlXFXGSHPRePGtmrhC6imcUy7y7/g9y/oPCr0ley0rKs/b" +
                                          "hT4CBL0/0FbJ76GcSSmapArXh/2EKhwWP31bjRqFJ7pAyHDjUlCgclKAOJ5D" +
                                          "1iJ9KmRGydmawJi4yVD0SOGOFAbzJebCI1vBngKh8sTzgLz8ZPEq0FVhLIxN" +
                                          "J/AvI6WCsQrgn5ouFnvCtidZTHp2RO9VK+nhLjltB7l0VZJeIMiZX11BMGuw" +
                                          "iYi6yB/3i3NfIPpJCCLPyOyyV2Z48jiv5E5f3EPLR6ZaQ3OnLnpeRDvnrrgJ" +
                                          "tuCpnKp6XcnzXm+YNKVwETUJx+LHJ4F1jHR/7LNhhvcJzgcyFVgrsJzLSGdl" +
                                          "LGCc/Nc7q4+RedPNAh+F1gs9AH5XDhogofVCDjLS5oeE9fmvFy4G/LhwEDDE" +
                                          "ixdkK2AHEHwdMoy88OmFXrVyt5h9Mmvw3GYuK8oL/P87nPogJ/7DIy7fNXX+" +
                                          "lstPfO52cbkpq9KePYilETKWuFOxM5b3lNSPzcFVv6n7/Za7Zy53qot2QbDr" +
                                          "Uws9lc8w+IqB1rfAdzthhQuXFC8cWPvQr/bVPw3pZjsJSOAu20vzQN7ImWTx" +
                                          "9ljpyQ3kAX5t0tN9y+71K1Nvv8iPzkvzqx8+Lj978JJnrpt3oDNIGgfBnMAQ" +
                                          "8zxBnbdbgwp93BwjzYrVnwcSAQvE5aJjoRZ0FAn/84PLxRZnc6EXr8EY6So9" +
                                          "py69S2xQ9Qlq9uo5LWnXGY1uj1NaFN3C5QzDN8Ht8RQf14ssJWq8mnhss2E4" +
                                          "d8P1TQYPGpPlIzQaqMRf8S3xb12ry0r7JQAA");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1471028785000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAAMV6CcwsyXlQ/2/fnl7ve7u21+uNd23vvo2yHvvvmek5tXGc" +
                                          "7pmemZ4+po8525B1X9Pd0/c53R0MjqVgQ5BjkTUESBYhO0CsjWMhDAgIckAk" +
                                          "jhIsxbKARMI2iDOOwRZXFAOmuue/3r9v38Z6fjBS1XRXffXVd1f1V/XKN6F7" +
                                          "oxCq+Z6d67YXH2tZfLyz28dx7mvR8ZRqs1IYaerAlqJoDtpeVJ753LX/8Z1P" +
                                          "GNevQPeJ0Jsk1/ViKTY9N+K1yLNTTaWga+etuK05UQxdp3ZSKsFJbNowZUbx" +
                                          "CxT0hgtDY+gGdUoCDEiAAQlwRQKMnkOBQW/U3MQZlCMkN44C6E9CRxR0n6+U" +
                                          "5MXQu25G4kuh5JygYSsOAIYHyvclYKoanIXQO894P/D8KoY/WYNf+os/dv1v" +
                                          "3QNdE6FrpiuU5CiAiBhMIkIPO5oja2GEqqqmitCjrqapghaakm0WFd0i9Fhk" +
                                          "6q4UJ6F2JqSyMfG1sJrzXHIPKyVvYaLEXnjG3tbUbPX07d6tLemA18fPeT1w" +
                                          "OCrbAYMPmYCwcCsp2umQq5bpqjH0jssjzni8QQIAMPR+R4sN72yqq64EGqDH" +
                                          "DrqzJVeHhTg0XR2A3uslYJYYevI1kZay9iXFknTtxRh64jIce+gCUA9WgiiH" +
                                          "xNBbLoNVmICWnrykpQv6+Sbzwx//cXfiXqloVjXFLul/AAx6+tIgXttqoeYq" +
                                          "2mHgw++m/oL0+K987AoEAeC3XAI+wPzdP/HtH33P01/44gHmB24BM5N3mhK/" +
                                          "qHxafuS33z54vn9PScYDvheZpfJv4rwyf/ak54XMB573+BnGsvP4tPML/K9t" +
                                          "PvwZ7RtXoIcI6D7FsxMH2NGjiuf4pq2FY83VQinWVAJ6UHPVQdVPQPeDZ8p0" +
                                          "tUPrbLuNtJiArtpV031e9Q5EtAUoShHdD55Nd+udPvtSbFTPmQ9B0P2gQEeg" +
                                          "GNDh986yiqEQNjxHgyVFck3Xg9nQK/mPYM2NZSBbA5aB1Vtw5CUhMEHYC3VY" +
                                          "AnZgaCcdpWdK+xg2HaB+GKhDBazItgYLvqYkthRSpm7EwMr4svW4tD3//8us" +
                                          "WSmL6/ujI6Cmt18OEjbwr4lnAywvKi8lGP7tz774m1fOnOZEijH0fkDI8YGQ" +
                                          "44qQKsACQo4rQo7PCTm+JSHQ0VE1/5tLgg4mAhRsgVABgujDzwt/fPrBjz1z" +
                                          "D7BNf3+1VE9W+e4T1cs9YNzzrx3YR2VUIapIqgBDf+IPZ7b8kX/zBxUTF2Nz" +
                                          "ifDKLZzp0ngRfuXnnhz8yDeq8Q+CMBZLwOxAhHj6skvf5IWlb18WLojO53ib" +
                                          "n3H++5Vn7vunV6D7Rei6chL6l5KdaIIGwu9DZnS6HoDl4ab+m0PXwU9fOAkR" +
                                          "MfT2y3RdmPaF0zhbMn/vRaWC5xK6fH6oMpBHKphHvwt+R6D8n7KUmigbDg7z" +
                                          "2ODEa9955ra+nx0dxdC9zePucb0c/65Sx5cFXBLwPsH/+X/5pf+EXIGunMf+" +
                                          "axdWUyCEFy7EmxLZtSqyPHpuMvNQK4X1r36W/ZlPfvOjH6jsBUA8e6sJb5R1" +
                                          "STFYPMEi9JNfDH7na1/99FeunNnYPTFYcBPZNhXwEFVrIeBka7qSXQnkmRh6" +
                                          "685WbpxyvQRrIyDsxs7uVqJ6C9gNVKSVWjk+LCiVpwGKbryGuV7YBLyofOIr" +
                                          "33rj8lv/6NuvstSbBUNL/gsHDVVUZQD9Wy970USKDADX+gLzx67bX/gOwCgC" +
                                          "jAqIINEsBI6Z3STGE+h77//dX/0nj3/wt++Broygh2xPUkdSuV6DqBsbYIk3" +
                                          "QFjI/Pf/6CFq7h8A1fXKN6GK/x84kFO59SPngqA8sK7+1L/9xG/99LNfA3RM" +
                                          "oXvT0oYBBRekxSTlVuNPv/LJp97w0td/qtIJiNHLDz/3X6rA3asmeK6qf6is" +
                                          "ageNlY/vKav3ltXxqZqeLNUkVBGTkqKY9lQTbDXUSlO3DR1saDrA2tKTdRT+" +
                                          "0GNfs37uP/7SYY28HCcuAWsfe+nPfvf44y9dubAzefZVm4OLYw67k4roN56p" +
                                          "8l23m6UaMfoPv/yhf/A3P/TRA1WP3bzO4mAb+Uv//H//1vHPfv03bhG2r9re" +
                                          "qVGWdfNk2vKv/fqKja//uUkrItDTH72QBm1U4eUl0m2zDKz1B3Dk8Ouh7Bky" +
                                          "GprLyd6yhkmCRzMmsrNRp1tHncwRkRiZth11vBI73ULGSJJYWYIvDGh1YlB0" +
                                          "pLfsxQDjRj4vDDglQrEVleHZpG1OOdPakAt/ORi0JqlKF0kRIZG8pKRekDhq" +
                                          "Z93t11Jk26m1ujAm+VG9EIT5YrWRI0ay1h1mvrEcXmT6gSOIq+YwDY3eooXU" +
                                          "43q6bU6mTYsRWEuUaHHcXE030Ywc8czKYaxImopzZmpJTtNgCKswrCxYrBll" +
                                          "4wXJTpyI5m61YZb8aBkbDruw+M2IyzcdXt1E2QLf2WOsWcd3g3yGCkt+btl1" +
                                          "Ham1pnVJEhlk091QbK81RLTFhqOTJBHnE2EUR/5ukfKTEbuQ8Dxb4bA2JRU5" +
                                          "Cb1uqHkRl9JRZDPqppXqMGNKuDGqIyrS2cFaWsh8hiu5wOAN1x02QmcUdGZW" +
                                          "Z06rVNBPpZAZxyoftgeSQ1p1jqWF4c6hsGDES7N9QM/iwX69YBp0bNeQ+Wye" +
                                          "0vsln+a4zhH1hLJ4UyBXy5jBZ4oYodxmJ6fb4XSfdOZoqA1yg17Ic68/Q1ze" +
                                          "bxb1hj9Z0fEglAZTYodmOD0yrKGuTiPdD1eGIwjTSCWSvUxOgrFDBC45sdP5" +
                                          "RJSEhimsUHjR3USTmYuPmDTYhGQf3fXGsiOSkoxtRQEhh1HYDRZksMIahZWE" +
                                          "LWqIavsJZkQLgs5oYYUhfX8urTfBSpzxC7i1H+xqOIWiA6eIDMGOcUroLwPc" +
                                          "Fbihg5tBINhezugaCHvcLK7T+GBuces5YS3FcZvsCfVwPhsF1rDZJoboZDEf" +
                                          "tAiXpgh52Ntke15aJcO5ZSmw3GyICdzPZZFeTdGxPlvY9kizUwN31NRyhwy+" +
                                          "ZAZuS5/uQGhn6l6xtvfrNsqh026MZps9C3dzc82sVaPdX9JoRKGzgpHH89zc" +
                                          "J5O6WWeplRfCaTQ2uZ04M1d65KUtP+s2RbRf92mEoCmaXA3x/UYvtMm81Zxq" +
                                          "SULQ2rBNjrklkXaaXjJA5AWVxCLXGPuJOAoaU24z5zqCs+SpfjrJuDkxRJwZ" +
                                          "yVvrtGHPSc/JuQYZ9IJG10XygTkiMRSfr9GkQ9pgM65aI3Oc1hSGi3Raw3XU" +
                                          "1ff8tp7sN4pAiykX7RZB7g8caWLUc1Wbb02LwoUNFtF9HF+xzSQg1+58OMSC" +
                                          "ccfxMmrDbWQJrZliXRco0ra5bTZfWBy/AlpidoaxKAKLQ8Vl3fDGy+GKSbEx" +
                                          "wtaoWuRYqlhMPQLDMcaEM4zT13AzEEJ9sEjmNbFTq/cUc95LhtgArGMbk6gp" +
                                          "KMGPMIHg5nuLDnCMMgycVzhzag+EMYaOYHg04AkH1T0N0/CBt1vO1TpYMXJ4" +
                                          "0+ivh6rp0Msx1YnsAmkg3pbG8EkN7wnBXqZX3W5XZOAVX7e4uabHEy/fc4bN" +
                                          "8q0d7+9VZFTI63nQdERugOARMmw04H0jXsuaiqO0kCt6Mo60+rDVWhHD6SR2" +
                                          "Wn2tHxEhlfVbjK3rKSFiI7pnE5iV4z4h4ChhO3M8j7IhhY1n7hblYXSt1zJU" +
                                          "bWdo27CzRj926Yhcm5PNeofj2jDtZTsf3uqd8RJbrDBYEQplYvGUvtuodXtW" +
                                          "mB2BEHadzST0c0VwOn14seeZIiBTeb+1YlNNYXeNt8fyGmlGO2ZCi5SfGVY4" +
                                          "CTTPSPerNTXwJ0zK6F1p3kzYTMiRJZwOa0pXbwpNY+ejrGtPsQVl7hvO2CZX" +
                                          "KZ3MOlZ9GowmysIZT/3GHB1H24UoBvh8uFTzFbYbaO6uQfM13upmmwkKjLoQ" +
                                          "yc4mJeDcYhHKdvZJM1TgqIXKPsVl+3geEtLcKAYM0yZWzW3HmMGT2opljH5N" +
                                          "njF+z11ibmTtyfZ8qtOruRbmpF76qGnLHCLt/cxadbfkBJVr9VZKklN12u9x" +
                                          "W8QIrZVoER0xI/F1z1y42+7I7E75XW1GJCOOMKZDoZByq+WDuKVLK3q7mMat" +
                                          "7cRHZGPURPWdpo9rGNlsFWs4U/E2FooFPy92vWmzt974jDOK1/iott4gtITB" +
                                          "UX3FxH4Y1IZYR+dkG9+1NlEdOLGwiDGMRv1+nQp7BZvWkrDPjCmCZDcdcum3" +
                                          "FF2N4LStKj3wbdxFxJxBcXGQ7ZFJaOuEk86U3Sil8YbP9Eke7odzswsX5oST" +
                                          "2yOY0EQpN2CizifZxsTnDUWW172uvGb6ElvwW7SmkovdRo82kUYVcO72OIIY" +
                                          "4v1drd0OGLO9rdX23UJiU3YiDKJGpgzdZNhbydMONu5kwWay6fWVbRFupiNL" +
                                          "1Nk0qgv1ddyxJ8heozctjMdMKQoFkbPzHonMxTqyKbbsNqdm80QLzAmGqqTe" +
                                          "sac5R1MDvOdN6OEyEIUB3N40isJYOww2HvgeQpltnohIbhiv+UDbIoi4R8aM" +
                                          "LLtThE3X63jfcVYaZgne2l7sxVbHwdvtpNnOu3CuFpQt9rgxh8NMQaBye7Of" +
                                          "U+MIs7C8i5K2Mxa6ut+djtgpF3tK3EnpDtOZLRFZrUWSShhsS2gQW5qpI9p2" +
                                          "ObG2zfnet3FE7kT+ZN4sjHFjlmv1nTwj++G4Xjf9XhYNtt1+2N2T4/5yv4yn" +
                                          "5oxuEN3QDHZ9rDsRpz4n1XK4scuQ4TZYNFsjfcJiIzkQwWaBtDVXspaZq7et" +
                                          "1qaDFrk6aiQzr6WyrURPaEzlfN0bkPauL9kxGnTiXZ/bTBIqH9isaNL7thA5" +
                                          "e7+13irtdcccxEUxojaoGzJRN6oFlgs+mgusyczFrZENaFMYTsxej18tKb4j" +
                                          "p0pNjyhXxJUR6dWwRqsR46w2ytqd9XrXhYfEHGOKiOuPQh5EnRonpBo+3VjG" +
                                          "OhjiMIZJwDD6Shf26vAISTW1PsxcRjC0QKwtNXrsTXU82vptpBn2O/JCZTiG" +
                                          "89FcWODtORWl/H7FZ7U5O8zNRY+hnK7KdI0pZ4QKvhmQ+/0OyHTCdEJ7stqi" +
                                          "Ua/T3CHrZW/T7U9mWHe0Kaxaf6eglmiO+GRa1J3aKq+7HJ/3YwPrBDXOMvKE" +
                                          "nigThxgwjdaAWyvErk/F2iQI1p3aFotiytVWOLJEGjWsz2n7BGz/4qxYsVwA" +
                                          "hw2PzNp7Lmo47HLhGlke0OwmZPatgt4Hhuc25vX2vqHq8NBcwDAbdNY1Zosp" +
                                          "Ep3qeycI4LZF6q4+c3IVw0dim1ubdEtVlzgqbFPd1BbLiPMai9ywlXBHNcfF" +
                                          "JqEZFidNHZnHFLM2cj9gA7gTrXxyUdTl8UbK131KIO1GwzUTEWlsKX4kD6J+" +
                                          "c1WwcuDQu3AyG8aDhGjrSlMmsC5FZJ2tzOeprvOSMt777JSIUckm43SEGTLO" +
                                          "Rmt7jREeFZA23xemzGY+Dvyl49RwKV5gk4yS99580E5YdlN09iqcWNpiXlsH" +
                                          "lNoT4WA8JLbuqEtN1u4aoRlu6VMTwYoUZ4WlfVtkufnMssedVrfZ5kmyO834" +
                                          "5d4q5MRczbuw2seNtONtKTctggZFwL1ZAxao0XjK00E+JMG3RqvdzbJae7ub" +
                                          "A9mwPXYWrMwMX2yGDOwkbt1ObC+KTCqNVxJKmeq6Jgouz9c1y07zZWPXQxJt" +
                                          "JhdFhvT6Xn3OpfhSjbWatmVryXLJrFlX0vKlS1JGbS1aTNyEwQoz34dc2mkY" +
                                          "sNvrI7uZn/XVsFtHsJ7Vidqqutg2u71xUrN743yzz+qmLMdtcmf54VCH8cya" +
                                          "uvZ6tB4LE5bX2HHshMagYzrKIu+CwKT3c9hjB2Hd1vJ6SEawbMxbA4yqw/WR" +
                                          "PO12xoogOJKPhmsDbuKksV+xSEPe8cFo2gVeMxnuFvZAV2wSnU3bw4Y57ZMO" +
                                          "P85VR9pPzVa+HNaF2Xg2QuViqskDopFirk4avWhe6FTRE1k8qI+WBjAKZgqj" +
                                          "KdFZDSIu1N22l4zcdAC2BuAzxm/ys/6SrLkGtbNjrGvXl+JUI2hTXDcaGD1O" +
                                          "9ubG7OQYjJgIsyVYfzoYUGw+y/NlU2z1dmbaxttbBGdBcBElDpm5lOtr/DB1" +
                                          "w1CfxsnAd0m/s1bcYu3UNgy53OPzxTSrUZNpa9TYTXi4SzGGkSrTQlfy0VIP" +
                                          "o2lBCWPVpsYDBWaUbtCq8ZrKMqhRGzX0qI9O2uuh4enedjkY7iih7Wl4f+uk" +
                                          "o7w1hiljjw+HuJmpFtlEJ/hkr9Je3uvNnNE6XOZx2+jTTgpWlk1C9jwKZntd" +
                                          "l/X0KdwdEnl3y6zXNTuK2e2s3VRkyw/6pMZuTBufk6tkNMvotozY4PuzUEbL" +
                                          "tON2YVHqinkbCby4ycnDcLGP+rbS29eIAGuEW1QtYsPgkvVo0FNWbMqFsLxk" +
                                          "94gv7qKpMEOTZj0tOKZLOKt51rd3fs4hFrpux/WY6ee1boNsMGnaM9nCAk6T" +
                                          "9WrUrt/tTadu6MeIN2SIsb7FXBrlekWGubIq63u/j2D7XbEJl+5eEVDgBG1p" +
                                          "uvN4sT5CXbjXYqmMF12lg6/DHr7pCF7fzzt9oZlxfc4O+onXplbuerxpJLsG" +
                                          "I40YZNDmiiHTm8Q9nts2WlE0XQU9xzWiqIm31B7bmHMbduyzNlFwUkDz256A" +
                                          "ZHKjGQKT7045FC3TEsT3lhl6tErgnR0P7exu2VH/HjIi2e0mjKEHJDmKQ0mJ" +
                                          "Y+jBs/Oqw+wXMthHpwlD7I+eRh+ZNkA38GwvJErEvmdX2cEyafTUax0iVQmj" +
                                          "T3/kpZfV2S80yoRROe8Q0BZ7/nttLdXsC1Q9AjC9+7WTY3R1hnaewP71j/ze" +
                                          "k/MfMT5YZXBflVinoIfKkWx5VHl2JPmOS3ReRvmL9Cu/Mf5B5c9fge45S2e/" +
                                          "6nTv5kEv3JzEfijU4iR052ep7BB65lUZNU/R1CTUzud99zulz7/4Kx+6cQW6" +
                                          "ejHHX2J46lLG/A1bL3Qku5zg9DjxodgIvf15y8X0ORDrG0rDeTMoN07Om6r/" +
                                          "svdNflm/OTs3v1fZ1ZUzQ+ZPrCiEfvA8cwvMwdaUSuo3Fq5TJTpLaylPUf7X" +
                                          "tecan//9j18/pAFt0HKqhve8PoLz9rdh0Id/88f+59MVmiOlPKA9z0Wfgx1O" +
                                          "/d50jhkNQykv6ch+4stP/aVfl37+HuiIgK5GZqFVx3DQycFOSZRRsa1UtX6p" +
                                          "b1dWLwKT1bX4kNM9dZ769+o85x7+wdfLeV6komr4wJk+q8anQXn+RJ/P35E+" +
                                          "b+b86BAfytfDqUN6G9FUVQBEE90kmvdfiGGDGLqaeqZ6znp4B6w/VDY+Bsrx" +
                                          "CevH30fWL3L2k7fp+2hZfRiEWmAQ1ZniqT3ceB17OAeuBPET3w8bQE4Egdwd" +
                                          "G/gzFcDP3EYanyyrjwNpRCfSKN+Lcy5/+g64rCLXk6D0Trjs3SV1/9Xb9P21" +
                                          "svrLMXSt9P+kWk8FRbJvaer3qV4in3RV3P+VO9Xxe0F53wn377s7Ov5UBfDZ" +
                                          "24jgc2X1i0AE0c0iuKTqz9ypqktY7IRZ7C6p+u/fpu8fltXnY+heoGqygvjU" +
                                          "OXd/505V+TZQxifcje+mKn/tNix+sax+FbAYnbJ4QYH/+E4VWEYk6oRF6i4p" +
                                          "8Mu36ftKWf2zGHpT6asn1z7wzPdczY0vqfNLd6rONijcCa/c3VTnV2/D8NfL" +
                                          "6ncAw9GtGb6g3N+9A4YrsLeDsjxheHmXlPt7t+n7/bL6dzH0cLXuxrymn272" +
                                          "wdr7tmrjV661uuY5xzzYFEqubmvN4bkE/v2dqvw9oHzgRAIfuDsq/88VwB/c" +
                                          "Rgx/WFb/FYghuiCGS7r+b3fA6SNl47tAkU44le6Oro+u3qbvvrLxuwdHJrXQ" +
                                          "1eyFa8aU5uqxAbb5z732V2K17T/ciHj5rz/7pT/18rP/urp98oAZLaUQDfVb" +
                                          "3Hm8MOZbr3ztG19+41Ofrb7ErspSdPiMu3xZ9NV3QW+64lnx/vCZSEvpV3LV" +
                                          "T0Ra/ceQdYd37+TQVHUNFpbjEfhgctPyristxaGZlbeDARasAji96vf/crpK" +
                                          "Ap/yfR86s8oj6E79r3dZhN93/zuq7p4dPX4b03yirB49hNzLpnmzGx499r0w" +
                                          "nMXQW255VbH8rn3iVXepD/d/lc++fO2Bt768+BcHez29o/sgBT2wTWz74u26" +
                                          "C8/3+aG2NStRPHhIFvgVa++Ioef/yN+0cZnrOH0puTl6+oDlmRh6+vZYwPaj" +
                                          "+r846rkYeuK1RsXQPaC+CP1DMfTmW0ED");
    java.lang.String jlc$ClassType$jl5$1 =
      ("SFBfhKzF0PXLkGD+6v8i3DHg5xwObOUPDxdBGgA7ACkfm+VFw0qFT1y01yr4" +
       "vq7Wz4ZcvClYslrdqz9NTSWHm/UvKr/88pT58W93fuFwU1GxpaIosTwAYs4h" +
       "F3QScy7e3bqM7RTXfZPnv/PI5x587jQV98iB4HPfuUDbO26dpcEdP67yKsXf" +
       "e+vf/uG/8fJXq9ty/xcSZdUf8DAAAA==");
}
