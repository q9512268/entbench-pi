package org.apache.batik.ext.awt.image.codec.util;
public interface ImageDecodeParam extends java.lang.Cloneable, java.io.Serializable {
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1471109864000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAL1XW2wUVRg+u9s7Lb3R0gCtXGpiAXdiFBJslUtp7cK23bRI" +
                                          "4lZYzs6c7Q6dnTnMnGm3xRg1MeKLIQqCJvSphMQoEmOiD0pqTBTjJQGJikb0" +
                                          "UWOINCa+EC//OTO7MzttDU9usmdmz/n+//y3851/37yFyi0TdRCdRdk0JVa0" +
                                          "T2cJbFpE6dWwZR2AuZR8JoL/OPzL0I4wqkiilVlsDcrYIv0q0RQridpV3WJY" +
                                          "l4k1RIjCJRImsYg5iZlq6EnUolqxHNVUWWWDhkI44CA246gRM2aqaZuRmKuA" +
                                          "ofY4WCIJS6TdweXuOKqVDTrtwdt88F7fCkfmvL0shhriR/EklmymalJctVh3" +
                                          "3kRbqKFNj2sGi5I8ix7Vtrkh2BfftigEGy/V/3nnZLZBhKAZ67rBhHvWCLEM" +
                                          "bZIocVTvzfZpJGcdQ0+jSByt8IEZ6owXNpVgUwk2LXjrocD6OqLbuV5DuMMK" +
                                          "miqozA1iaEOpEopNnHPVJITNoKGKub4LYfB2fdFbx8tFLp7eIp06c7jhnQiq" +
                                          "T6J6VR/l5shgBINNkhBQkksT09qtKERJokYdkj1KTBVr6oyb6SZLHdcxsyH9" +
                                          "hbDwSZsSU+zpxQryCL6ZtswMs+heRhSU+6s8o+Fx8LXV89XxsJ/Pg4M1Khhm" +
                                          "ZjDUnStSNqHqCkP3BCWKPnbuBwCIVuYIyxrFrcp0DBOoySkRDevj0iiUnj4O" +
                                          "0HIDCtBkaM2ySnmsKZYn8DhJ8YoM4BLOEqCqRSC4CEMtQZjQBFlaE8iSLz+3" +
                                          "hnpeOq4P6GEUApsVImvc/hUg1BEQGiEZYhI4B45g7eb4q7j1wxNhhADcEgA7" +
                                          "mPeeWti1tWP+ioNZuwRmOH2UyCwlz6VXXl3X27Ujws2oooal8uSXeC5OWcJd" +
                                          "6c5TYJjWoka+GC0szo988sQzb5DfwqgmhipkQ7NzUEeNspGjqkbMx4hOTMyI" +
                                          "EkPVRFd6xXoMVcJ7XNWJMzucyViExVCZJqYqDPEbQpQBFTxENfCu6hmj8E4x" +
                                          "y4r3PEUIVcIXheC7ATmf9XxgKCdljRyRsIx1VTekhGlw/y0JGCcNsc1Kaaj6" +
                                          "CckybBNKUDLMcQlDHWSJu8BPJp5ikpqD9EsysJHsBCbGJ/YSPpPgJzfKy47+" +
                                          "3xvmeQSap0IhSM66IDVocKoGDE0hZko+Ze/pW7iY+twpO35U3Ngx9DDYEHVs" +
                                          "iAobBJGCDVFhQ1TY4CQ8aAMKhcTWq7gtDgQyOgHcAORc2zV6aN+RExsjUIx0" +
                                          "qoznIy8O69rCDxAM2Cxo4ZFReu67r359MIzCHoPU+6h/lLBuX9VynU2iPhs9" +
                                          "Ow6YhADux7OJV07femFMGAGITUtt2MnHXqhW8Amo7Pkrx278dHPuerhoeIQB" +
                                          "bdtpuP0YqsJp4DwsM4aqi+TlOLbqH/iE4Ps3/3If+YRTiE297mlYXzwOlPrC" +
                                          "ERbvbQw1Cx84fwFtGDrBaY0U1pw4q0a0SNmwyOPYvhzhCLKce+7UrDJ8/gGH" +
                                          "FppKD3Ef3FFvffPXF9GzP3+2RHVUM4Per5FJopXkDu7iYDHw8LYtup4cSpUv" +
                                          "ztZXrZ59/NswKvPRXi1kMWNrWnFH/+78qjRJRhU1XivGRioe2xnquuuiZaiM" +
                                          "P4T12xz5HXCD3408Q+Xi6ZftYajjv2VBSjz9UjuBWZeTYigCox+9BzK9FBqQ" +
                                          "MPqRfZCHIBL2F08/boChGg8H1ey8+CH7QTtA+Guc0nwoeFQ7l+mzfC1PSj55" +
                                          "/XbdwduXF0QhlfZM/gM8iGm3k1A+tHD1q4MUMoCtLOAemh96skGbvwMak6BR" +
                                          "BtK0hk3gtHzJcXfR5ZXff/Rx65GrERTuRzWagZV+zLsTuGNYFhqaLNBhnu7c" +
                                          "5dwRU1UwNAgHUdDdTSXuiubMdXjQdtqzlPz27L6h4wvbzztEBW3dzIy4zKE3" +
                                          "yRhmDmvFtm3DstoKuioGuu6svFR9Lz+jvsgIfg/ado/nN1ymGhQqD3FnX46y" +
                                          "ac68M++vfrfnwuxNQWBwLVJ+NNd4QrtNE09bneLB8Tfmei5/eaLiGsR4DIUw" +
                                          "cNCYr4tyWgZoAGzgmbG49yfD9z9A5UTU3fX69KNbM7//4O6LxK20PD4lX79w" +
                                          "6OuX2+Y6wmhFDE6NrpB8ElpCa++0PkLkSTOJ6lSrLw8mghYgvBiqsnX1mE1i" +
                                          "0H2u5CyCeYcnQuhGvq44C1cvnOCNi1o5mCYKdLe+vxlQKVPE3GPYusLV1EHt" +
                                          "ejMlDabLTDU2pQEBb6aY9VWLfU/Je1+s/+BkU6QfmLDEHb/6SstOc7Sr2+s5" +
                                          "xYQoigY+3Jd3LpdIKj5IaeGyqT7o3ixpB8PnGQptFmXQHCgDnv/8s9faX/sU" +
                                          "n4NmEBowS50hTvpExYW4EiL2FL4KG7L/Are/8g9zDgAA");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1471109864000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAAL1Ya8wj11me/fa+TbKbLbkoTdNcthLB7Te+jMc2W6Cei+0Z" +
                                          "j+3x2B5fgG7n6hnPfeaMZ+wShCpKIyqVSGygP0p+pQJV6UUICSQECkKgIiqk" +
                                          "ShU3iaZCSICqSM0PECKCcmb8Xbxfsmn7B0szc3zO+57zvNfznvPam8jFKEQK" +
                                          "vmdvlrYHDrUUHK7s6iHY+Fp0yHJVXgojTSVtKYrGsO+O8uzXr//n2y8ZNw6Q" +
                                          "Swvk/ZLrekACpudGghZ59lpTOeT6aS9ta04EkBvcSlpLaAxMG+XMCNzmkPft" +
                                          "sQLkFncMAYUQUAgBzSGgzVMqyPSg5sYOmXFILogC5JeRcxxyyVcyeAB55t5J" +
                                          "fCmUnKNp+FwCOMOV7L8IhcqZ0xB5+kT2nczvEPjlAnr3tz9x4/fPI9cXyHXT" +
                                          "HWVwFAgCwEUWyAOO5shaGDVVVVMXyMOupqkjLTQl29zmuBfIzchcuhKIQ+1E" +
                                          "SVln7Gthvuap5h5QMtnCWAFeeCKebmq2evzvom5LSyjro6ey7iRsZf1QwGsm" +
                                          "BBbqkqIds1ywTFcFyIfOcpzIeKsLCSDrZUcDhney1AVXgh3IzZ3tbMldoiMQ" +
                                          "mu4Skl70YrgKQJ6476SZrn1JsaSldgcgj5+l43dDkOpqroiMBSCPnCXLZ4JW" +
                                          "euKMlfbs82b/Y5//lNtxD3LMqqbYGf4rkOmpM0yCpmuh5irajvGBn+J+S3r0" +
                                          "T148QBBI/MgZ4h3NH/7SWx//yFOvf2NH84F3oRnIK00Bd5RX5Ye+9ST5fON8" +
                                          "BuOK70VmZvx7JM/dnz8auZ36MPIePZkxGzw8Hnxd+Mv5r3xZ+94Bco1BLime" +
                                          "HTvQjx5WPMc3bS1sa64WSkBTGeSq5qpkPs4gl2GbM11t1zvQ9UgDDHLBzrsu" +
                                          "efl/qCIdTpGp6DJsm67uHbd9CRh5O/URBLkMH+QcfJ5Bdr+nsxdAHNTwHA2V" +
                                          "FMk1XQ/lQy+TP0I1F8hQtwYqQ6+30MiLQ+iCqBcuUQn6gaEdDWSRKSUANR1o" +
                                          "flTxoMF2imGyDkrLevgscg8zt/P/vxdMMw3cSM6dg8Z58mxqsGFUdTxb1cI7" +
                                          "yt2YoN/66p2/PjgJlSPdAeSnIYbDHYbDHEOeViGGwxzDYY5hZ/CzGJBz5/Kl" +
                                          "fyLDsiOBFrVgboBZ84HnR7/IfvLFZ89DZ/STC5k90jxYH8//nId8z98/k7ey" +
                                          "NMLkqVOBnv34fw9s+dP//F85/v1knE148C7Rc4Z/gb72xSfIn/1ezn8V5i0g" +
                                          "QT+DKeGpszF8T9hlwXxWrzAdn85b/rLzHwfPXvqLA+TyArmhHOV6UbJjbaTB" +
                                          "fHvNjI43ALgf3DN+b67aBebto5wAkCfP4tpb9vZxYs2Ev7hvT9jOqLP2tdw3" +
                                          "HsppHv4B/J2Dz/9mT2aJrGMXITfJozB9+iROfT89dw4gF8uHtcNixv9MZuOz" +
                                          "Cs4A/MzI/52//5t/rxwgB6fJ/vre9gmVcHsvwWSTXc9TycOnLjMOtUxZ//QF" +
                                          "/jdffvOzP5/7C6R47t0WvJW9M8TQ/eCu85lvBP/wxnde/fbBiY+dB3CHjWXb" +
                                          "VGAjyjc/KIluupKdK+RZgDy2spVbx1KLcDOEwG6t7Fquqkfg9p9Dy6xyuNtB" +
                                          "8iCDiG7dx133dv07ykvf/v6D4vf/9K13eOq9iulJ/u2dhXJUKZz+sbNR1JEi" +
                                          "A9Jhr/d/4Yb9+ttwxgWcUYF5IxqEMKzTe9R4RH3x8j/+2Z8/+slvnUcOWsg1" +
                                          "25PUlpRt0DDNAgPu6QbMCKn/cx/fpcnkCnzdyGMTyeX/wA5OHtYPnSqC8+BG" +
                                          "+rl/eembv/HcGxAHi1xcZz4MEexpqx9ntcWvvfbyB99397ufy20Ck7L4q28/" +
                                          "8fFs1nq+wIfz909mr8LOYlnzI9nro9nr8NhMT2RmGuV5kpMi0PNUE9YWam6p" +
                                          "90wdfGg60NvWRxsn+sLNN6wv/ttXdpvi2Txxhlh78e6v/+Dw83cP9kqR595R" +
                                          "Dezz7MqRHPSDJ6Z85r1WyTla//q1F/7491747A7VzXs3VhrWjV/52//55uEX" +
                                          "vvtX75KxL9jesVNm7/LRstmn+sMNC67yHSximsc/rjSblpOJKCwLcSOqcXJF" +
                                          "KC5JMGv7ZnOmmi2CjewJ8GtKt1yRBQazF/NthCu1Ia66Y7fntp1KKixLPa3L" +
                                          "McOAZNcj3+gNPdoZmFTRD8bEeMUO26xpycXJdMD0SalAkyg6GA9qvS0A1KQR" +
                                          "R47qbFG3gKKbSr1aQiu1TWtjFseqQKqCahVZUSqOywort3waV6fJQig344VQ" +
                                          "Zz0OHfBbrshgSWCZpi3aEaWEc2ZdDIrCMDRVX6xM2bmNWSWBWZGswDjRfFk1" +
                                          "F3aA0+7Es4O00xcn0+mUMiwGw8hmGcOXQq8sBdIiFpxu3PT0OTYlGXaEj9VE" +
                                          "m8WDbiBS4xAkKqjXWzWdtHRnzRUjwwhNAaUt29k4ks0qQDQqFUuQg26rvypH" +
                                          "bbPK1M20JoLQMsqErgNzSbc3qIhWXHfBLQij21zgtZAwOuspydE9ecF4ijhe" +
                                          "b/WFz7YVdVgsrEbEBtQZeoF7yazvi8tJYpW52Sr0FAofBJwci1Uq7vW6jhl4" +
                                          "22bJlOiBT3t+3+3wIsuM+1633Y1ljJvrRFlXW3JaBy3Or2mMX4QGXRnu0AzG" +
                                          "OIuLAmpXI2NJMP2+ZRBDy4rGxUYAurTAetZctVal7pgQQ9zbyPhowXVUJY02" +
                                          "nYYhU8loEY0mha2fDsMNyeELECW9qGBoggG78ajuFVppnZuJ9cYsjViUX2K9" +
                                          "UtcwnMWKmsDTyqgfdALS4isEOe3yrhwTCcmI8ZzZpGErVPwiRQy8zcgSKG29" +
                                          "KprmxF1hg2KHoUhAWFKvvBm5TtRdzN06ZbD1udfDCG5AB2QgjEiMpHtguFgN" +
                                          "CbiL0HVzxG0LFcOFVXGA8XibnjT9SGSctYIak2WJoIdtk17MDQYjsOqypslY" +
                                          "UFuVkrRvGE1KoZfNmsNr2hSYJTDlC6bXX8SJ4Aw65cmGTOwtLs5mdmVWrk1W" +
                                          "SVT2PE+y6/FoppHVwVRhVVypjufsaupZUqFNFqOt16jXo+FWrlJ6Eiwdw/St" +
                                          "Ya2/ndBaP/Lbq8CSeylmDMa9DUNbvCi0VDydeT1RYWuz/pTtbWNlI5p0KpIL" +
                                          "NpgHFE/LQx+KOk7pvk7GuOGs6jSWbrCwwtMTRlSYmaGRtebY0aEpll1StVfC" +
                                          "RoiYtCSONcto2wm6KbJtUulHSqkrSSucVKyNTPS7E4rrKUOb6kxHbFwneNav" +
                                          "mpYfUA062kRsJyJIuc2i8xHv80t2q3c3WK1QSdeONhxJfpExRj0cZyjRU7pe" +
                                          "m6KLxsLyCgsN9ac1c14AiT+oVCeV/jJtUNSc7oiR2fRkAiKhxJYxLI3nGDms" +
                                          "S81e11DG06C2BNRyuBksO0pzICjlrYhL/YJAp9FqwqRFGAkus6kP8EZIUmmz" +
                                          "VyZTD1u0BC2G0VapNnrMlux4PPRNA7U5Ip41xI07KZu8ETUGCT6Hto7T2oAV" +
                                          "izVdc1q9drPNjCcAlHtuZxYY03rT8Wq8FablWl3t8LEWGp7GDAlZBX7MF+dB" +
                                          "xPoYlUQ9TArMwtgecHLQQU0a46MKWmH0wlwYm3S5UXPs+WybDGw+JGlBXsvD" +
                                          "pESmdUxPWqBNhYQ0L05KfoIFRak46jvJZsDP18bWILmuohVqk5Bi6+iy3Wn5" +
                                          "fpeq0Hql1VrrOj9rNdpbvlIoCx1x0sN4Lay2WM+fWVQMlU11kjo3B7GPKSN/" +
                                          "st6CxSxcVBtoP0q6a16YmSWrN+2HU7fVQQu1erASWMGYlGbmui2YnlZO3SCO" +
                                          "Y3MhmT0eG5fK6bbamZFUBSvWh4WZiS90MJdWq3VZJEarbWOyionpQhvPTVjD" +
                                          "pYUGse02WkQw7PGBoC/IDkNw5VaxjsoeabSX9U5J29QLZKc2HINmoR0rRTfx" +
                                          "tNawZhecrU6W+NGqWkVnspqo8axVHBq2vuihy17dhHuSVWoWQIcqBVhv0vNI" +
                                          "wA2ammM08Mhqy+ukJ1k4IRCgWzSsyhJ0tqwy04XqYqbrqJDi1XZIC+NY2E6l" +
                                          "5UIsbLloHLf785YRSFyfMNy4plTVRJiUJkm/uexMVEodj2axGcs9dbYaqiDY" +
                                          "2vy2XONwA0vW8nYLaGJaUbfMBtt26cpGMBzKWbeAU6Ei4HVj02vHMR6tW0ID" +
                                          "5qTVOloyOjwYqh7q9ksbp20MA6rScmcYvpEUvN4rFNZ6qLtJnPaHUyLhRLbQ" +
                                          "76vYMAR9utiQXY0j6mPd0cwqqkmc2Y4EjGImidIn5yEGNtPlwmu2t0tHbmON" +
                                          "jU41to1mdTKeVPQZ3uj25V4NRbEBzqXdcpGnMHtWayT4IJ6VC3M8cYwWReP9" +
                                          "0CfqtO3D3bxQ5C3OGo0HLG6PQi6pO0tjvlwTZhC5s5JDl8xipxxXyQ2pzRV3" +
                                          "GBvtdQC32pKydgdk3yx5VYecd1VOK6xTe9gVebrS5udxxIklugO0Vc+mJJkb" +
                                          "U5OyP6QJGZfmDXHK6ROU1UqFCC0Q1gQf6g5H0R0ZxUcRGCi1UVguRNV0PvTM" +
                                          "5bxQYdUK56tMd1VlJK29CcY1r2KmUALebQ990HJmww65pNw1Wo8aujRDo4mL" +
                                          "9R2a8JJRtWiM1z6dzqcYbUL/5LBuu8ahzVBD68vGllo2m1lpxfx41e3D+SHk" +
                                          "5E4LFrXZQPHHqOrS91oQIFckOQIhLP0BcvXkkm23+t4p/OD40PP+0zKehOWl" +
                                          "Jsm2djy2O96b3uHJTSEczMrcD97vnisvcV/99N1X1MGXSlmJm81EQSTA8z9q" +
                                          "a2vN3sOApPDMdfZqITsBPv6Oy87dBZ3y1VeuX3nslcnfHSAX9i7RrsKDph7b" +
                                          "9v5peK99yQ813cyRXN2dvPz8cwcgz//IVyCw+M4+OfpP7PhlgNz6UfjhMTT/" +
                                          "7vNqAHnqvXkhV/7d5zIA8vj9uAByHr73qS1owHejhpTwvU/pQjucpYTr5999" +
                                          "ugAg107p4Dl719gnyWaHJFkzzq4T7jH3qX/f/GGnlhOW/fuATNT8uvzIL3rx" +
                                          "7sL8jvK1V9j+p97Cv7S7j1BsabvNr1c55LLuhbAuP7lIf+a+sx3Pdanz/NsP" +
                                          "ff3qh4/d96Ed4NMI3cP2odNjOOnZNjR2duK/RTs+2GR3Yds/euwPPva7r3wn" +
                                          "PxP/H2dhnCTHGAAA");
}
