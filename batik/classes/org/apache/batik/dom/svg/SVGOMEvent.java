package org.apache.batik.dom.svg;
public class SVGOMEvent extends org.apache.batik.dom.events.AbstractEvent implements org.w3c.dom.svg.SVGEvent {
    public SVGOMEvent() { super(); }
    public static final java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    public static final long jlc$SourceLastModified$jl7 = 1471109864000L;
    public static final java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAALVXX2wcRxmfu/P/2DnbSWyTJq7jOpWcpreN2gCVAzRx7cbh" +
                                                              "bB9xasSF5Dq3O+fbeG93MzNrn10KLRJqeKlCm7YBqX5yVQlBW1Wt4IFWRpWg" +
                                                              "qIDUEgEFEXgsgohGSOUh/PtmZvd2b+8snjjp5uZmvvn+f79v5ns3UCujaJjY" +
                                                              "PMPXXMIyUzbPYcqIMWlhxs7AWkF/PoX/fv7DufuTqC2PdpYxm9UxI9MmsQyW" +
                                                              "R/tNm3Fs64TNEWKIEzlKGKErmJuOnUd7TDZTcS1TN/msYxBBsIhpFvVhzqlZ" +
                                                              "9DiZ8RlwtD8LmmhSE+14fHsii7p1x10LyYci5JORHUFZCWUxjnqzF/AK1jxu" +
                                                              "WlrWZHyiStFdrmOtLVkOz5Aqz1ywjvouOJU92uCC0VfTH9+6XO6VLtiFbdvh" +
                                                              "0jx2mjDHWiFGFqXD1SmLVNhF9FWUyqIdEWKOxrKBUA2EaiA0sDakAu17iO1V" +
                                                              "Jh1pDg84tbm6UIijA/VMXExxxWeTkzoDhw7u2y4Pg7UjNWuVlQ0mPnuXduX5" +
                                                              "872vpVA6j9KmvSDU0UEJDkLy4FBSKRLKjhsGMfKoz4ZgLxBqYstc9yPdz8wl" +
                                                              "G3MPwh+4RSx6LqFSZugriCPYRj2dO7RmXkkmlP+vtWThJbB1ILRVWTgt1sHA" +
                                                              "LhMUoyUMeecfaVk2bYOj2+MnajaOfR4I4Gh7hfCyUxPVYmNYQP0qRSxsL2kL" +
                                                              "kHr2EpC2OpCAlKO92zIVvnaxvoyXSEFkZIwup7aAqlM6QhzhaE+cTHKCKO2N" +
                                                              "RSkSnxtzx5561D5pJ1ECdDaIbgn9d8Ch4dih06REKIE6UAe7D2WfwwNvXkoi" +
                                                              "BMR7YsSK5gdfufnA4eGtdxTNbU1o5osXiM4L+mZx53v7JsfvTwk1OlyHmSL4" +
                                                              "dZbLKsv5OxNVFxBmoMZRbGaCza3TP/nS498lf0mirhnUpjuWV4E86tOdimta" +
                                                              "hD5EbEIxJ8YM6iS2MSn3Z1A7zLOmTdTqfKnECJ9BLZZcanPkf3BRCVgIF3XB" +
                                                              "3LRLTjB3MS/LedVFCLXDFw3CdwSpz7AYOFrUyk6FaFjHtmk7Wo46wn6mAeIU" +
                                                              "wbdlrQhZv6wxx6OQgppDlzQMeVAm/obhVDS2Aqm0+ND87NSKQFiRX+7/jXNV" +
                                                              "2LRrNZEAd++LF7sFdXLSsQxCC/oV78TUzZcL76pEEsnve4OjO0BYRgnLSGEZ" +
                                                              "EJYBYZlQGEokpIzdQqgKJwRjGcoacLV7fOHcqUcujaYgj9zVFvCkIB2t6y+T" +
                                                              "Ye0HgF3QX+nvWT9w/cjbSdSSRf1Y5x62RLs4TpcAiPRlv1a7i9B5wgYwEmkA" +
                                                              "onNRRycG4M92jcDn0uGsECrWOdod4RC0J1GI2vbNoan+aOvq6hOLX7sniZL1" +
                                                              "mC9EtgJcieM5gdQ1RB6L13ozvuknP/z4lecec8Kqr2siQe9rOClsGI1nQdw9" +
                                                              "Bf3QCH6j8OZjY9LtnYDKHEMVAeANx2XUgcpEANDClg4wuOTQCrbEVuDjLl6m" +
                                                              "zmq4ItOzTwx7VKaKFIopKLH9MwvuC7/95Z/vlZ4M2kA60r8XCJ+IQI9g1i9B" +
                                                              "pi/MyDOUEKD7w9XcM8/eePKsTEeguKOZwDExTgLkQHTAg9945+IHf7y+eS0Z" +
                                                              "pjCH3usV4QpTlbbs/g98EvD9t/gKuBALCjb6J33sGqmBlysk3xnqBjBmQcGL" +
                                                              "5Bh72IY0NEsmLlpE1M8/0wePvPHXp3pVuC1YCbLl8P9mEK5/4gR6/N3z/xiW" +
                                                              "bBK6aKOh/0Iyhc27Qs7HKcVrQo/qE+/v//ZP8QuA8oCszFwnEiyR9AeSATwq" +
                                                              "fXGPHO+L7X1KDAdZNMfryyhy3Snol6991LP40Vs3pbb196Vo3GexO6GySEUB" +
                                                              "hA0hfwjAW/6K3QFXjINV0GEwDlQnMSsDs/u25r7ca23dArF5EKsD2LJ5ChBZ" +
                                                              "rUsln7q1/Xc/fnvgkfdSKDmNuiwHG9NYFhzqhEwnrAzoWnU/94DSY7UDhl7p" +
                                                              "D9TgoYYFEYXbm8d3quJyGZH1Hw6+fuyljesyLV3F47YowzvlOC6GwyptxfTu" +
                                                              "as1Z8tMWdLjgN+KsCM+EnA9BWxcdYfVePdoIZBsQnt2/3W1F3rQ2v35lw5h/" +
                                                              "8Yi6U/TX3wCm4IL7/V//6+eZq3/6WZNG1Mkd926LrBCrzlCOusJGJLw21HCr" +
                                                              "VTcx/eWNdMfgxsO/kcBWuy11A26UPMuqyYrKFTdsSkqmzLFulWmu/PmC74dm" +
                                                              "nZGjFIxSy5yiPgNdpRk1UMIYpfwiPEzilBy1yt8oXR7sDukAjdQkSnIOuAOJ" +
                                                              "mJ53g+CNN1WaCOdBCRahZ0AKq2gmGhPq0wqs5fzYtoldOxJFV1Hs8lnih2XW" +
                                                              "Uw8T6PMbp+YevfnJFxW6w4NmfV1eY+FWrnpIrT0e2JZbwKvt5Pitna92Hkz6" +
                                                              "qFPXXaK6ifkJSGqJxHtjcMfGaqj3weaxt35xqe19SMizKIE52nU28ihQN2DA" +
                                                              "TA8y/2w2vNNEnrUShyfGv7P22cOlv/1e1qp/B9q3PX1Bv/bSuV89PbQJeL1j" +
                                                              "BrVC7ZBqHl447ME1+zTRV2ge9ZhsqgoqAhd4cs2gDs82L3pkBh5TO0V2Y/Fg" +
                                                              "kX7x3dlTWxVtn6PRhpdJk8sS4NoqoScczzYEmx6A43Cl7r3kV0yX57qxA+FK" +
                                                              "LZS7G20v6A9+M/2jy/2paajQOnOi7NuZVxTUPu/wCSUXZFx7xZCpqu6bKmRn" +
                                                              "XTfoxu3fclUpuIpGrMP19ZC/KhA4ESIlk+yonIrB+y/Y8KQzHREAAA==");
    public static final java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    public static final long jlc$SourceLastModified$jl5 =
      1471109864000L;
    public static final java.lang.String jlc$ClassType$jl5 =
      ("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" +
       "tOWGWYNt/fsP/e4Hf+vVb2WX/P8F+LwRtREcAAA=");
}
