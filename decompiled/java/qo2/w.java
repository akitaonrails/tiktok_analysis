package qo2;

import X.C0IR5;
import X.C0IXL;
import X.C1148310fzJ;
import X.C1161920gLG;
import X.C2097608Jq;
import X.C466470IQz;
import X.InterfaceC1766280w42;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements InterfaceC1766280w42 {
    public static int LIZIZ;
    public static final w LIZ = new w();
    public static final InterfaceC1766280w42 LIZJ = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ai1();

    public static String LJIILL() {
        C0IXL c0ixl;
        String str;
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        return (c0ir5 == null || (c0ixl = c0ir5.LJFF) == null || (str = c0ixl.LJI) == null) ? "" : str;
    }

    public static C0IR5 LJJIII() {
        return (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
    }

    @Override // X.InterfaceC1766280w42
    public final String LIZJ() {
        String strLIZJ;
        InterfaceC1766280w42 interfaceC1766280w42 = LIZJ;
        return (interfaceC1766280w42 == null || (strLIZJ = interfaceC1766280w42.LIZJ()) == null) ? "" : strLIZJ;
    }

    public static String LIZLLL() {
        C0IXL c0ixl;
        String str;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null || (str = c0ixl.LJFF) == null) ? "" : str;
    }

    public static long LJ() {
        Long l;
        C0IR5 c0ir5LJJIII = LJJIII();
        if (c0ir5LJJIII == null || (l = c0ir5LJJIII.LIZLLL) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static long LJFF() {
        C0IXL c0ixl;
        C0IR5 c0ir5LJJIII = LJJIII();
        if (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null) {
            return -1L;
        }
        return c0ixl.LJJJZ;
    }

    public static long LJI() {
        C0IXL c0ixl;
        C0IR5 c0ir5LJJIII = LJJIII();
        if (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null) {
            return -1L;
        }
        return c0ixl.LJJL;
    }

    public static Map LJII() {
        C0IXL c0ixl;
        Map<String, String> map;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null || (map = c0ixl.LJJJJL) == null) ? C2097608Jq.LJ() : map;
    }

    public static String LJIIIIZZ() {
        Map<String, String> map;
        C0IR5 c0ir5LJJIII = LJJIII();
        if (c0ir5LJJIII == null || (map = c0ir5LJJIII.LJIIJJI) == null) {
            return null;
        }
        return map.get("ecom_live_rcmd_info");
    }

    public static String LJIIIZ() {
        C0IXL c0ixl;
        String str;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null || (str = c0ixl.LIZIZ) == null) ? "" : str;
    }

    public static long LJIIJ() {
        C0IXL c0ixl;
        C0IR5 c0ir5LJJIII = LJJIII();
        if (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null) {
            return 0L;
        }
        return c0ixl.LJJJJJ;
    }

    public static String LJIIJJI() {
        C0IXL c0ixl;
        C0IR5 c0ir5LJJIII = LJJIII();
        if (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null) {
            return null;
        }
        return c0ixl.LJJJJJL;
    }

    public static String LJIIL() {
        C0IXL c0ixl;
        String str;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null || (str = c0ixl.LIZ) == null) ? "" : str;
    }

    public static String LJIILIIL() {
        String str;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (str = c0ir5LJJIII.LIZ) == null) ? "" : str;
    }

    public static String LJIILJJIL() {
        C0IXL c0ixl;
        String str;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null || (str = c0ixl.LJ) == null) ? "" : str;
    }

    public static String LJIILLIIL() {
        C0IXL c0ixl;
        String str;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null || (str = c0ixl.LJIILL) == null) ? "" : str;
    }

    public static String LJIIZILJ() {
        Room room;
        String log_pb;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (room = c0ir5LJJIII.LIZIZ) == null || (log_pb = room.getLog_pb()) == null) ? "" : log_pb;
    }

    public static long LJIJ() {
        C0IXL c0ixl;
        C0IR5 c0ir5LJJIII = LJJIII();
        if (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null) {
            return 0L;
        }
        return c0ixl.LJJIZ;
    }

    public static String LJIJI() {
        C0IXL c0ixl;
        String str;
        Room room;
        String requestId;
        C0IR5 c0ir5LJJIII = LJJIII();
        if (c0ir5LJJIII != null && (room = c0ir5LJJIII.LIZIZ) != null && (requestId = room.getRequestId()) != null) {
            return requestId;
        }
        C0IR5 c0ir5LJJIII2 = LJJIII();
        return (c0ir5LJJIII2 == null || (c0ixl = c0ir5LJJIII2.LJFF) == null || (str = c0ixl.LJIIIIZZ) == null) ? "" : str;
    }

    public static long LJIJJ() {
        Room room;
        C0IR5 c0ir5LJJIII = LJJIII();
        if (c0ir5LJJIII == null || (room = c0ir5LJJIII.LIZIZ) == null) {
            return 0L;
        }
        return room.getId();
    }

    public static int LJIJJLI() {
        C466470IQz c466470IQz;
        C0IR5 c0ir5LJJIII = LJJIII();
        if (c0ir5LJJIII == null || (c466470IQz = c0ir5LJJIII.LJI) == null) {
            return -1;
        }
        return c466470IQz.LIZ;
    }

    public static String LJIL() {
        C0IXL c0ixl;
        Map<String, String> map;
        String str;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null || (map = c0ixl.LJJJJL) == null || (str = map.get("search_id")) == null) ? "" : str;
    }

    public static String LJJ() {
        C0IXL c0ixl;
        Map<String, String> map;
        String str;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null || (map = c0ixl.LJJJJL) == null || (str = map.get("search_result_id")) == null) ? "" : str;
    }

    public static String LJJI() {
        C0IXL c0ixl;
        Long l;
        String string;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null || (l = c0ixl.LJIILLIIL) == null || (string = l.toString()) == null) ? "" : string;
    }

    public static String LJJIFFI() {
        C0IXL c0ixl;
        Map<String, String> map;
        String str;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null || (map = c0ixl.LJJJJL) == null || (str = map.get("source")) == null) ? "" : str;
    }

    public static String LJJII() {
        C0IXL c0ixl;
        Map<String, String> map;
        String str;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null || (map = c0ixl.LJJJJL) == null || (str = map.get("video_id")) == null) ? "" : str;
    }

    @Override // X.InterfaceC1766280w42
    public final String LIZ() {
        C0IXL c0ixl;
        String str;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null || (str = c0ixl.LJIJJ) == null) ? "" : str;
    }

    @Override // X.InterfaceC1766280w42
    public final String LIZIZ() {
        C0IXL c0ixl;
        String str;
        C0IR5 c0ir5LJJIII = LJJIII();
        return (c0ir5LJJIII == null || (c0ixl = c0ir5LJJIII.LJFF) == null || (str = c0ixl.LJIJJLI) == null) ? "" : str;
    }
}
