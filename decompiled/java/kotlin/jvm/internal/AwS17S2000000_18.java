package kotlin.jvm.internal;

import X.C09AY;
import X.C1164120gOo;
import X.C1196140hES;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: loaded from: classes19.dex */
public class AwS17S2000000_18 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS17S2000000_18 awS17S2000000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LJ("custom exception error msg", awS17S2000000_18.s0);
        String str = awS17S2000000_18.s1;
        if (str != null) {
            c1196140hES.LJFF("throwable msg", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS17S2000000_18 awS17S2000000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        String str = awS17S2000000_18.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1196140hES.LJIIIIZZ("creation_id", str);
        String str3 = awS17S2000000_18.s1;
        if (str3 != null) {
            str2 = str3;
        }
        c1196140hES.LJ("content_type", str2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS17S2000000_18 awS17S2000000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        String str = awS17S2000000_18.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1196140hES.LJIIIIZZ("creation_id", str);
        String str3 = awS17S2000000_18.s1;
        if (str3 != null) {
            str2 = str3;
        }
        c1196140hES.LJ("content_type", str2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS17S2000000_18 awS17S2000000_18, Object obj) {
        String mixId;
        PlayListInfo playListInfo;
        List<Aweme> list = ((C1164120gOo) obj).LL;
        if (list != null) {
            String str = awS17S2000000_18.s0;
            String str2 = awS17S2000000_18.s1;
            for (Aweme aweme : list) {
                PlayListInfo playListInfo2 = aweme.playlist_info;
                if (playListInfo2 != null) {
                    mixId = playListInfo2.getMixId();
                } else {
                    mixId = null;
                }
                if (u.LJIJI(mixId, str, false) && (playListInfo = aweme.playlist_info) != null) {
                    playListInfo.setMixName(str2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS17S2000000_18 awS17S2000000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LJ("custom exception", awS17S2000000_18.s0);
        String str = awS17S2000000_18.s1;
        if (str != null) {
            c1196140hES.LJFF("custom exception message", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS17S2000000_18 awS17S2000000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        String str = awS17S2000000_18.s0;
        if (str != null) {
            c1196140hES.LJ("pageType", str);
        }
        String str2 = awS17S2000000_18.s1;
        if (str2 != null) {
            c1196140hES.LJFF("reason", str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS17S2000000_18 awS17S2000000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LJ("scenario", awS17S2000000_18.s0);
        c1196140hES.LJFF("path", awS17S2000000_18.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS17S2000000_18 awS17S2000000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        String str = awS17S2000000_18.s0;
        if (str != null) {
            c1196140hES.LJ("biz_type", str);
        }
        String str2 = awS17S2000000_18.s1;
        if (str2 != null) {
            c1196140hES.LJFF("url", str2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S2000000_18(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
