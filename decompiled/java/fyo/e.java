package fyo;

import X.C786410Ut5;
import X.InterfaceC1467950oIr;
import X.InterfaceC1470080oMI;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class e {
    public int LIZ;
    public final int LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public Map LJ;

    public e() {
        throw null;
    }

    public String toString() {
        Object[] objArr = new Object[4];
        objArr[0] = this.LIZJ;
        objArr[1] = Integer.valueOf(this.LIZ);
        objArr[2] = Integer.valueOf(this.LIZIZ);
        String str = this.LIZLLL;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return C786410Ut5.j4("domain:%s, code:%d, internalCode:%d, description:%s", objArr);
    }

    public final int LIZJ() {
        if (!this.LIZJ.equals("kTTVideoErrorDomainHTTPDNS") && !this.LIZJ.equals("kTTVideoErrorDomainLocalDNS")) {
            if (this.LIZJ.equals("kTTVideoErrorDomainFetchingInfo")) {
                return 1;
            }
            if (this.LIZJ.equals("kTTVideoErrorDomainVideoOwnPlayer")) {
                int i = this.LIZ;
                if (i == -499988 || i == -499987 || i == -499986 || i == -499985 || i == -499899 || i == -499898 || i == -499896 || i == -499894 || i == -499893 || i == -499891 || i == 251658241 || i == -499799 || i == -499795 || i == -499794 || i == -499793 || i == -499792) {
                    return 2;
                }
                if (LJFF()) {
                    return 3;
                }
                if (this.LIZ == -499897) {
                    return 1;
                }
            }
            if (this.LIZJ.equals("kTTVideoErrorDomainVideoExoPlayer") && this.LIZ == -499897) {
                return 1;
            }
        }
        return 2;
    }

    public final int LIZLLL() {
        if (this.LIZJ.equals("kTTVideoErrorDomainFetchingInfo")) {
            return LSPassThroughRecordSizeConfig.DEFAULT;
        }
        if (this.LIZJ.equals("kTTVideoErrorDomainLocalDNS") || this.LIZJ.equals("kTTVideoErrorDomainHTTPDNS")) {
            return 1001;
        }
        return (this.LIZJ.equals("kTTVideoErrorDomainVideoOwnPlayer") && LJFF()) ? 1002 : 1003;
    }

    public final boolean LJ() {
        if (TextUtils.isEmpty(this.LIZJ)) {
            return false;
        }
        return this.LIZJ.equals("kTTVideoErrorDomainVideoOwnPlayer") || this.LIZJ.equals("kTTVideoErrorDomainVideoOSPlayer") || this.LIZJ.equals("kTTVideoErrorDomainVideoExoPlayer");
    }

    public final boolean LJFF() {
        int i = this.LIZ;
        return i == -499999 || i == -499997 || i == -499996 || i == -499992 || i == -499991 || i == -499990 || i == -499989 || i == -2139062143;
    }

    public final HashMap LJI() {
        HashMap map = new HashMap();
        map.put("domain", this.LIZJ);
        map.put("code", Integer.valueOf(this.LIZ));
        int i = this.LIZIZ;
        if (i != 0) {
            map.put("internalCode", Integer.valueOf(i));
        }
        String str = this.LIZLLL;
        if (str != null) {
            map.put("description", str);
        }
        return map;
    }

    public static String LIZIZ(InterfaceC1470080oMI interfaceC1470080oMI) {
        if (interfaceC1470080oMI == null) {
            return "";
        }
        int playerType = interfaceC1470080oMI.getPlayerType();
        if (playerType != 0) {
            if (playerType != 1 && playerType != 2 && playerType != 3 && playerType != 4) {
                if (playerType != 5) {
                    return "";
                }
                return "kTTVideoErrorDomainVideoExoPlayer";
            }
            return "kTTVideoErrorDomainVideoOwnPlayer";
        }
        return "kTTVideoErrorDomainVideoOSPlayer";
    }

    public e(String str, int i) {
        this(str, i, 0, null);
    }

    public e(String str, int i, String str2) {
        this(str, i, 0, str2);
    }

    public static e LIZ(InterfaceC1467950oIr interfaceC1467950oIr, int i, String str) {
        return new e(LIZIZ(interfaceC1467950oIr), i, 0, str);
    }

    public e(String str, int i, int i2, String str2) {
        this.LIZJ = str;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = str2;
        this.LJ = new HashMap();
    }
}
