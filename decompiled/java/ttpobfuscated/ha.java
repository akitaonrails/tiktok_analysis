package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum ha {
    BlockStart(1),
    BlockEnd(2),
    CallBlock(3),
    Debugger(15),
    HostCheck(16),
    SchemeCheck(17),
    HasPort(18),
    PortCheck(19),
    HasUser(20),
    UserCheck(21),
    HasPassword(22),
    PasswordCheck(23),
    HasPath(24),
    PathCheck(25),
    HasFragment(26),
    FragmentCheck(27),
    HasQuery(28),
    HasQueryParam(29),
    QueryParamCount(30),
    QueryParamCheck(31),
    MethodCheck(32),
    HasBody(33),
    HasHeader(34),
    HeaderCheck(35),
    HasCookies(36),
    HasCookieName(37),
    CookieCheck(38),
    HasProperty(39),
    PropertyCheck(40),
    HasKey(41),
    KeyCheck(42),
    Sample(43),
    BucketConfig(44),
    Log(45),
    MatchKeySubset(46),
    HostCIDRCheck(47),
    MatchFieldKeySubset(48),
    ValidatePackageManifest(49),
    ValidatePackageStructure(50),
    ValidatePackageFileChecksums(51);

    public static final a b = new a();
    public final int a;

    public final int b() {
        return this.a;
    }

    public static final class a {
        public final ha a(int i) {
            for (ha haVar : ha.values()) {
                if (haVar.a == i) {
                    return haVar;
                }
            }
            return null;
        }
    }

    public static ha valueOf(String str) {
        return (ha) C08FF.LIZ(ha.class, str);
    }

    ha(int i) {
        this.a = i;
    }
}
