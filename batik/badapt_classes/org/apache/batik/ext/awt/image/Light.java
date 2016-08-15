package org.apache.batik.ext.awt.image;
public interface Light {
    boolean isConstant();
    void getLight(final double x, final double y, final double z, final double[] L);
    double[][][] getLightMap(double x, double y, final double dx, final double dy,
                             final int width,
                             final int height,
                             final double[][][] z);
    double[][] getLightRow(double x, double y, final double dx, final int width,
                           final double[][] z,
                           final double[][] lightRow);
    double[] getColor(boolean linear);
    void setColor(java.awt.Color color);
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1471028785000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAALVaC3QU1Rm+uwlJeIQ8eMoj8gi0IO4qrSKGIiEGElwgkBhq" +
                                          "QJbJ7E0yZHZmmLmbLCBWOceCnoKooNZizrGFohQfx9ajPT6K7SlCffSotEqt" +
                                          "+OIoilY4rY9TWu3/3zu7Mzu72VCS5Jz5M3vvfx//d//XvXcOfEYGWCYpoxoL" +
                                          "sPUGtQLVGquTTItGqlTJshqgLCzfkyP9c/XJJbP9JK+JDG2TrMWyZNEFClUj" +
                                          "VhMZr2gWkzSZWksojWCLOpNa1OyQmKJrTWSEYtVGDVWRFbZYj1BkaJTMECmR" +
                                          "GDOV5hijtXYHjIwPwUyCfCbBSm91RYgMkXVjvcM+2sVe5apBzqgzlsVIcWit" +
                                          "1CEFY0xRgyHFYhVxk1xk6Or6VlVnARpngbXqZTYEi0KXpUEw6bGiL8/uaCvm" +
                                          "EAyTNE1nXDxrObV0tYNGQqTIKa1WadRaR24kOSEy2MXMSHkoMWgQBg3CoAlp" +
                                          "HS6YfSHVYtEqnYvDEj3lGTJOiJGJqZ0YkilF7W7q+JyhhwJmy84bg7QTktIK" +
                                          "KdNE3HVRcOc9q4sfzyFFTaRI0epxOjJMgsEgTQAojTZT06qMRGikiZRosNj1" +
                                          "1FQkVdlgr3SppbRqEovB8idgwcKYQU0+poMVrCPIZsZkpptJ8Vq4Qtm/BrSo" +
                                          "UivIOtKRVUi4AMtBwEEKTMxskUDv7Ca57YoWYeRCb4ukjOXXAAM0zY9S1qYn" +
                                          "h8rVJCggpUJFVElrDdaD6mmtwDpABwU0GRnTbaeItSHJ7VIrDaNGevjqRBVw" +
                                          "DeRAYBNGRnjZeE+wSmM8q+Ran8+WzNm+UavR/MQHc45QWcX5D4ZGZZ5Gy2kL" +
                                          "NSnYgWg4ZHrobmnks1v9hADzCA+z4HnyhjPzZpQdPCx4xmbgWdq8lsosLO9p" +
                                          "HvrquKpps3NwGgWGbim4+CmScyurs2sq4gZ4mJHJHrEykKg8uPzQdTftp6f8" +
                                          "ZFAtyZN1NRYFPSqR9aihqNRcSDVqSoxGaslAqkWqeH0tyYf3kKJRUbq0pcWi" +
                                          "rJbkqrwoT+e/AaIW6AIhGgTvitaiJ94NibXx97hBCMmHh/jgaSXibwISRlYE" +
                                          "2/QoDUqypCmaHqwzdZTfCoLHaQZs24LNoPXtQUuPmaCCQd1sDUqgB23UrkDL" +
                                          "lDpZUInC8oPPaW0DHwMKZvRf13GUalinzweAj/OauwqWUqOrEWqG5Z2x+dVn" +
                                          "Hgm/KFQJ1d/GAxwUjBYQowX4aNw5wmgBPlqAj0Z8Pj7IcBxVrCisRztYNrjW" +
                                          "IdPqr1+0ZuukHFAlozMX0YxzUxub+AENPbPjRv2DeuP+N1/5+Ht+4nfsv8jl" +
                                          "uOspq3DpHPZZyrWrxJlHg0kp8L19b91duz7bspJPAjgmZxqwHGkV6Bo4UHBE" +
                                          "txxed+yd43uO+pMTz2HgdGPNELsYKZCawWNJMmNkYNL1CMGGfwt/Pni+wQdl" +
                                          "xAKhRqVVti5PSCqzYXjhGN+d1XOPtWfzzq7I0r2XCtssTbWkaggUD//1vy8F" +
                                          "7n33SIblHMh042KVdlDVNWYRDpkS8hdzh5gIn2H57aF3fvDb8tb5fpIbIqUg" +
                                          "dExSMXhXmq0QFuR223MOaYY8wAnHE1zhGPMIU5dpBKJBd2HZ7qVA76AmljMy" +
                                          "3NVDIllAtzi9+1DtnfoLmz8Z0zC3bQ3XInfwxdEGQNzAlnUYMpOh8UIP/N4u" +
                                          "H1p84MjCqfKdfh4t0PNmiDKpjSrcCwGDmhTCoobiYEkhDDrJa6BetMLy9AnS" +
                                          "E+FnN5XzVRgIIZNJ4OIgGpV5B0/x+BUJ68GhCgCEFt2MSipWJSAfxNpMvdMp" +
                                          "4Z6jRCgzKMgQVMyR8JTbPpH/x9qRBtJRwtNw/jJOJyIp59rlx9cpSKZytu+C" +
                                          "tk11DBScuAreDlek/FoNll1pUaRmlaLr+E/RlEuf+HR7sVBkFUoSSzSj5w6c" +
                                          "8gvmk5teXP1VGe/GJ2MS4TgRh01EpmFOz5WmKa3HecRvfm38T1+Q7ocYB3HF" +
                                          "UjZQHiqIbbE4qUou9hxO53nqqpBcwSBFsZI5HCy4Y3Go2vUx8Cd1phIFX9Zh" +
                                          "R+qZdWvkreV1J4SlX5ChgeAb8WBwW+Mba1/iOl6ARpjULJeJgbG6VreYrwV6" +
                                          "m2lZ8t7U+QQ3lb7Tvvvkw2I+3jTDw0y37rzt28D2nWLxRC42OS0dcrcR+Zhn" +
                                          "dhOzjcJbLPjo0U1PP7hpi9+GewYj+c26rlJJSy6Hjy8Hj1GpKIq5Xn1r0TM7" +
                                          "SnMWgGXVkoKYpqyL0dpIqs3mW7FmF6xO+iYs2DVr9PYQE6cbBgpQ3g28rgw/" +
                                          "LO84erqw8fRzZzhYqVsEd8RbLBkCnxIks7H7Ud6YWyNZbcD3/YNLVhWrB89C" +
                                          "j03QowyZg7XUhHAfT4mPNveA/L89/4eRa17NIf4FZJCqS5EFEibjkFKBa6BW" +
                                          "G2QKceOqecL8OwuAFHP9Jmkan1aAVnVhZnutjhqMW9iGp0b9Zs6+ruM81op4" +
                                          "eEnS/fBu6uEJ2O4n0Cv3k2qouZwrl/+utrUO/9W43kMQ9yM6BH7qVSj8uYz3" +
                                          "K3OSunlOmin3JELVVg0+9DvrFx8+LmwokxPwpOsP7iuQ34oeOpFQ7wVJXMYi" +
                                          "DBPhqbFxqRE5RmMf5ZOtVI8Gq2LNipzIVPupZ9TjKd17IRd6Xb+c/MqPuia/" +
                                          "x7W6QLEgbQC3lmGj5Gpz+sA7p14rHP8ID5u56B1tE07dYaZvIFP2hRz7IiTt" +
                                          "Yr0z+JZxKUkUPxBxovf+12f9Zd8dd3eKhc/idD3tRv97qdq8+f2v01wDT2Ay" +
                                          "+GFP+6bggd1jquae4u2drAFbz4qnbwwAUaftzP3RL/yT8v7oJ/lNpFi2g1ej" +
                                          "pMYwqW5yR7QQKUypT91Ai91iRTJdGucNBK5hvfmK2wnnshSHWyLWw0e4H4hn" +
                                          "8wAMOlU0SRVOAAxapVora8tk6zmgCfiK/juxyH7RFf89mtlZAooGybmuUSnh" +
                                          "G6BO7IIUPZA8DoHKeJq6cB/n6JORefLcw0zJ6LncKcZtWep+guTHIL+MMxWC" +
                                          "ZWG/Pd2BY8Eqw+XrU7wfb9Wcpce7kFwPW6ZW2IfjfjET6LkduiJMrR7JalHR" +
                                          "eJ4hR8zYE0dKsG4cPJW2v6zswziSz7nynVDgCgqu2IJ0U/dR5Oe8qi055ek4" +
                                          "w0vgofaUqXDx4T49Mqi0t7IppxL9PYRYNb5r32u/G8IS4A9JNnV7IIu6HUCy" +
                                          "m5HBCXWD/AaL9jjadX8/aFcR1o2Bp9FeqsY+1K48zpWXQbtsjRHQPdS9Zj3F" +
                                          "6ZNZcHsayeMu3Jbrnbylg9uv+wG3QqwbAY9k4yb1IW4uGBZyhkNZADiM5Hnh" +
                                          "pyBL1XmMXOtI//t+kJ7XlcHTYkvf0vfSJwLTUB6Y8OyOS8ebvJ4FjzeQvAJ4" +
                                          "WC48djl4/Lmv8eDHZJnPzUZ6c4kAv/wwjD7Ep9gJ6mIM3uiDLAh95ETx47zg" +
                                          "RM9RHMn7SD5EchIyEbouJonzuGsccI/3BG7mGX3eHc5IT/ExkHyK5B9ITqes" +
                                          "gyPJeULqnssXWeq+OkfknPE2OvD9C8mXSL62rRV1Ie0Uk++mXDcm7y0ZN0hv" +
                                          "rysRGXiWM0Rvw21K18t/+qLo5kypO79ts5t62x17M2fmYFZ+Oz+XSe48BkN+" +
                                          "ayEnnpB2e3PH+xKb/aE9WscIxzr48EnjSKh2kTtfhSoo9uWknoYkAAvL8REN" +
                                          "w6cNWfauEHdiDziF5dpouP6JY1su5zuMog7FUpi4+BV3rSNT7loT1wIVKXeQ" +
                                          "GZEMyycf3XZ44ieNw/jlkgANBWqIC3VdYRuHjxuHn4hd2NgUmex58CPBsPzS" +
                                          "DGVWwd+PPiRE627Pmdrmht3fvPzxpuNHckge7BJx/yKZFDZYjAS6u711d1De" +
                                          "AG9XQyvY1wwVrRWtNbEKqA2lydLkoS8jF3fXNz+WSz9JH6TqndScr8e0CHY7" +
                                          "y3PgHDMMd63YzZ6/Xt1okhnnAF5Sdju4kVKO+1BHG/G+wl0JieewqlBlfX24" +
                                          "4bq66nBj5fLayvmhaq6vBlT6Grr31llOEVYoaqRKMiPCLvd+O3DyvFFHruR2" +
                                          "mQ5cX4PFPeyJuOfWq5ee3jcxm6c/ixyYRvjKkExAMqnfPL3vO1nqpp1fjPRN" +
                                          "RcLfpoOTb5Ostio9wvV5U6+xuzQLdr6L+Rj4FkCCM/fN/P+wy3Gwg/iuSXhe" +
                                          "3SOIV2Spu/IcQXQG3ojNLnfgnIVkNpIKnJLOlJb1WLmr12DOzwbmXD4Gvl2F" +
                                          "pBJJ1XmD6ZIpy4RqstQt6jWQC5HUIrmGkYECyEpV7Rssl2fDckkSy6VIliGp" +
                                          "7z+j/mGWuqbzNOoVSK5DshKMmuniw5oMLt1V0Rs8I9nwXI0kjERCgttpH+1n" +
                                          "3VybfQtS5iBQi8fRZsyAXKo6LlMDz3x5F2qvVVhBgpf2Pp2R3E5JYX2jvR3Z" +
                                          "0DaT2suzzxiSzr7VXjeY3uNFVdda+SRvyNwIq6Kc4eZebE18HOqbkGx2hO41" +
                                          "sFvPDdhbkGxBcms/qLE/KbUPoyPZxKe2vSc4d/RaXbchuR3JHX2I6T3nhulO" +
                                          "JHcjuTdxDs7IAH4+hhebo9M+oxSf/smPdBUVjOq69g1x65T4PG9IiBS0xFTV" +
                                          "faXhes8zTNqicMmHiAsOfr7h+xl4huwfYsGc+H9uW/eJVl2MjO6uFSM5QN3c" +
                                          "DzAyPBM3cAJ1c+4BT+3lhPH5fzffPkYGOXyQdYgXN8t+6B1Y8PVXkCkL001P" +
                                          "kUf0tMSuj6cmd7upXBwTn8OG5Ue7Fi3ZeObyveLTMsjTN2zAXmAvli8+juGd" +
                                          "5qTtft29JfrKq5l2duhjA6ck7mdLxIQdaxvrKB1ZBaZhoN6M8XxmYpUnvzY5" +
                                          "tmfOcy9vzXsNttMriU+CDdHK9Ju0uBEzyfiVofSvGRJ7r4pp962fO6Pl87f4" +
                                          "nTpJu6H08oflo/uuf/3O0XvK/GRwLaiTFqFxfsV39XptOZU7zCZSqFjVcZgi" +
                                          "9KJIasqnEpm3toUpW1tGJqV/ANLjVrYwRAY7JWJlsu5usYFTYi8l0joRE3A1" +
                                          "QO/CocWGkdi+5d5ocPNelsGRiRN03zP8Fd+e/R/ZGInLKC8AAA==");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1471028785000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAAL17a6wkaXVY35nZ2Sc7+2AXvGYXlp21gIJb/ah+eY1N9ase" +
                                          "3dVdXdVd3V2JGer9fld1VRfGwUgJJBZrbC+Ok+CNIoHtOAtYTpAjWY5AkQ1r" +
                                          "bCKQZYMlgx1Zim2CAj+cRCGGfFV95947d2dmYWfIlerc6u873/nOOd8553uc" +
                                          "r174RuWOKKxAvmfvNNuLD5UsPjTt5mG885XokJw0aSGMFLlvC1G0AGVXpDf+" +
                                          "5qX/+e0P6Q+cq1zkKw8LruvFQmx4bsQokWdvFXlSuXRSOrQVJ4orD0xMYSvA" +
                                          "SWzY8MSI4mcmlXtPNY0rlydXWYABCzBgAS5ZgNETLNDoVYqbOP2iheDGUVD5" +
                                          "6crBpHLRlwr24sqT1xLxhVBwjsjQpQSAwl3Fbw4IVTbOwsobjmXfy/wSgT8M" +
                                          "wc/983c+8FvnK5f4yiXDZQt2JMBEDDrhK/c5iiMqYYTKsiLzlQddRZFZJTQE" +
                                          "28hLvvnKQ5GhuUKchMqxkorCxFfCss8Tzd0nFbKFiRR74bF4qqHY8tVfd6i2" +
                                          "oAFZHz2RdS/hqCgHAt5jAMZCVZCUq00uWIYrx5XXn21xLOPlMUAATe90lFj3" +
                                          "jru64AqgoPLQfuxswdVgNg4NVwOod3gJ6CWuPHZDooWufUGyBE25EldeexaP" +
                                          "3lcBrLtLRRRN4sojZ9FKSmCUHjszSqfG5xvTH3v23S7unit5lhXJLvi/CzR6" +
                                          "4kwjRlGVUHElZd/wvrdMfkl49Hc/cK5SAciPnEHe4/z2T33rHW994tOf2+P8" +
                                          "8HVwZqKpSPEV6aPi/V98Xf/N3fMFG3f5XmQUg3+N5KX500c1z2Q+8LxHjykW" +
                                          "lYdXKz/N/P7mvb+hfP1c5R6iclHy7MQBdvSg5Dm+YSshprhKKMSKTFTuVly5" +
                                          "X9YTlTvB+8RwlX3pTFUjJSYqF+yy6KJX/gYqUgGJQkV3gnfDVb2r774Q6+V7" +
                                          "5lcqlTvBUzkAj1bZ/72hAHFlBeueo8CCJLiG68F06BXyR7DixiLQrQ6LwOot" +
                                          "OPKSEJgg7IUaLAA70JWjisIzhTSGDQcMPwgGmg4iDjAw/wdHOiukeiA9OAAK" +
                                          "f91Zd7eBp+CeLSvhFem5pDf81ieufP7csfkf6QMEKNDb4b63w7K3MlSC3g7L" +
                                          "3g7L3ioHB2Unry563Y8oGA8LeDaIefe9mf1J8l0feON5YEp+eqHQZla62mvL" +
                                          "H+dBuzffOA6PiiBAlIFPAnb52v8zs8X3/df/XXJ6OpQWBM9dx/bPtOfhFz7y" +
                                          "WP/Hv162vxtEnVgAVgIc+omzHniN0xSueFaDIJie0K3/hvN359548ffOVe7k" +
                                          "Kw9IR5GaE+xEYRUQLe8xoqvhG0Tza+qvjTR7t3rmyKPjyuvO8nWq22euhsVC" +
                                          "+DtOjxx4L7CL93tKK7i/xHnwu+DvADzfKZ5iJIqCvX0/1D9ysjcce5nvZwcH" +
                                          "ceWO+mH7sFq0f7IY47MKLhh4O+v/ype/8DeNc5VzJ6H60qnJDyjhmVPhoSB2" +
                                          "qQwED56YzCJUCmX9+S/Tv/jhb7z/H5T2AjCeul6HlwtYcAzmOjBn/OPPBV/5" +
                                          "2lc/+sfnjm3sfAzmx0S0DQm8ROXUBSRRDVewS4W8Ma68xrSly1el5sBUBhi7" +
                                          "bNrtUlWPgMm7ZK0YlcN9/C/dCXB0+QbmemrOviJ96I+/+Srum//pWy+x1GsV" +
                                          "Qwn+M/sRKrnKAPnXnPUiXIh0gId8evoPH7A//W1AkQcUJRALolkIHDi7Ro1H" +
                                          "2Hfc+Wef+c+PvuuL5yvnRpV7bE+QR0IxvYIgGetgRtaB72f+T7xjH+TSuwB4" +
                                          "oPTNSin/D+/ZKd36/hNFTDwwDf7sX33oD3/uqa8BPsjKHdvChgEHp7Q1TYqV" +
                                          "wT954cOP3/vcX/xsOSYgpHLvffp/lHG2U3bwdAnfVABoP2LF61sL8LYCHF4d" +
                                          "pseKYWLL2DcRopjyZAOsDORypG4aOujQcIC1bY+mPfg9D33N+shff3w/pZ2N" +
                                          "E2eQlQ8898++e/jsc+dOLSSeeslcfrrNfjFRMv2q46F88ma9lC1G/+2T7/md" +
                                          "X3/P+/dcPXTttDgEq76P/8nf/+HhL//Fi9eJzRds76pRFrB+1G3xr/nyAxs/" +
                                          "/Os4EhHo1b8JJ/Qb82WNcaAktUmFmHcUyjM7mlElZkgQsmOMMIbY0E41q6cH" +
                                          "c1Ik28Pqjsd5x5k44qTfW80kpe96Y8+b8kYeYiNPn6tZVzDpRWvcZu2+qrJe" +
                                          "PAxiaEZ4hr1Bwk13sUoacCNP2hR46lyfbZJ5k2pst2oGwzIMr7draaYON9iq" +
                                          "v/G9zJtE9BKL5xMOC5LFgoixwF6QkR5ok36uWju6K8FrkhTpLjmGyAFWX4TU" +
                                          "asdPh6O+vTQ5neLDuraycpZfWZFnrvqTmT8VarPd3BmT4WLFDjcxhw24FTMS" +
                                          "+Y1Z61kCuaCGfYfBBjOuqRtmvN7gJpHS6XLXV/tij3W6NWajUdaaM7cSBdUj" +
                                          "TmkKfi8PtNyOOEJaGXGtPxxtqhmj7fDRRucyq5ZZrVnY4mzORRnf1cR1wC82" +
                                          "Q6M6XvvLYdoSMWPSgROhv3WG6G4xHdbc9SALZyJXjTdTbB4siLFQWwkyIzB1" +
                                          "xJqxw12dWlMsbnnUSpv3tEbfQ20fZ1sblcW5DVC6u9kOhmbDxhbkzCAxMuCr" +
                                          "G8uwR+1VO4DIna6npLPrIKLWni+smBiP5emwgXOMNJO6ARKp+W40WggMUVX8" +
                                          "bGaSlBYNtcUc9cwFv6i2AorBDMvgGS+amrXaaG5xsq2FDdb3RSYYettex5C1" +
                                          "VBpv5ssq2HZRXNinCT7iLd+PyQ4XIPPYgXsh6y2NLTGLxwy3NBCUinvpcDhe" +
                                          "UFlkLQfbdl9otjfeaqMwfRFJLHO2XqMoVc03XbYWbFy9E3JkX9P8JTnihnY4" +
                                          "kIVBy3HidOCjvXRZxRh3IQoKEbM42eaIcCBMMWVrBkyPSwcKg256U4Bi8soQ" +
                                          "SlmH6gQQI7gdaJVPHWgpbBmYmuMS0pyvpHVzgPAYzzexXd2aTFl3o600hMdD" +
                                          "T3RcK6ptuzo6yPsolCO4u9NNOuf9uUz3MyRzRG0lBx078qLJrOvj2zBIxr4f" +
                                          "NaYppq0w0XAQqO+w0i4Jo3oUIBqPOCRO4uFwZ421TkLnc3mhxn5L7fAjNAbG" +
                                          "XZsymxHNBkxXMPRgykjsgAtYL8OEyEYDaxUoeDXebdSGNSaZpRhUfWCUISla" +
                                          "QZh6C0iBUYFYtVBCx7TF1gArIrKLTA1xnXXbeq9PObgOm5rArg0xJVjG3gzr" +
                                          "8NwbLIOd33cEPEhzmV+ofW+CC3M+qiOTqUev4/kyoR2h35/LtQjgar16Yxla" +
                                          "g4k98Pkl4fY7Hk0Lq+oAT6kxv2XUWgNbgr2jm6cKasIzIUmD1TKYhcNVgDX5" +
                                          "egbJnItrDjwezcmaDGNoli7N3mbupWtEmKbN1NF6tB2gZpXv0GabkHoZsDEj" +
                                          "YnLgMaG5ImQ6CGtQlU8SCx+htpdT6+omy5dZIkLocEqLtMls6wMloaFpDW5C" +
                                          "eAwhrhptO6adzCI/aAx8nOb5XbgKM9LGtarldya1rtityUneFiOfpFFTc/gs" +
                                          "SHHM4lo9D1nivWGcZYoM7WSkkcwgn1rkdVyTMXo6nESbMd8X0tWUpJyptZlO" +
                                          "an0Kw1SwkKddA0rnsp2hY50JOC42mjTbD/LN2tSxKSTX1jM6Xql5HrSJalhf" +
                                          "92OwKRRXYGOpLQcwXNvuOqO222iwhGjjlF5F6mPgjgNuutowA99iO7qc602N" +
                                          "cOt4sy2MGup2IHZisan6hEgES00eZiy11tdOUJ2PEqZeb1AzYbPppKiLD2u5" +
                                          "jtEUsWzKfm9M9uQ6zrcDDm23UMc2qV1jyg0I20bj3OhCtUEMNloTJ+/w1bzf" +
                                          "EOeNNeGqaSYPsfk0R213uaH8md5ZEjQ8RRK85ncQyuwH6lhWdSSu0lPHGIx9" +
                                          "kw2lfooNHH3R9zzR2AwtfTAISaHVU2JqsuuiLjuERu60uc45RiMIfkoiM0LD" +
                                          "fK7Zq8IZ1FuSrQ6m9zUQiOM6xRr+imRRNZv61FamfIRvmUxfy8eUNueoHdMh" +
                                          "FyLt43DWBaEhJpk0nqawSc7IHeE3u6GddSWfHfO7OIH6sVWrDXqslKChMrAV" +
                                          "Cx55U9uu+UuBcWxhEkJDmLGHiQrhTDvietZo6bFszprNtCV1tK1jNWNlTdc4" +
                                          "TIExErCGLDRGr9aGvjOa5c2VMxYauCIxW9VpdBY1aN72pE2vgY+WJj/HjYAQ" +
                                          "xSESLL2kq2ezZsMNAr8npWxvFPFEE+/vkE0D8+rbZdbpyzVfJ0brLq8zUMDL" +
                                          "q60VKlyNRFh73ezrmoKKnVUvXUGUKNRgY2a3wNRkLiekQmoi1uJCZROmXMup" +
                                          "23wnbi+h+bxhi+3Fdru10joBNczFIK3uGu0wj+udQd1dTTKmj9RnbFWWQomB" +
                                          "eN2V9VluSqQ4oU2vuqzRdFv3gZVgSroxIaneCm2SZHct3Nx1cLOG+WMiaK7d" +
                                          "WlhdUG3WBTMbtuYsb7zxg92kKvtEEDWcVXvkjFrZDDI2UX3AhV16Mx+2JLGn" +
                                          "+fOGVu+EWgpPZh1ECYO0ozI5n+ubgIuGcocRJz2r72aEFbXx9lJubVa7KS9K" +
                                          "gwYMnJHTV2Gv0+2b1QaIMTtea6+XOo6qC8Shp1sFhSedLowojFBrTwkVGfFk" +
                                          "P2Cbw9HQEE1rNO4B21xh9flYUmaBIk06szRBRzhYlziW4NYElHM5nXeT2NQD" +
                                          "atU1ML8qdvmoBYUJ1al5PqIMXRZWe0krGZL1GeJW+9uGVQ+8hE9DG4aSOFzO" +
                                          "4O4KaVjUvLujWj0ceCFrdpJN3hg3Zmzi2jPHcBvkcMJxWhXqDrbhKOtAEyf1" +
                                          "rIxO/VlEt41k3kA8ZeaP5u2UI9fUxhj0aD0QR1nADJuMQ6lNfhZzRAcL6pOp" +
                                          "4ecERyc+312YY7nWJhi5tRYhCaYCOjEEOGuvWvPJUBPn/YbtYGYT83MoQtt+" +
                                          "DQlxukMMmkmz1avFw2pb3gj8lhjRdZ3J24SxiDdhNYdIPhsvrSWd9TJvq0K1" +
                                          "utrl5Y4sN5SxLsGGPGjEzLbbDsD8Can1bbWWDhZ1dAdhIxpqiZom18wgERQk" +
                                          "qcshOhJzJHDFNEWXghrndIOZwLtFZ9v2SNie+iOjrtUU06c2YKZp7pj2fD5e" +
                                          "7vxFt4Ya3ZrBLEgZS6Rpb9zUgfON66nrRjqLr3aTVVpVEBzRXRAQqZm9rLIM" +
                                          "N0PRTPA5LxQ6sdXKHa2vGmPYTLId3mZGaqfrxDaPeh62E51kybo61urN2gSx" +
                                          "pHm0M/DwsUIGLakHuy1yxijqREqrOdmauNJY4uOV4kNassCJCURR2arPrzCY" +
                                          "luu9TWcYpNA6XLZTVeyuJF9S2tYopVctflUnVFM1h4vWxJITg6RCpk0KNs4o" +
                                          "JKIznXwzrMrjCEMkmlzVt608SnODzdvuzuUGWl8LkjpBVpewzDRnSicwqs2m" +
                                          "YiFpdat5qrAMwGIUWSBdClTEbcL3swlwO2YzFZtho57AWIdgEbRLTl0OiJi0" +
                                          "8GV/5zTxXn+9GoDFxqRrmoK87sDCSGJqXr3nd0dKEG2g2hjp5P5qPRfjyGTw" +
                                          "OS2zXd5sjFr8lJfwSNgpVNIgxdAVd7bWTbZQijXmQSqim66F7MQasUISrMfv" +
                                          "dGvKowODauKu7u96k9raodazmIDhGLLI9tqW8MXG2qrVrcqS6WSx7LU2ndlu" +
                                          "xnYUcUsiIzNX5luURFZ9pCObNgJPnG1HGeA86dL5km9JiIVu4TQ1B+2h39XI" +
                                          "lkNQjcQYTFC92xwuMqSdawzVZXDKbbOD5lDSid1Q9BLSc/MEiySJgBs9rO1g" +
                                          "64aCS01iAQ8zC9+Nm70usQiUSNvRpLKcBG4UrVdKAM0s1XLpYX22HXT7HWfN" +
                                          "Tlr1kOFqhFJdWhDkrAeS095V+WlV34a7iMHWxoqqMtu0XhvXOjEMBROvae38" +
                                          "WbsbR824Vc9qbaquOpsRD81yaM0qSKdnTSFhN3Rdv1dXGjQOZWMRFobdVSQR" +
                                          "WR4inaFrsmO9bi1iVWc9r5usLNfbWCi6nXSY4RRMZ9OVKiRDXDYGuTECywMv" +
                                          "oVvkphYlzTyhPK09WvoGAvW4RshOF23bW9RSghuvlTnGD6ndTlIbax5BDKWY" +
                                          "bG1LQ6e9VUD0G5y8YRLczBLcRXS5PtWWjpI1O326F9E5O8C4VSpDNG0ww1a9" +
                                          "TTty6OgxWNLQeeYnU1yyNKXdIzN4N+ZHA7CnQ9lW0q7V5NpAQbHuer7bbmpp" +
                                          "yoXMKp6Kw3GA1u2dPLE8tmOCldF6mkMrNu+SeGsRuDIrhR2l2sc37V2D1vAB" +
                                          "RcmtxibnW/A6rnmW7rroqMnKZoJY3HgG1Xo4BmNQaldJQ1HSwO7Z6rqOIGLQ" +
                                          "ark9s6lOhN3W0YWgte3ZixYWho2abc+G3MYTAmZMGXR/spWhWWOw245GeAjW" +
                                          "Ys68Ka0RekQrOzKZqaugqSgNU8qcFgiQ2W7DbM2xNcxQKnBVetLYzmpu4Ps1" +
                                          "1aQZsDOYqL43W4jNWRQbXjfdcs1lC8qSfD6Rw9YEYkxkZPX7FKxOYRpKdw0s" +
                                          "1WAjYde60mBnBFdn/QQmpPl6jjU8czpxVc0lOGvqE2OXnMxsUqytJk5Yqw9m" +
                                          "eSoCu0SwrV0f+T2SBD44aPGEv0OYIIrncctczftNfEmEDmZthv3d0OfaTBTZ" +
                                          "dXUgWRZYBnCEDabFdg6ZsIOtkkDMpzOPY8fNQaSPKSdxjbTpUZO4xlWZqEN0" +
                                          "3XRNVC1zCFZycezjUM1tcDtRncds0+jNDTD589EOXY+91sSmBnkja47qwZbj" +
                                          "dLBUUOu0X2cawya5WdfNLdPgqwNhUY+SPM9AXAzb3NpUNo1kOuJkWYBYZrub" +
                                          "pkTQGkuIwivisNbBZ4FoYVldnyG1aLSlB7Je/O5JTgQHkyE8Fpe0t6PBBKfU" +
                                          "t6yEyDAjrEVJT5gGia/rRGvRcPXEnpG4ZCYLORtEbQLFEUjXFdHrUpCXsSoc" +
                                          "ObTcW3LmLGh1tVrWai4QGusSRo+tZqMFpwpgoKJOvpgGhgT2bQYazdSwrUOZ" +
                                          "jehJqm4iTIJw4LmwQnJ2nTJnrWTEUs35tCENcnRH96iGhJI1CUJ6C6hh6zTe" +
                                          "VHNVpa0NNlvv5vJGW087MQTm8E2H5tZW35pUqzXaWqrVmGITsyU5cjvx1710" +
                                          "4XZmWHOptEdGg1dm4m6rTBZUZC6m9RxdO+jWNjqQmWByMwABJa53STUcB027" +
                                          "Lie6ibYkq+3Ik4yYy0K2Dce9Gt8TeN2btqjOOnM2/tLd5ptm7Kgzadfd5uto" +
                                          "GsdUaCyh/kDGx10yqSa9Yb5TDc5T2S3GkO0Q8f1uq67OWrTdaauIu/BJMDNV" +
                                          "O55qe3CSqHBjVl1vxzDGpBPBWIyCUaZGXKO79uMZv2znfZ4NRiYn8ZrRHZOE" +
                                          "EAUuWKQ3Ym/pr2oxRgYcjE4nJhduUgbdtMkVaYPIl0Sb0WJjdOyq6THDBlqb" +
                                          "z+C+J60wSzagptz0JHqq2BHGGMy02sjpzkgGG3IG5jHCnYz7HRRF3/724siO" +
                                          "+P5OTR8sD7ePM52m3S4qqt/HaWF2sw7jyl2CGMWhIMVx5e7j1Ou+91PZnUpx" +
                                          "Cvr4jZKY5QnoR9/33PPy7GO14gS0aDgABGPPf5utbIFiTkhdApTecuPTXqrM" +
                                          "4Z5kZD77vr99bPHj+rvKlMRLMkWTyj1FS7pIlR+nxF9/hs+zJP8t9cKL2I9I" +
                                          "v3Cucv44P/OS7PK1jZ65NitzT6jESegujnMzYeWNLzki9iRFTkLlpN+3vEH4" +
                                          "1JXffc/lc5ULp5NWBYXHz6SA7lW90BHsooOr6ex7Yj300pOS0/kgoNb7ilF6" +
                                          "FDyXj/Kd5f+i9mG/gK/OTmzmJcZw7tj6mKOhDys/cpKK6Hu2rUil1i8vXac8" +
                                          "uRdEWynSgv/30tO1T/33Zx/Yn2vboOTqMLz15QmclP9Qr/Lez7/zfz1RkjmQ" +
                                          "igsCJ8mVE7R91vnhE8poGAq7go/sZ770+L/4rPAr5ysHROVCZORKmQauHJlv" +
                                          "wZRaii2UUDlTV2Y0fjI+neAr8X7ilHv148qdoufZiuCeuN47X+6g/nRPZcHm" +
                                          "eMzKQhY8h0djdnhLY3atdBdKrAvXk+Ki7CXiPom+LQHQ6dM3dslSx/t8yvO/" +
                                          "+tQX/tHzT/1lmbu6y4g4IURD7ToXHE61+eYLX/v6l171+CdKs78gCtHeZ87e" +
                                          "DHnpxY9r7nOUMt53rLpCy5X7T6X3tX3607rFHLwYGrKmwCyHjYB1utviYgsl" +
                                          "xKGRFVeBAJVeiXA15f//s7tSA1vf9/cW");
    java.lang.String jlc$ClassType$jl5$1 =
      ("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" +
       "mv/wY7/2/FfLDy3+H7ructXaOgAA");
}
