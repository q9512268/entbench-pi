package org.apache.batik.gvt;
public interface Selector extends org.apache.batik.gvt.event.GraphicsNodeMouseListener, org.apache.batik.gvt.event.GraphicsNodeKeyListener, org.apache.batik.gvt.event.GraphicsNodeChangeListener {
    java.lang.Object getSelection();
    boolean isEmpty();
    void addSelectionListener(org.apache.batik.gvt.event.SelectionListener l);
    void removeSelectionListener(org.apache.batik.gvt.event.SelectionListener l);
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1471028784000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAALVYe2wcRxmfO7/fj8RxmofzcgJJzZ0amkqRQ9rYjROnZ+cU" +
                                          "pwGcNpe53bm7jfd2N7uz9jkhqFRUTYuIojR9oSZ/pWpBbVIhKkDQKgiJtmpB" +
                                          "aokoBbVFAonyiGiEBH8EKN83s3u7t2e7FaQn7dzezPd9873m931zz10ldY5N" +
                                          "+pjBE3zWYk5ip8HT1HaYOqxTx9kPcxnl8Rr690MfjG+Nk/pJ0l6gzphCHTai" +
                                          "MV11JslKzXA4NRTmjDOmIkfaZg6zpynXTGOS9GjOaNHSNUXjY6bKkOAAtVOk" +
                                          "i3Jua1mXs1FPACcrU6BJUmiS3BFdHkyRVsW0ZgPypSHy4dAKUhaDvRxOOlNH" +
                                          "6DRNulzTkynN4YMlm9xsmfpsXjd5gpV44oi+xXPBntSWKhesfaHjH9dPFzqF" +
                                          "CxZRwzC5MM/ZxxxTn2ZqinQEszt1VnSOkq+SmhRpCRFz0p/yN03CpknY1Lc2" +
                                          "oALt25jhFodNYQ73JdVbCirEyZpKIRa1adETkxY6g4RG7tkumMHa1WVrpZVV" +
                                          "Jj56c/Ls44c6v1tDOiZJh2ZMoDoKKMFhk0lwKCtmme3sUFWmTpIuA4I9wWyN" +
                                          "6toxL9LdjpY3KHch/L5bcNK1mC32DHwFcQTbbFfhpl02LycSyvtVl9NpHmxd" +
                                          "EtgqLRzBeTCwWQPF7ByFvPNYaqc0Q+VkVZSjbGP/XUAArA1Fxgtmeatag8IE" +
                                          "6ZYpolMjn5yA1DPyQFpnQgLanCybVyj62qLKFM2zDGZkhC4tl4CqSTgCWTjp" +
                                          "iZIJSRClZZEoheJzdXzbqePGbiNOYqCzyhQd9W8Bpr4I0z6WYzaDcyAZWzel" +
                                          "HqNLXjoZJwSIeyLEkub7X7l2x0Df5VclzfI5aPZmjzCFZ5QL2fY3Vwxv3FqD" +
                                          "ajRapqNh8CssF6cs7a0MlixAmCVlibiY8Bcv7/vZl+/7DvtLnDSPknrF1N0i" +
                                          "5FGXYhYtTWf2LmYwm3KmjpImZqjDYn2UNMB7SjOYnN2byzmMj5JaXUzVm+I3" +
                                          "uCgHItBFzfCuGTnTf7coL4j3kkUIaYCHxOAZJPKzGgdO0smCWWRJqlBDM8xk" +
                                          "2jbRficJiJMF3xaSWcj6qaRjujakYNK080kKeVBg3kJ+micnmM4wxROYWdan" +
                                          "ILOEdiyaicXAxSuiB1yHs7Hb1FVmZ5Sz7tDOaxczr8vkwYT3PACYC9sk5DYJ" +
                                          "sU0Ctkn425BYTEhfjNvJ4IHrp+AQA4q2bpy4d8/hk2trIGusmVp0XEmcquX+" +
                                          "D2CMqCXO7xcmrHO//sWfPh8n8eCod4QweoLxwVB6ocxukUhdgR77bcaA7t0n" +
                                          "0o88evXBg0IJoFg314b9OA5DWgFWglUPvHr0nfffu3AlXla8hgO+ulkoU5w0" +
                                          "0iyAE1U4J01llJGGLf4IPjF4/oMP2ogTMmO6h720XV3OW8sKuaNGvC/l5NY5" +
                                          "Pc6msQrvsqlV0BRnHMrXmOk6DP2M4nzmzZ+Q+S42G2Xd8glZhwuAgeWNMYgr" +
                                          "54MlAakX7j97Xt379C0SPLorj/pOqGTP/+rfbySe+N1rc2RfEzetz+mggx7y" +
                                          "VC1uWdGTjAnE9ut7Rnm3/czvf9ifH4qT2hTphlC5VMfuYoedh7qlTHnQ3pqF" +
                                          "RiXoF1aH+gVsdGxTYSqUq/n6Bk9KoznNbJznZHFIgt/NIG5vmr+XiKr+yv1/" +
                                          "XrZ/e+GwyP1wd4C71UFhQ8401vRy7V4VcX9U5LfHnntt1wblTFyUMywNc5TB" +
                                          "SqbBcCBgU5tB3TbQHJxpg03XRvEk6q2Msmk1fTHz0ol+EYUmqOmcAgZDueyL" +
                                          "bl5Rkgb9M49bNYITcqZdpDou+S5v5gXbnAlmBNB1ySMICdKCJ64Xns94oC2+" +
                                          "cXWJhWOvBEZB3yfGNTj0i+yK4+t6HDYIss9Ctm0IYAWqDEIfRqT/bgPCruU0" +
                                          "mtXFefhXx/pbXvzrqU6ZyDrM+CEa+HgBwfxNQ+S+1w/9s0+IiSnY5QTQF5DJ" +
                                          "0rkokLzDtqk41aWvvbXyyVfoOSjCUPgc7RgTtYx4sItK7RJmD4lxJLI2isN2" +
                                          "TlrzjEug9/MPUKJT7IdtUELWfNChf570DnWtGeX0lQ/bDnz48jVhVWXbG4b2" +
                                          "MWoNynDicDvCS2+0uOymTgHobr08fk+nfvk6SJwEiQoURWevDQWtVFEIPOq6" +
                                          "ht/85KdLDr9ZQ+IjpFk3qTpCsYRBmwDZxJwC1MKSdfsdMmNmGmHoFC4hVU6q" +
                                          "msBArJo7xDuLFhdBOfaD3u9te+b8e6KoSOC/rZyxrShmETwDXsYO/F8ZO39s" +
                                          "71lg7RAOX+SkQXOE1mDU2gBmEc8mXCh9aVsrQtmd9vrHzenDysn+9B8kvN80" +
                                          "B4Ok63k2+c0Dbx95QwBbIyJvGU5CuAoIHTrSncIczIGNC9zGKvVJnuh+f+qp" +
                                          "D56X+kSb3wgxO3n24Y8Sp87KEytvCOuqmvQwj7wlRLRbs9AugmPkj5dO/OjZ" +
                                          "Ew/GPV9vBjdnTVNn1CjHIiZiIdqpSi9KXe98qOPHp7trRgBOR0mja2hHXTaq" +
                                          "VgJ1g+NmQ24NLhUStkNaY2PCSWyTZcl0HsPhS/I9/T+eApw4EE1tsbbZe/z3" +
                                          "G5Xavss8cBpYoIUpI1m5c0GmmQXOw3EcoFwtpqpaxS04FC8D8CvPSe20qamB" +
                                          "N51Py5tb4NnqeXPrjfcm/iwJgocW8M43cPg6J702K0IHVOUgXD4ROOOBG+GM" +
                                          "EnTf/tUDMXdp1b8W8qatXDzf0dh7/u63RetRvg23AvDkXF0PHZjw4am3bJbT" +
                                          "hHGtsgRZ4usRSIG5EouTGhiFrmck5WNQH6OUnNSJ7zDdk5w0B3Rwt5AvYZKn" +
                                          "QDqQ4Os5OKOxyotT2a09H+fW0F1rXQWGiv+FfJBx5T9DGeXS+T3jx6/d9rS8" +
                                          "eik6PXYMpbQAtMg2rNx1rplXmi+rfvfG6+0vNK33Ma9LKhwk6PJQOh2AxLMw" +
                                          "pssiDY3TX+5r3rmw7eWfn6x/C9D6IIlRThYdDP0rI9sR6IpcuB4cTFVDKPTs" +
                                          "otMa3Pit2e0Dub/9VpRiD3JXzE+fUa48c+8vzyy9AB1ZyyipAzhnpUnSrDl3" +
                                          "zhr7mDJtT5I2qJklkflco3oFPrdj+lH8x0j4xXNnW3kWO2dO1lZXnerrB7Qt" +
                                          "M8weMl1D9RC+JZip+MPKS+lm17IiDMFMqNBOSSDDaEDeZVJjluXfXJt3WeL0" +
                                          "6XPBhC64L4pXHC79F5o34zozFgAA");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1471028784000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAALU5aczsVnV+39tfHnkvCSRpICHLC22Y8Nkz9mx6FJixZ/Es" +
                                          "9szYM+NxWx7e92W8zHgMqVJUSgoqoDahtAr50UJbUFhUFbVSRZWqagGBKlGh" +
                                          "blIBVZW6UCTyo4tKW3rt+bb3vSUg6Ei+c33vOeee/fqe++K3odNhABV8z95o" +
                                          "thftKkm0a9rl3WjjK+Fub1AeCUGoyLgthCELxq5Jj3720r9/90P65R3oDA/d" +
                                          "I7iuFwmR4bnhRAk9e6XIA+jS4WjLVpwwgi4PTGElwHFk2PDACKOrA+iOI6gR" +
                                          "dGWwzwIMWIABC3DOAtw4hAJIr1Lc2MEzDMGNwiX0s9CJAXTGlzL2IuiR64n4" +
                                          "QiA4e2RGuQSAwrnsfQaEypGTAHr4QPatzDcI/FwBfvZX3375d09Cl3jokuEy" +
                                          "GTsSYCICi/DQRUdxRCUIG7KsyDx0l6soMqMEhmAbac43D90dGporRHGgHCgp" +
                                          "G4x9JcjXPNTcRSmTLYilyAsOxFMNxZb3306rtqABWe89lHUrYTsbBwJeMABj" +
                                          "gSpIyj7KKctw5Qh6/XGMAxmv9AEAQD3rKJHuHSx1yhXAAHT31na24GowEwWG" +
                                          "qwHQ014MVomgB25JNNO1L0iWoCnXIuj+43Cj7RSAOp8rIkOJoNccB8spASs9" +
                                          "cMxKR+zzberNH3in23V3cp5lRbIz/s8BpIeOIU0UVQkUV1K2iBffOPiwcO/n" +
                                          "n9mBIAD8mmPAW5jff9fLb3vyoZe+uIV57U1gaNFUpOia9DHxzq++Dn+ifjJj" +
                                          "45zvhUZm/Oskz91/tDdzNfFB5N17QDGb3N2ffGnyZ4unP6l8awe6QEJnJM+O" +
                                          "HeBHd0me4xu2EnQUVwmESJFJ6Lziyng+T0JnQX9guMp2lFbVUIlI6JSdD53x" +
                                          "8negIhWQyFR0FvQNV/X2+74Q6Xk/8SEIOgse6AR4rkLb38NZE0EjWPccBRYk" +
                                          "wTVcDx4FXiZ/CCtuJALd6rAIvN6CQy8OgAvCXqDBAvADXdmb0FYRzCi2krn4" +
                                          "buZZ/v8DzSST4/L6xAmg4tcdD3AbxEbXs2UluCY9GzdbL3/62pd3Dhx+TwMR" +
                                          "9CBYZne7zG6+zC5YZnd/GejEiZz6q7PltsYDqrdAEIP0dvEJ5md673jm0ZPA" +
                                          "a/z1qUxxSR5V9+cvJwHeE7dOue0s3sk8x0nABe//L9oW3/33/5mzeDRrZgR3" +
                                          "buLmx/B5+MXnH8Df8q0c/zxIMJEAHALE7kPHg+26+Mii7rjqQN48pFv6pPNv" +
                                          "O4+e+dMd6CwPXZb2kvJMsGOFUUBivGCE+5kaJO7r5q9PKtsIuroXvBH0uuN8" +
                                          "HVn26n4GzIQ/fdRkoJ9BZ/0LufnvzGHu+h74nQDP/2ZPZolsYOvKd+N78fTw" +
                                          "QUD5fnLiRASdLu1Wd5EM/5HMxscVnDHwk4z/0b/+839Gd6Cdw6x86cg+B5Rw" +
                                          "9UgmyIhdymP+rkOXYQMlU9bffWT0K899+70/lfsLgHjsZgteydqMY7CtAQd8" +
                                          "zxeXf/ONr3/sazsHPnYyAlthLNqGBDphvksBSVTDFexcIY9G0H2mLV3Zl3oG" +
                                          "di3A2BXTruaqeg3Yp3PWMqvsblN9HkeAoyu3cNcj2/M16UNf+86rZt/5o5dv" +
                                          "8NTrFTMU/KtbC+VcJYD8fcejqCuEOoDDXqJ++rL90ncBRR5QlED0h3QAIje5" +
                                          "To170KfP/u0f/8m97/jqSWinDV2wPUFuC1msgnwY6WDz1UHQJ/5b37bNZ+tz" +
                                          "oLmcxyaUy//aLTt5WN95qIiBB3a89//Dh77ywce+AfjoQadXmQ8DDo5oi4qz" +
                                          "j4BfePG5B+949pvvz20Csufs6ce/9XRGtZYv8Hje/kTWFLYWy7pPZs2bsmZ3" +
                                          "30wPZGZi8mw3EMJo6MkG+AiQc0vdNnWMAsMB3rba2+Hgp+7+hvX8P31qu3sd" +
                                          "zxPHgJVnnn3f93Y/8OzOkW+Gx27Yto/ibL8bcqZfdWDKR263So7R/sfPPPWH" +
                                          "v/PUe7dc3X39DtgCH3if+sv/+cruR775pZsk5VO2t++UWVvaWzb7K7+yYaOL" +
                                          "z3SxkGzs/wazhVJaS5PEUekqrJo10PPUVNJ6vZRHBMdaTsb1YGFOaJcvSFN/" +
                                          "3ZEoXymjolM1VblEVeO0blr6sj2ZsouY9MxJ3WN42J/7TXFG6n2LGPc1oxc5" +
                                          "flPwLA8MthueuzE6RqvZrbX6VA0N0bgalZRqWxi7VTlV0pFcr1VRp44W07SI" +
                                          "2PKiTBV8s9lC0/nCKht+rcsWu8KCXiZsUrdGUuLatUlQqSND1ewUKAv2e4hd" +
                                          "0VJfx7usYAxnxWIvtPsp18CoCeuYBO2QlirwWiX1Ny7Hdmim3jFpgeoy1JQz" +
                                          "FxWxb9GNRjSjLQPtxULR4cJie9TApWBaafamjsGgzbbctTaTWThHeG208Znu" +
                                          "BpMb/akuEKtJQtM21a0QEyq2U9bauBS2GNpOPQkd1Q85Uy5r/gzDPKOQcKOm" +
                                          "GzHzvq6EqtA1u3V51E6XbTzhJ+sULw+HMJ8kCeuW+KXhjlthGhVnLkNbywLj" +
                                          "6BMfn7RTxIc3FILivuUuigOp5DUGUals6m1PphbjKtqTZyJuBK0N7/fJiVAU" +
                                          "5BZrJYuKhk061ciKnWFXKM5ngc/PZj2zXJHgQYhhUmVVjAja4Ht6iR96hNfv" +
                                          "D9u6hdjrPh45joKG0/bcYX0ybmBkfT3fUJXISwb1gWz6C7TfBZ8sg7IoUf2i" +
                                          "g6MlortuS2NWFNuq7ttIabCRmM0qmtl1yu86idyKtOVgkjYVFl/Px6N2tblp" +
                                          "r0bUQlhKyLgws2Y8Y4qdEcxNG42gUWwnWuQoQiRoNbJV4RcggIamW940isRo" +
                                          "M2777lgbCC6+EWcbs1JaDvrtYSklOryl41hkY/iSYTV8zpq+wZM9ZoLbPN/y" +
                                          "dKWXylwqLpVRRzQoerHE040+luvzWtMPMBJJK/NFKhDSpsHPU8XuLqkBZ3p8" +
                                          "b82QymbQsmKxylXtUoIQankm2alKloUR75gp3ubL40FJXaCzdbJC20tCMCeC" +
                                          "v6T0Gh6G7YoUVgVkaBtJw8FntiEai1pTWlXhFW8X4CqxigYuwYwsN2gXKcQo" +
                                          "tzvcQl9E7FwtDZzF2kH7jumTDr80iYVbmlLDZpUx6YVLlcRN6gzNck/gpunM" +
                                          "KZBojGtdMmq2UxWPO6zLqlXJG2AmallTUljg3YRu8L1RP+1oMo2EDj6fT3pL" +
                                          "u0kMa4lVMsWJakg9ozdso4nAzCWzshQmZmwK1oLqIzXE6iuzpoZavYJjSK4z" +
                                          "xNbJhF7MZcElB3RLNjaCIXGNhImNZnHTDatdsdieOXyZSavA1YRESoPaylov" +
                                          "WBQE2wKvh1aZWPTCKYJHlouVys0F29JVk1r1MLIb+IXGuIEtS6IPQq8G61Yp" +
                                          "CshOHDozH+FajrSMuQJRwodLnKOrieQEXRqGw7k60mtuTcE9GRuvFW+QrGfN" +
                                          "iiclsTXVZW1SrYqS0KhGiIt4tZqy4poaQva8toYWMbFON8rEXGvPNXs6WnUD" +
                                          "xFVVNUYbNmcLNV2jC7FtedPyGkGMTaNVnGI9pGjbvU5noGLkyGxjsDcclTyN" +
                                          "HTp0Ra+WEG6G0vNa2I8FqrPCYbtMLcojqeKE42AVLu0Z0py43WHAObRVIUal" +
                                          "IeamTsoXxgUGK3VKnFzTbF5fxw1NmVPDhRaUsaHdECyuatarXIRW6zjCjAZe" +
                                          "YMI+veywI7gQqOKGUQpUMZBKE7WVKlFacDQtqW5meDGeyx3WbLitehxVJ66D" +
                                          "wlK6UuuG2sWWbElnfd3Gy7OhGi88RdarS5vtumPUB9nf4Lx2UegWtFkodxJ2" +
                                          "wSynS9itNK1630tdSuylLt9tk1oEU2SnvHKCAmf0g8JmVYS5gIeVQme9GRXX" +
                                          "MoZXi9O2Pq5hSHE12VRn2Ezi6tPyQO26bhQV16LNtjfT4WZNSWW2ySzFpoQ3" +
                                          "tWk5aqKsOO72El9DUG6yalmVZWkYOlZRZbsp4tmF1mLqLGlHamg8EYOAFe3y" +
                                          "xNLE+hCri9SCZKUlL/uEFxeY8qqscaLbsJ0mBTyVGZK43Md7FYxzwzrm4aWC" +
                                          "xM17+pxeNVt8E92oHYo1EaOw6WOFqNIlFmQY1kGWRMhFY74kWqQ6WbKwqI3w" +
                                          "IJ4iTsS1FVXnEtgXuVUaLKcVfkMEwwLeEgpdrblWEwoYuFBcw/UQKZAG4y7K" +
                                          "Y3bcLhM9JLA8a5AS0dLCisJ8tRK5zWamejRj4tORJlUnGhstErDDR/3qpOcQ" +
                                          "mJ30BmTJCKkSawep2Yq1OjwcTfs9tkrK0bQ1mKsUrqvlKkK486ijcIg9hkXC" +
                                          "TbGaOdNnc07sYGJpOPeojUsYErHCmVIBiemNw2pdTwyQmmoVXHVlVZjeumWM" +
                                          "velkrqyI8TyatVvkiF5W9AiulfvygAjq/LhAmn7bQpesj4eLSdNZE3zSW+PF" +
                                          "YZ+R1VAeOpTTcbpeG8f02bSydMJmI+h51YSIB21dbtKqQKBxPVIKYk2p9D2G" +
                                          "xuGA3yQBozstdk1w4YKG2zWeRuthtWhr1UmD5gqMNeboVtEhpiWt6bSkmsPh" +
                                          "el2YhcE4cuT6KuimiktsQrdQb9asFVVDmhgIONQChkYIMamXx+umSG56q860" +
                                          "jMcNj+yyAeNKpJSSHQqvp53+atZzY72gFpY+Ua5wBYsR0bWW0KhbwhY1xq9V" +
                                          "+61NtMLpeOmsxmuzurYng4kY1hux5owssyzTMG3yrTXcGc3qq6Ypu+yMcou4" +
                                          "2SUN3iDlpc8Y9T6n1GtLetT1q1Ew0Zr0BHFMoaR3OVZYzrReUStQzriEUQN9" +
                                          "ykQWJSxKI5yZb1hespFuONIZmKzDbEFp+Gus1SpGoSjyCpyinTInrMKwJjX9" +
                                          "hUdOfbLolCWk4zhAcWu0JXntdeQvfSFhEKyN14gavhoxSglZCiBEysXRphyJ" +
                                          "GOUuFW4UmKrkwMa6p3nSvDbEUGmkVXpVpNRHyO6MnmocgU1omm52Cp1hC2xB" +
                                          "cDQlhpzsF8XavLYUIo5IVQRkFziuoBMlmqy0EtpYERbXRkZd3lxjgoOKPZHV" +
                                          "u50o1CY8FocTBiSVlhezHd1oB45klefUuFuhpy7F9KopIVsgJzfRyToqN1YL" +
                                          "vu+OieUYo8My3aeTjRexJQGpdwvqHGkXA2487xirQlvtNZMyWydATDAFFjWT" +
                                          "CizXA6amGFZlxC2GvjhuREOtFFBJMfBtzjFAcl2pnUoBWVF9FB0K9UFfXwPg" +
                                          "3pjWS41kMFz7YWgQC5TlCuUADZx1VZmrbiWB8TpRIUl7wuoLmRghAVkPJxXS" +
                                          "l+ImJrHtGdEfsaEXDQV0ZIBPZYSIRbg+8ycGgfa4tFVQpwJWkwq1VbrZ1BvN" +
                                          "Ir/ZGH4j1V1/6jIBYaOpHlQdohexZbK07Fm2pdqSh3rtUSCbBbtbSxATSzjK" +
                                          "naPWnC7JdNHmOVcJgmZ1HA1ra2VoF4n6BC/0eMMvDEd9pmA7xSppEMP2cEk1" +
                                          "aYYhCKFFKDz4grRjTuV6ETpXBkgFfN/qeAUbYD7Xxav1dtlDsdRL21qjkR1J" +
                                          "yB/sVHhXfng/KNqCw2A2gfwAp6HkdgtG0DlBDKMAHJkj6PxBFXm7+nXVq71i" +
                                          "AXbTApmyUtxotxMIvm5IIeXJytCLQyUri2VFln3k0veJ3Ad71THU8veJiuvg" +
                                          "ZH6wcHY2ffBWVeT8XPqxdz/7gkx/vJidS7OlCKCGyPPfZAPS9hEFnAKU3njr" +
                                          "M/gwL6If1sm+8O5/eYB9i/6OvFB0Q/1uAF3IMEfZXcXBncTrj/F5nOQnhi9+" +
                                          "qfMG6Zd3oJMHVbMbyvvXI129vlZ2IVCiOHDZg4pZAD16w8HdkxQ5DpTDdd/4" +
                                          "sPC5a59/6soOdOpoKTGj8OCxwtwdqhc4gp0tsH+fcCHSA299OHK0SgfUekfm" +
                                          "o/eB58f3Cs75fzZ7j5+1r04OPf0GF945iJnJnsMG0BsOC0S4Z2dl20zrV6au" +
                                          "k9dTBNHOneO/Lz1e/Ny/fuDyttpgg5F9Mzz5ygQOx3+sCT395bf/x0M5mRNS" +
                                          "dkNzWPI6BNuW/e85pNwIAiF38eTn/uLBX/uC8NGT0AkS+JiRKnkdHtqrH2dM" +
                                          "bb1wq2Pr2FxeYATLXtSUaFuk3vex6+t622rrYb6QX6l6cnShfODagckuZoP3" +
                                          "gOfJPZM9+UOZ7NbCpbeZe1fWxBF01ghbjh9tcqC3HkmFOJgTPc9WBPdQ7NUP" +
                                          "IXY+WNp79vs/KrFP5FAn9i335G2S3YGZD3JchvSLt9HVL2XNz0fQqwVZvgH7" +
                                          "Zoo7tfIM+VBr7/lhtVYGT31Pa/Ufvday1/flAL9+Gy08nzXPRdB9geJ4K+UG" +
                                          "RWTTHzwU+sM/iNAJ2Eb374iySL//huvl7ZWo9OkXLp2774XpX+W59ODa8vwA" +
                                          "OqfGtn30WuNI/4wfKKqRC3F+mz79/O83gUlv5igRdBK0OZO/sYX8LZAMjkNG" +
                                          "0On8/yjcJyLowiFcBJ3Zdo6CvAioA5Cs+6ns3uTIFrln/Fx9d7+S+g5Qjl58" +
                                          "ZNtqfoG/vwXG2yv8a9JnXuhR73y58vHtxYtkC2maUTk3gM5u95yDbfSRW1Lb" +
                                          "p3Wm+8R37/zs+cf3t/w7twwfOuIR3l5/890gzzmZ56R/cN/vvfm3X/h6Xvz/" +
                                          "P7GLcJtZIQAA");
}
