package org.apache.batik.ext.awt.geom;
public interface ExtendedPathIterator {
    int SEG_CLOSE = java.awt.geom.PathIterator.SEG_CLOSE;
    int SEG_MOVETO = java.awt.geom.PathIterator.SEG_MOVETO;
    int SEG_LINETO = java.awt.geom.PathIterator.SEG_LINETO;
    int SEG_QUADTO = java.awt.geom.PathIterator.SEG_QUADTO;
    int SEG_CUBICTO = java.awt.geom.PathIterator.SEG_CUBICTO;
    int SEG_ARCTO = 4321;
    int WIND_EVEN_ODD = java.awt.geom.PathIterator.WIND_EVEN_ODD;
    int WIND_NON_ZERO = java.awt.geom.PathIterator.WIND_NON_ZERO;
    int currentSegment();
    int currentSegment(double[] coords);
    int currentSegment(float[] coords);
    int getWindingRule();
    boolean isDone();
    void next();
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1471109864000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAL07C5QU1ZWvez4M858BBgQZBAY9EOxeUaNk/A09jbTp+cgM" +
                                          "w8kYbWuq38yUVFcVVa9nGgwmmrMLSVbiGjSaVZKzQUEXP8cN+4sactxFTcQ9" +
                                          "fjYRs0HU7MZPPMrmuMmu2bj3vlfdVV3dXcP8lnPqTvX73Hfvfffed++tx+EP" +
                                          "SIVlklaqsRDbYVArFNVYr2RaNBlRJcvqh7aE/O0y6bc3vNO9PkgqB0n9qGR1" +
                                          "yZJFNypUTVqDZKmiWUzSZGp1U5rEGb0mtag5JjFF1wbJAsWKpQxVkRXWpScp" +
                                          "DhiQzDhpkhgzlaE0ozEbASNL40BJmFMS7vB2t8dJrawbO5zhi1zDI64eHJly" +
                                          "1rIYaYzfJI1J4TRT1HBcsVh7xiSfMXR1x4iqsxDNsNBN6sW2CK6JX1wgghWP" +
                                          "N/zXJ3eMNnIRzJM0TWecPWsztXR1jCbjpMFpjao0ZW0nt5CyOKlxDWakLZ5d" +
                                          "NAyLhmHRLLfOKKC+jmrpVETn7LAspkpDRoIYWZ6PxJBMKWWj6eU0A4YqZvPO" +
                                          "JwO35+S4FVwWsHjXZ8L7vn1D4xNlpGGQNChaH5IjAxEMFhkEgdLUEDWtjmSS" +
                                          "JgdJkwab3UdNRVKVnfZON1vKiCaxNGx/VizYmDaoydd0ZAX7CLyZaZnpZo69" +
                                          "Ya5Q9q+KYVUaAV5bHF4FhxuxHRisVoAwc1gCvbOnlG9TtCQjy7wzcjy2fR4G" +
                                          "wNQ5KcpG9dxS5ZoEDaRZqIgqaSPhPlA9bQSGVuiggCYji0siRVkbkrxNGqEJ" +
                                          "1EjPuF7RBaPmckHgFEYWeIdxTLBLiz275NqfD7ov23uztkkLkgDQnKSyivTX" +
                                          "wKRWz6TNdJiaFOxATKxdE79banlqT5AQGLzAM1iM+bsvnb5qbevR58SYJUXG" +
                                          "9AzdRGWWkA8M1b90dmT1+jIko8rQLQU3P49zbmW9dk97xgAP05LDiJ2hbOfR" +
                                          "zce+8JWH6ftBUh0jlbKuplOgR02ynjIUlZpXU42aEqPJGJlLtWSE98fIHHiP" +
                                          "KxoVrT3DwxZlMVKu8qZKnf8GEQ0DChRRNbwr2rCefTckNsrfMwYhZA48JADP" +
                                          "diL+rULACA2P6ikalmRJUzQ93GvqyL8VBo8zBLIdDQ+B1m8LW3raBBUM6+ZI" +
                                          "WAI9GKV2B1qmNM7CI1RPhaMZBpTSZC8sHWPIk26GUN2M/6+FMsjxvPFAADbj" +
                                          "bK8rUMGKNulqkpoJeV96Q/T0o4mfCjVD07Blxcg6WDsk1g7xtbnjhLVDuHao" +
                                          "2NokEOBLzkcaxN7Dzm0DHwBOuHZ13/XX3LhnRRkonTFejnLPcKNcwn9UIal5" +
                                          "JxM/crJOPiE//Mol/3rwL+4eF0q7urQ798xb9D896tBtb/2es+j2z7h2RRGD" +
                                          "8swfDB++b3Hkivf5/LngypgEqgdeotVr1nmWiPbtFT14aAfvuodTHwdXVP5z" +
                                          "kMwZJI2y7f4HJDVN+yi44GrFyp4JcETk9ee7L2Gr7babYORsL12uZduzvhaZ" +
                                          "r3JvObzjaHyv4+rTxMfMh63he3U+PGtto+F/sbfFQLgww3e9ie86khSKgbce" +
                                          "oWbzW9878Ltbd18KoouRijEkHaTS6IzrTuMp82eH71pas+/UN3Bn0UjLEekq" +
                                          "1CPvziDll/cZ97/24rsXBknQOTgaXCc+SK/d5awQWTN3S02OWvabFKX8y3t6" +
                                          "v3XXB7uv4zoJI1YWW7ANYQSclMSV/E+f237ijZMHXg3m9LiMwWmdHoKgB14s" +
                                          "fpAyoEzRJFVo+PxP4V8Anj/ig8LDBuF5miO2+zsn5/8MsL65fdGrE5F4T18U" +
                                          "yFrh2AUGVX3pIYv1mkoK+Buz3f663hvlPW29vxLWcVaRCWLcgkPh2wd+ftML" +
                                          "XHpVQxDZ9Wd33RVGdZgjdiiBsBHBRRnL1+o89IR3Nb+x7b53HhH0eE3MM5ju" +
                                          "2ff1T0N79wkvJA72lQVnq3uOONw91C33W4XP2Pjrx3b98NCu3YKq5vxjKgpR" +
                                          "2CM/+98XQvecer6IPyyDEAQWmecoUYdpSjvQtWVufXnpvc9K95ehnpdbyk7K" +
                                          "9TjAtYM7xPz9EFx3fq3hyTuayzYGSXmMVKU1ZXuaxpL5NjnHSg+5NsiJKhw7" +
                                          "tflHjWIksMYwhPOHVdtK7JYr+kzId7z6Ud3AR0+fLnCP+UbVJRlC3E0IzkVx" +
                                          "L/R6+U2SNQrjLjra/cVG9egngHEQMMpwjlk9Jhw3mTwTtEdXzHn9x8+03PhS" +
                                          "GQluJNWqLiU3ShgownHPRiG2HIWTKmNceZXwPONVABr52UG4hrbme6kQPOts" +
                                          "L7WuiJfCl/Oy7V385xoOz0fwJ8Kc8fUCBOsQXMjZvoiRajTJrp6BaH8PtqwX" +
                                          "YkZ4NYJuYevXTIbU9Tap631IDeDLlimQGo91lyB1YAqkRmxSIz6kBvHl+imQ" +
                                          "eu2Wjs7ipN4wSVLD8HTbpHb7kMrJoZMjtYb75C0bYpHitA5Pktaz4Nlq07q1" +
                                          "NK2Nb+JLanK08vOjY3MJSrVJUnohPAmb0sREZpWeHKV1W2PdnYnoQLQ70dPZ" +
                                          "WYzasSlQq9jUKhNZ1q6pUNvd050YjG4uKttbfKjN+C3GSJUE57QJ7g/2L5fw" +
                                          "ipVdkTJB57u0VOrIz7kDt+3bn+x54AI853DilYCQ6cb5Kh2jqgtVA2LKC7q7" +
                                          "eLLsRKm/rL/z7X9oG9kAh1ScNANpaUnFIwwihD4G2S7igqy6FiMJp1RzjqtU" +
                                          "gzUmU5dpMm3SUiUbG0uVPkZNbGdkvgtD9sjEkHpN6QjES/qzt723uP+K0Rt5" +
                                          "qFMQ+MdJNc7sxXJKrmyyzCNVL8qHug4/f/W58p1BXkkQ4XZBBSJ/Unv+gV5t" +
                                          "UpY2NecIh+iuIGzxSCshrzlHOpJ4alcb3wUnB0EMyz0Rfc2wbqYkFRfIirUa" +
                                          "DlJ93GnxhPeon6QFnm22zWzz2oyj4QWqG8zZyW5bUU1yrnPIQxKvQnKCUm/b" +
                                          "osHWKsOKNKRSjJr+0LDqgiO/2dsoYi0VWrLbsHZiBE77WRvIV356w+9aOZqA" +
                                          "jEUkJ2xxhmFlAvFv4DYp7Ah/389b7y3a910EdzFSL6dNSOxYHx1JwR9u9Y7B" +
                                          "3z2Re3KjLWjAtGNZcX6jKYPx+HLn3y/8wWUH95/kKYdgY2/h9qn29qnT2r58" +
                                          "aTghbGuRlIIHwCKY/WLNsR9Z3/+PJ0RkXSxh8dSpDh2skn+ROvarrIu6NMfQ" +
                                          "EqR/OTybbIb4X0YGZrJ0EkkPKXK2KDNLmNFPryrtr1zS2//gyhe/vH/lmzxk" +
                                          "rlIs8IngYItUCF1zPjr8xvsv1y19lPuEcvS/3KF4S6uFldO8giiXfQOCx4Vu" +
                                          "XsLVQLx/zvV+BeS2SR2yXOpVDvwZzRSoDD+YBeIA4Zr45EQ6mDtlK1WqjYi6" +
                                          "3eUIjhgO/qCYxH8vYnY+xqsJEVXXqJSlEPpEHUrRQ7nSNXQWp3SvoJQvVpxM" +
                                          "zucFRa3E7TN+4tP3AoJjjFTISKlgzGf4vxQ6C2x40HD5lbw94LMO+2B8BcHB" +
                                          "iRzaoek5NEFjKS+Vso06NQteCn8/kltyMa6wDJ7z7CXPE35k6zStHaal8GDR" +
                                          "zQ544yFF1pHMFmoh5b9BcGpCM4VwQJfYZK30VNZK3ztDK0Xwo5yFvl1oofjz" +
                                          "xwie8TG5UxzZ2wie9VHc0z59v0XwIYLjghKfsR9PyaRO+mD8bwQnJjKp12fT" +
                                          "pDRbv7UZNCkXi4Fyn75KbPwU2B+hbCtkHoo2sjktvsQ47AfILLBfi33N8Og2" +
                                          "+/ossd/k0zcPQS0cWIrVCS59ItOcM6TrKpU0H+Pk8qqbBXnxvgZ4DFtexizJ" +
                                          "a6VP3yoErQxSIgiHikmofExXko4gls20IHjhvXglvsX7SSXEv8DnCqpTEozb" +
                                          "4UFE4vr2IdbgUvGT5qU5XxkI84aLJw5PcNiFCFAVA+tBPel2yNtxSqDFEW54" +
                                          "IuEWp+iqUnLGzsv4GgjwWAhciaAjbx9ynMyErm306dt0hpIrdrIFogi4lGKM" +
                                          "VIFz4wWWgnIJz2xcn+3f7D67Wt/W2yTSIJ9ihXfi7cr+4z/5uOHWYl83+ZUP" +
                                          "e6p33onXytbVsLZv8iJHLguoiZMKC0diKabk9RGOS1T16ye0jgWOdfDlc8aR" +
                                          "Ve0GdyAOXSi7/vxvH1mBJeTMgv75q2uvPSXYXT6BnBJyLJXoO3Ji92d5kt8w" +
                                          "plgKE7ePxIWflrwLP9kvzu15F2GKSjIhv/PY7c8tf29gHr/hIISGDG2yywWf" +
                                          "t40jwI0jSEQyvCSPJ5sOXpdIyC+sVS6p+rdXHxKslcr/8ud86b4/Hn9318nn" +
                                          "y0glZGxYV5JMmoxpjIRKXSFyI2jrh7dOmNUeJ/ViNpzD2V1AbWjOteaqS4yc" +
                                          "Xwo3/5xXWLKrVvVxam7Q01oS0S73VLbShuHuFZnl1PXqFpOsPQPh5Xi3TzUM" +
                                          "CUDu9Y424nc9dyfE6fMi8Y6+vkT/F3qjiYGOzbGODXFu8P346RW0tqS39sno" +
                                          "typqMiKZSWGXD3w6d+VVC5//HLfLQsHNtLC47704475QQTLT9vSmn6ePI7gW" +
                                          "Ad61CWxHYM2ep8/49O2c4hk5jmAHgpvByY9K1mhET3J9vnzasrvNT3a38DXw" +
                                          "7csIbkXw1cnJzvlAsRvOd03C79wTCvFrPn3fOEMhOgvzEGO3I849CL6O4M+R" +
                                          "JJ0pw1y4501bmN/yE+Y3+RoI7kBwJ4J9Uxamiycfgu716fvLaQvyHgTfQXAf" +
                                          "I3OFIDtUdWZk+X0/WX43J8vvIfgrBAdmz6gf8un76yka9SEEDyM4DEbNdHG7" +
                                          "s4hLd3VMR55H/OT5GILHETyB4AcI/naWdfOH/ilIa/41LdNMGxBLRTMyNbDe" +
                                          "xFE8NW0V/kcETyI4CknduKSwmdHeZ/2k/UxOe/8JwTEEz82s9rqF6U1dVV0b" +
                                          "4UQeLz4Ju57mA16eTmqCVeTASwhecZietmBPnJlgf4bgNQSvz4IaO5XDwIvY" +
                                          "djkn7Y2JxPnmtNX1JIJTCN6aQZm+c2Yy/XcEv0bwbrYaycj8Yhds8WPhooKr" +
                                          "/eI6uvzo/oaqhfu3/Fx8EMpeGa+Nk6rhtKq6L3q63isNkw4rXBC14rswL3cE" +
                                          "fsPIUt8LwKDv+Ienee+LOR8ysqjUHEbKALpH/yfwWGw0jLRrQ9mRH4Pb9o5k" +
                                          "pIL/dY/7PSPVzjgIQcSLe8gngB2G4OsfIGwOFI+XyYKJ9tt1E2NlyQyzKy3+" +
                                          "g0ZCfmz/Nd03n/7sA+LOKgTtO3ciFkjM5ojP9RxpWUEq7MaWxVW5afUn9Y/P" +
                                          "XZX9cNokCHZMb4mjgeRBsBMDtWax59qi1Za7vXjiwGVPH99T+TLk1teRgATZ" +
                                          "0XWFt4szRtokS6+LF15kzCZi7au/s+OKtcMf/iJ7jTeQf6PbOz4hv3rw+lfu" +
                                          "XHSgNUhqYqRCAWXP8GvPnTu0zVQeMwdJnWJFM0AiYFEkNe+WZPE8ty4vz2Vk" +
                                          "ReEt0gnz2ro4qXFaxM74pro4wWmxtxJhpzggcDdA7xLxLsPI5nJENritR4t4" +
                                          "NRLF2cE6/opv9f8Ht/7s67o1AAA=");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1471109864000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAAL18C7DkWHVYv5n977KzH1hgzS7sB6ilYdQtqVtSFmP6o+6W" +
                                          "Wq1WS91Sd9tm0L/1aUktqdVqwRIgTiAmfMpeME5gy04gMWQNNhWMkxQJjit8" +
                                          "AjhlQiUmVQGbcpWNCQlUijhlEpMr9Zv33rx584bZ2fWr0unbuveee86555x7" +
                                          "T99z39PfK90YhaVy4Ltb0/Xj83oan7fd2vl4G+jReZqpcXIY6VrLlaNoDN5d" +
                                          "UB/+rXP/+0fvW9x1pnTTvHSv7Hl+LMeW70W8HvluomtM6dzhW9LVl1Fcuoux" +
                                          "5USG1rHlQowVxY8zpduPdI1LjzIXSYAACRAgASpIgBqHrUCn5+neetnKe8he" +
                                          "HK1KbyntMaWbAjUnLy49dCmSQA7l5T4aruAAYLgl/y4CporOaVh62QHvO54v" +
                                          "Y/j9ZejJX3nDXZ86Wzo3L52zPCEnRwVExGCQeemOpb5U9DBqaJquzUt3e7qu" +
                                          "CXpoya6VFXTPS/dElunJ8TrUD4SUv1wHeliMeSi5O9Sct3Ctxn54wJ5h6a52" +
                                          "8duNhiubgNf7DnndcdjJ3wMGb7MAYaEhq/rFLjc4lqfFpZce73HA46N90AB0" +
                                          "vXmpxwv/YKgbPBm8KN2zmztX9kxIiEPLM0HTG/01GCUu3X9FpLmsA1l1ZFO/" +
                                          "EJdedLwdt6sCrW4tBJF3iUsvON6swARm6f5js3Rkfr7HvvY9b/J63pmCZk1X" +
                                          "3Zz+W0CnB4914nVDD3VP1Xcd73gV8wH5vs++80ypBBq/4FjjXZvPvPkHr3/1" +
                                          "g5/74q7NT53QZqjYuhpfUD+i3PmHL2k9RpzNybgl8CMrn/xLOC/Un9uveTwN" +
                                          "gOXdd4Axrzx/sfJz/Odnb/24/t0zpduo0k2q766XQI/uVv1lYLl62NU9PZRj" +
                                          "XaNKt+qe1irqqdLNoMxYnr57OzSMSI+p0g1u8eomv/gORGQAFLmIbgZlyzP8" +
                                          "i+VAjhdFOQ1KpdLN4CntgWdV2v29PAdxSYcW/lKHZFX2LM+HuNDP+Y8g3YsV" +
                                          "INsFpACtd6DIX4dABSE/NCEZ6MFC36/ILVPexJCp+0uITGNAqa5xYGgqznny" +
                                          "w/O5ugV/UwOlOcd3bfb2wGS85LgrcIEV9XxX08ML6pPrJvmDT1z48pkD09iX" +
                                          "VVyCwdjnd2OfL8Yu3CgY+3w+9vmTxi7t7RVDPj+nYTf3YOYc4AOAd7zjMeHn" +
                                          "6Te+8+GzQOmCzQ253NPCKF9UfLkd9Hvsyh67k7sLqnCRKtDgF/3V0FXe/u3/" +
                                          "U9B91OnmCM+cYCXH+s+hpz90f+t13y363wr8UywDfQKm/+BxW73EvHKjPS5P" +
                                          "4HYP8cIfX/7wzMM3/fszpZvnpbvUfZ8uyu5aF3TgV2+zoouOHvj9S+ov9Uk7" +
                                          "A3x83/bj0kuO03Vk2McvOtCc+RuPziMo563z8m2FTtxZtLkbyLuYgNeA59X7" +
                                          "llB85rX3Bjl8flpM5d3FVOYknaeACzb18J5v/9pH/vJt78CB6KjSjUlOOpDK" +
                                          "XYft2HW+dPy9p9//wO1P/vG7ch+TW94NOdKHcuU4PjM55T8tBB/+oz/4DnKm" +
                                          "dOZwNTh3ZH0F0nv8iAfKkZ0rfM3dh7o2DvVcyv/tg9wvv/977/jZQtFAi0dO" +
                                          "GvDRHLaA55ELzf27X1x941vf/MjXzxwo59kYLMFrxbVUUIiK1TEGlFme7O7U" +
                                          "9u4fg7898Px1/uTCy1/s3Mk9rX2f9rIDpxYAk7pVILsXWsxQIE9Xdi60loDN" +
                                          "ZN+lQ0/c8y3nQ3/+mzt3fVyzjzXW3/nkL/74/HuePHNkkXzksnXqaJ/dQlmo" +
                                          "x/NyUEkBdQ+dNkrRo/Nnn3ziX//GE+/YUXXPpS6fBDua3/zP/+8r5z/4x186" +
                                          "wbecBct54aLASI9eQQ5H9kgX1Pd9/fvPE7//b35wmb1fqiUDOdgxcmcOHs4Z" +
                                          "eeFxX9STowVoh36O/bm73M/9CGCcA4wq8LbRMAROMb1Ep/Zb33jzf/2937/v" +
                                          "jX94tnSmU7rN9WWtI+fbGbAoxQuwA1oAf5oGP/P6nSltbgHgrsLDlQpd+alL" +
                                          "ze48eOB9s4NPMLu88MjF943i6ysK+FgOXr3Tz7z4mhyczwFUsF2JS7flOjYY" +
                                          "iuR4mL+p78Scw8dz0Nwp7+uuhVRin1TiFFL38gL1DEhlKPYKpNLPgNTWPqmt" +
                                          "U0g9kxdGz4DU0aTRPplU/hpJhcDD7pPKnkJqQc7s2ki9vXAykybVOpnW+TXS" +
                                          "+mLwSPu0Slem9a4/yQvytdFaOMQGfwVKlWukFAHPhX1KL1zNrKxro/R5EsW2" +
                                          "L5AiyV4YttsnUWs/A2qtfWqtq1nW6plQyw7ZC3OSP1G24VWpLVABQsCqB5/H" +
                                          "zlfy79trI+OFtqs+enEpFEE4CTz2o7aLFf1fEB/dNOxisGNEVn5iIoGjv/MQ" +
                                          "GeODcO5df/q+r7z3kW8B/05f3KbkrR8FEhV/4Uf3vz7/8vZr4+f+nB+h2Joz" +
                                          "chQPfM0CYax2wBJyhGgsBjGKfx0sxS8IemhENS7+MRWsVRtNqnMp0TN0gNfw" +
                                          "ZtMczZuNGUEOU30isw7UqBC2Mg7KqjnY4M5MkdYrBN9OxI4qijLhdc3NchkO" +
                                          "GEFUrK4tyOK8n40m5JTDVbaMRmBFSztjdUQY9oyPKr0JNphz3CBcrgfLNazY" +
                                          "SOIamigi2lTlcNfjVuNkiiE9IzEMQ9fK5Tgtk5xAia7jyquIbyszsRF2WHEW" +
                                          "wrzMNl2eVpPVApNJaFjZ1hUVSdghwTnmqlnxiFWXr27ndIfdBpOxuGrP+0tL" +
                                          "mmTCvBtUJ7WQ7CqVZSybNdrudKobhW5EUj8YpaLDT6VAUIP2whpl7UXgLMzM" +
                                          "lcmKn5FKQ2AZtNKkl52BgCVNOMY1OpQ3yrCWLaxq1qbqqN6j3W01pGbyLDNo" +
                                          "qkqjY35c7TXVSFxgqSUYgylfTVFrFaVtNmKbbD2S4Fa/Tk+rG9NcSBwLZVMa" +
                                          "0QesR/EZPaiMJV3lpCiLQT+7pdjBoBPYsl+ZSxUvrrW2w76btiXZYeY1jW1s" +
                                          "mcWyxzOMMez3W2V7GQZg4fYwphEFTtDmfWomzetcSjcHfUmy6/qk0kBnq3nC" +
                                          "DenNEKmVBbQjbqSoZ0/nOIMlXrWNpqwbdLsjtrWQezXKbqTkoLNwSFNjJmRb" +
                                          "iu2lINCmRjsbWUEmGsuLfdEz5kO2mvStlpyy3RQSrWy2bMv+VtMq88YUazHb" +
                                          "uTz3grlfJ2ZybUSsyv2ZOJEbYk3pddDOIl2nPd6KRL+xUatmK1GGntslxnFr" +
                                          "ZG+xTabaW9jg0e6GHdX6atAltFSozX2yLfPzFWWuZIFbcG6DUEZCV1xbptma" +
                                          "2VYlsnjRUZwQkLQi6Sppc+sOxjdlbqk6PbNDziSd0tIx02SsDMZq7MpoY34C" +
                                          "I+ssdhzGMdsjry9srWQ83fR5KauPWY225M4wbYz7qUZihCJ77mpca4y6TNYY" +
                                          "VK1BWYkST6mtFD3ha7gwoyfTLtHINL4rSU4DH1QVoqItx9WyTTk+Ho6Y0QTh" +
                                          "UCJTlhKhOQSWmg2uUmPaFg0vlKHBZ6pexmmpVzfi5mRRsV2lvw7coclX4K1n" +
                                          "UxN3HkwnKCyTK47u0i4TSwJJ4AbV61lcP/XFcIy0N+ncHYj9Nb6a9z0D75Kj" +
                                          "Sru14HlW2YRw2NKNseqwUWgMNrPFvIHidKPNaRZTDidMo9WAubrlyO6SpyfZ" +
                                          "iEC6yWrL4GLTx7MmQ2ntUblZXeKMhIRyszkZ1MtzSmpQRLcvws3qaskOsBZV" +
                                          "5bmFPJg3g7Ewb+FRT+IoB653Jyw8gOrlziCy04TrNBptxVb6eDgZdPvs2l05" +
                                          "gU/rIlEfQeOKjy6Nli22K1jTTVWzLrUjp2piaax49oIR2+ue7MOs75DDJpM5" +
                                          "KlBCrJ0tK+3epjlc9+ZVBJpOEWbh8bzje+OObnsMp/ZZdeMRE0p2a3Q6gNSQ" +
                                          "HnIWCUED34WQcMOUUb1TWWHrcIQReKoQbZyox81YgWA9Kttwhi1gnu+28Whj" +
                                          "tJvlsoL0HCsxahDjmdvAJFempvuxGFa9pWRxStwZV1G5YSRrXxv3NtpU5GqZ" +
                                          "M9jMaQreYgbao9siW95aKNoNO9sApVVy7BC6jjFwN8QUWZkN+Yipwuu5ts6S" +
                                          "hTwPEToZKpkt97YJWg7H6cAYLOrIQkcmZa4bx365A0WK0Rkx5maD6ISl43Vn" +
                                          "IfRNRdV9SckkAsdwJla0Kt73/TVv2aTTk8dCncrC8XoQ4LDew6qBHJWhCYs0" +
                                          "vcrEZkjdWVVbXJJZbdeF1DmBQTAaRtOm442GY1OettSy0Ie0mrwZSWMWESrw" +
                                          "UEpkpdOf4lskrifIdNrE1gma+cBVziQJa7CzkaC6A0GEyLIBI5hlzwe9qYks" +
                                          "CcYabKSl1vP7ZrOKRkbQ2PpkxtMd0S9zKYeKeMOzIcvEmXZz3aktrSFcziKv" +
                                          "BuGDiKnXDK0bkrUOOq7ik20nXMCNSVecIgE1S6pLx++Xm+sMMepAYonLSTCR" +
                                          "pIykijLfkhjVdLgFvNHKRjxgpr1AHKXtOSFpCMKLXW1u2pplNaNmr8nzHlMt" +
                                          "+zhB8QirlFNMqSG9Ra+ik8hgULPXsGFUxxUWIzZOQjcw2B2J3gpZD4fshqi2" +
                                          "EERCpxzM2WGKKATOttbIrL+qJandNwMebg2gMoFPR4mu6mGd4rbbNtkYSUtd" +
                                          "9SczLRDsZBRL4tqYekGiEn2ipi+8QFO2DtYnxnYjng2wlMsIspMixgpZbMdr" +
                                          "eZvNusJ0CdwB2AZM13IaMDXW9nqCWa6xkUX3FxssNtyeLVFONJhtFtywJ2px" +
                                          "H6NnYdnJKA3L6hMNafCVssF4La48UUSad1sIWaEyR0wZiK+XJ7DAjkKbsUMZ" +
                                          "UsUuoZue2SNHg0GwsV2HoBcbZDnejGNSm2Y9j0jxcgXhFkJ35K5pVlox1gQR" +
                                          "Fqa/8Xocb3XhHiWN+0tW1efTDTdkxUYzrMGTLroIlaVed0bcMI4YTFpbtNFy" +
                                          "oeEWExG8lvrDrGJsaLyv4sak1RxGo+nAnie+xcv2mA6DelPu4Vy82kxnzhxl" +
                                          "Z/R6pifTMaVMiLEc1JEq1dbbjGstR12fqLrbZnXWWDn8MhWorO40k55bBnX6" +
                                          "GpbsCLMCFt0IItPGe2Ml6CmYMwhpfz6w45mC1VoVZRb0rLhR45xYzlDWXVWw" +
                                          "VZXtw0BlaEb2+hU8GdozZEALoUhPPH/BNZZKJeLJeSDpvb5YlWBO82aeDxYM" +
                                          "rKJxc2mWyZHgjlaEPekv2Hl1VQ8mbKJVapWZ3UXX/ThWjL7NlltIV6AnZA0b" +
                                          "0ZgJwUzN2FiBqDljulnD1hVxGFIZ5rTjMqJ45bSGNii8hrQtd9Ya1VWl1l/A" +
                                          "9sqMxQbM9FvYCtMZJuL7SyhkoAybEn6XcBqLqqCyDTaQJ16H2mysRRvtwgJm" +
                                          "mattvWMN6KDKZ/YqnpjZZDmpacFgiQgTa6J0K2uRc+as0tWcxIzbRJQ7oICt" +
                                          "j2xSgFZZjIGVmCv3K3xcW3UGo/JAo1kVi9Ip3Q+X223WYkUGX/XWJgoZkFTD" +
                                          "g2pz6jgjdDpvNgUamnhJ2RRr8SSYwayuUouytaa6WSq0okWYub1hQKOyqyrI" +
                                          "ZuI1K+Rgm1V4Q4U3ymrmdHiDssKJ3HZpsOZ56YLTfa8+6nhLGM6kLIP9rY2O" +
                                          "pFUXz+ZbqaZMJtVt6HHUKO0nYNPQmiwhxQcrXT8a9tk+L9h0WK4w7ZVpDSFY" +
                                          "i/yZVRGlkFGi3txqkhgm8QklIrX6pkzIw/mqYZMTh4bTdLHsuI2kk6DtWYA1" +
                                          "FhCCEwq2RWSiWiG1rCMwdY0Vhumsl1bpDU+siRnWRDKY15G+zUjAB3TZuTqt" +
                                          "2/0Zl5Z7jIdsIXwjTXpEDXL6M82cwdCCWHkweMZwWMPlsblQumvepajeptWf" +
                                          "QRLDRjwxR6AyR1d4ZyqkC1wTwF4ZjhyvzA8TOQypdZ0dGCNyxUPD8VZRKAWd" +
                                          "VmbdeUhXSMfh+tM+3G+zzJLtcOE2jMNqJsAQZG4XOpT0IHeZpU7oUhFOeeaM" +
                                          "iietTjUDLhFPkyipbquEy61JNREgpN9Bhfq642pD3LSsqTEatlJUXE8jRhwx" +
                                          "KZQlYrmpC7DAw9vpMBDbyWae8YLfbpdnTZ1qoPMQrZGj+rIdu/2qtLJnVh3R" +
                                          "J5S9MIfQqjVLe3gy82bldBXRpDidrmjBJbmA7E1CfoR5AjsdSQEiJD49SsQg" +
                                          "HWRrtcPLCImNQegTc0jDp227M6aEvmtmXQNN0lG9BadopdeuucqGQJnBsAw3" +
                                          "8abaa1p8Jvu6U2PJjt0XymLkV+rsKNZbHg45brwdyPVNm8YyrDXlSKTm1DMh" +
                                          "7smyi3fbfDaqoegWxDBBb9BZ+ouaQjTVbtAaoOJmRBuzeR+piCyAWdzuV6Yb" +
                                          "v7btJG7V9w07SzdgFzDu1iZpNodBmRB7aiWrEQloR80Y21z0DTDf3Fbmh+Vl" +
                                          "G1c2I4+2+0EVNsYgmlASbDJnW87UQjtbD6v1FW4zgZvlhdKKnZ7vw5HtxEk0" +
                                          "QrGGQTFM07AQhMWHJlyG/CjSIKeSqdxIqKgSFYotoUZQ8VAd1MdhP5hUemXO" +
                                          "wVcrpTn10sSco+1OrKdWRst1kUPAyh+OgO81rZ7lLH2DTKeOj5puBFeonr1I" +
                                          "pqabRFNMEKZkgre91ioYk36moJMOiSYhTGmKOUm649pqUpumDoWjMkNvapzK" +
                                          "Wp1WpyE2ynGT0114y8apsGp3SKmGUmtSCsrWauIx3SxK0K5pb6TGQrXkhq2k" +
                                          "xNYbbMlwiVTqWlxZBFSohVTHNy3U7fYHItXJ0I0kmR5FZ3CqemXEwNp1TIoh" +
                                          "Cd6OBYomrMXUsDA1LKMZVFsPe9LMxZHyfMLp9QBBfG+6jRUxYuYJbtE9xlz7" +
                                          "1nzQb1U0qy8rDsF3h0J1XK1v9YptSkPNaLsqLvOiXulq28ZwKlgYlKRJr7ps" +
                                          "0vp4YCZYbQWvE06YzqbjetNr0luGnvpDhLYIWKs5Mb4JXLNPYjqXUpLhgu0v" +
                                          "RzhJtq7WOnC3L9jUIoG4GabisQETZi+EFhQldNtdeLvdSEaMVuwNVbEFcrRN" +
                                          "WgJH16LhNNCobasciUI9KIfatJf2I1cNIXyt4XUFhcDSj1Rxz9tWTHfeTWdi" +
                                          "jR4s/TSwKb4/FTpbCrbDBaYNl+xEp0FEyQZZGxarDUWyh7EurwR0qwLtRqBa" +
                                          "OpWYfigmYiovsVGl6gsVAUNERhEW6966M/fcKjdddYJhxI24RW1qIeNsMmhN" +
                                          "2sBfojDqqYS2Nci6MbDwWb2cOGOog6xsa9YdZkp32J521jiHoHVeqsQrASEi" +
                                          "z4+3wWpg9eeC1J22kU1dK4tiqwZBPcZgRlGPjZkWimEVFMVqo9GYGROJsPTq" +
                                          "OkdhptTQ6tWWlPZmA1gPcAglhrCKLpyavWz0zCBpbmdEv7pckGOEJhIPrPNh" +
                                          "wo4RGcHb0w2mRpTiTDdV1aOzxG1EfDLUKkgLbDDHraQTch5iDMnBYmgmGdkd" +
                                          "IkDRiRZTH6KDMk/TlWBT3aK1SlVZstCWLM+QMu9TmNPc0ChNTID0rK1qmGus" +
                                          "WjcSRh4l2545NkZTYMzIsEO144kmzZ3ytAJJUxSh8SShDDNsNrRlVjcNfO1h" +
                                          "9a0jEwJJtrcDtE0qrNbrYhG6YDREHPC1Wg8sELUuxfTI8baJNlQK8mRJM4Y9" +
                                          "yHIpGUKrjMYOummT4ceDLau09bRD4qxUESEHRENbCm05nrbuCxsQFehzCHag" +
                                          "STrUIZzejEkyw+GICFed+qSqiWIF2P5IZzKUXtewZaNa18fLVUvUxw1hs9DV" +
                                          "uaXHyybn0a5poIrJjoQkQyl5WJu2N1Qy02zHw2YwnXLeMmanVZqixy22Lo/m" +
                                          "y7IKz7bQVCWTirJRwpm8VW18ttAiXOIWvt8PIZ2qr5PMh3x5tTDWCNRJcXIQ" +
                                          "6F25zDr1cBH3V3UGWdURK2KdDRpOm60qiKE2DKKSRsRRkxhnNv12UqZ0T9fL" +
                                          "zJDHt9HKnvRIpd9ggh60NTZSd1OxGT4cEUu+h3IK4decgGIgbQZhnMCJmW1S" +
                                          "I1VgdBzsvZtwFx1GBtXdgEksT7ezPk3EcZWEWXc72mb9LVI2K/OWscwgFiiT" +
                                          "B2FRAwzbN8fxEFGtjmMPar7NEXwaSBNyhQ1kKRWlmmxMPGIGcdP5lFBB7N3q" +
                                          "zQcKurRNnQex0aAdS3JaI1ZWdS5jydS2Nl2R6xHEuDxmnGqs82ZjPK9MpU6M" +
                                          "Rhkf+45QLzOdas3JWnMLk9dQVB72Y3VgQBaN2WN9ZNQ5ZZihiwTE5mXXWE9B" +
                                          "1MJOFqvZim81pCmHdxPOG68rmTjSBxuN");
    java.lang.String jlc$ClassType$jl5$1 =
      ("9iS6M6g0rFmHdFi9LM05Eo+3aJLBosPrZFwxvQwOfXQ17cjpAEMDUAbxZhqn" +
       "9CLITFNtaw0sZVIGzEnNo0k2tGIejVGWZzqwStYhP0gIA+/FQF51zK82Go2f" +
       "zn96ffe1/SR8d/ET90HOke1iecVbruFX3/S0AePSLbISxaGsxnHp1oMkqN3o" +
       "R7InSvlR5wNXSicqzms/8vYnn9KGH63m57V5RxwgjP3gNa6e6O4RVOcApldd" +
       "+Wx6UGRTHWY8fOHtf3H/+HWLNxYn95dlYjCl2/KeXJ60dpCc9tJjdB5H+bHB" +
       "01/qvkL9pTOlswf5D5fleV3a6fFLsx5uC/V4HXrjg9yHsPTwZQfavqpr61A/" +
       "HPdVL5M/feGzTzx6pnTD0aSQHMMDx1Isbjf8cCm7+QAXE8tuixehvzl8cyzf" +
       "Ip/x0n3gcfbPfJzjZz6HOnOZMpw50L4P7E99WHrF4SF1y3ddXS2k/ujEWxbH" +
       "ErLi6nnazf899/Lqp//7e+7ancK74M3FaXj11REcvn9xs/TWL7/hLx8s0Oyp" +
       "eare4bH7YbNd/te9h5gbYShvczrSt33tgV/9gvzhs3nayA2RlelFWkhpX31z" +
       "oj5esP3RAn7sWN3TOfj1uHSnug5D3YsF3VzquySC+qGd/eOrna4cRVu8+PDl" +
       "E+TuT5B7XRN0KSt7Rav8mOrlVzatQla7LI6n/ukjf/C3n3rkT4rshFusSJTD" +
       "RmiekDJ4pM/3n/7Wd7/2vAc+UajvDYoc7XT/eK7l5amUl2RIFuTfcalU7gSP" +
       "uS+V4jMuOdeZx6aElmbqkCB2O0DLvCRPFR3IcWileXItwNIsGlxMm/ubHC49" +
       "6SzvJs1fA4MIgmCnj79ziq7+Xg5++2q6+qlnQ1eX+7OyfA50Nf/+mYMh789H" +
       "eCl4Xrk/5Ct3iiBd58yAbsvcgfhhA5SKpePipD9XqE+cYODefTk+UQjFkexX" +
       "071SIduvX02qB3uDm1zdM3fZp8Xx+1eC9AD/mV2niyfh9x4eXrdc39Nz53ux" +
       "bpdNafnnDxKwQWV6IqUf3lFaDHYymUU2wWtOnPejKvztU+r+NAffBBJTc0p3" +
       "jJ3S/M/S3eeXT2nznRx8/moW84Vnw2K8ffX1nkWLOcrK/zql7oc5+B+ATVOP" +
       "JbAlszyTX+/Slo+w+T+vg8078pf3gMffZ9N/jtj88ZXr9god+yug/1bUBhpy" +
       "krXdrPi+q8veIdc/ug6ui5fnwBPscx08N1zv3XlK3V05uDUG+1CwsJ+YDpL4" +
       "lnbA8N5tz5ThIs305LzT+44nEJ8vLpEEwbO1HlyatLMbo+D+wVMk8/CBb9p7" +
       "cfHipVf3TXmzB3LwUA4eAcqkr9ZyEafsnT0U4ouvJsSTKXpVDl5R4MrBK3Pw" +
       "2DEqnw19gU6pq/6EUrlsYcnb5kHoXlGCQYgI3EkR650euQlrEEkeuWLybuup" +
       "r/6HH5572y6B99J05OKW0X7X4/2+8Udn4dvjR99bRHwH+8xbQIQU5S3j0suu" +
       "fGOpwLVL0b39qtr8gkNtLoY/UOaLqnju6KoJqnJ5vPaS5OWThXBBpZYXhE9/" +
       "4x31Ipw5l1iRFevaeP8S1aXBzeENhscvuVh1opguqH/+yXd/8aG/EO8tbszs" +
       "JJJT+9p0t0b+zL6m7hWaeqZ0elCwT1ERi11Q3/yhv/7qd5745pfOlm4C2/g8" +
       "LpZDHYTAcen8lS6aHUXw6BiU2qAXCJbv3PUGC9BFweUTeM/B24PoOC695kq4" +
       "i0T1Y0F0flXL9Td62PTXnpajfeBYZL4OgqO1R8ONZ6IKbwFx7E8gvAPe9xeI" +
       "fI1ML8kZzDPWj1aC/ee9LaYhCBfGM468IDZ4qtFkyELF8lz+vXFhs+kpsydZ" +
       "rtaSQ21nNh/98a2PvP6FX/pbhdlcLqRnKJgre/xgR9/ROzb768j1eE4xB7Uc" +
       "EDkQcjB5Djznz55S9/PPcD2Z5+DncvAG4DQXcrRo+dqx3dczlUuOZk8ucOUl" +
       "JQfaTyiXw98WPwDWOU/Or1lcVUDOKXXLn1BAhwNDeSvrUFR2DvIrh3teTpIf" +
       "W8Y2/3bPdQtqnYNVgSsH+a9re/G1C+oIvacMlp1S9+brFlIhkTfl4Im4dOtO" +
       "SA3XfXbk9As5eOuBnN6Wg7/zHBja3z+l7l3P0NDemYNfzME/AIYW+4fJ3W+5" +
       "brn8cg7eW+DKS+/LwS89V/rzwdO3wg9eejkuDNcB2EaQqaoH+Y8NBYp/eN1q" +
       "9is5+NUcfBgEERvZip8dDftIDn7tQMN+PQf/5FnSsL1DvXhnMdjHrthg7x8V" +
       "Df759WyHfyMHH8/B04dMXbeAPnWpgD6Zg99+NlXtzCFHucmU6sWwn7maqP7l" +
       "davU7+Tgd3Pwr55FeX3uUnl9Ngf/No1Lzz/prnB+TvCiy/5Lwe5mvfqJp87d" +
       "8sKnJv9l91P2xdvvtzKlW4y16x693nqkfFMQ6saOyVt3hy9F2Lv3+3HpgVPv" +
       "MgOryj+K8OHf7fp8Pi696Ep94tJZAI+2/hLg8aTWoOX+bwEXW34FxM/HW8al" +
       "G4vPo+3+Y1y67bAdWIJ3haNNvgawgyZ58T+B7d7eyfu80j1Xm8sjB4iPXDG4" +
       "Gax3/2vigvrJp2j2TT+of3R3UxdsNrMsxwKih5t3Z2IF0vx86aErYruI66be" +
       "Yz+687duffnFI8k7dwQfmtUR2l568mkVuQzi4nwp+90X/ovX/rOnvlnc4P3/" +
       "QJUeXgJEAAA=");
}
