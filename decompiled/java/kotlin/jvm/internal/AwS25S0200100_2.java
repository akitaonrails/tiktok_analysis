package kotlin.jvm.internal;

import X.C09AY;
import X.C0I0B;
import X.C0ICM;
import X.C0Z2Z;
import X.C0ZDX;
import X.C1378005aM;
import X.C1378505aR;
import X.C1378605aS;
import X.C13LP;
import X.C141200gM;
import X.C1603006Pk;
import X.C1716106nn;
import X.C1716406nq;
import X.C1716506nr;
import X.C1716706nt;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C457780HxI;
import X.C603820NmG;
import X.C869590Y9l;
import X.InterfaceC497601wk;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.ChatRoomAlphaVideoViewModel;
import com.ss.android.ugc.aweme.im.service.alphavideo.AmbientDataSourceHelper;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS25S0200100_2 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS25S0200100_2 awS25S0200100_2, Object obj) {
        C23250099c.LIZLLL((InterfaceC497601wk) awS25S0200100_2.l0, null, null, new C1378005aM((C1378505aR) awS25S0200100_2.l1, ((C1378605aS) obj).LIZ, awS25S0200100_2.j2, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS25S0200100_2 awS25S0200100_2, Object obj) {
        boolean z;
        C0ICM c0icmWQ2;
        List<C1716406nq> list;
        StickerTemplate stickerTemplate;
        String str;
        List<String> list2;
        String str2;
        C1603006Pk c1603006Pk = (C1603006Pk) obj;
        boolean zBooleanValue = ((Boolean) C141200gM.LIZ.getValue()).booleanValue();
        List listLL = C13LP.LL((List) awS25S0200100_2.l0, ((ChatRoomAlphaVideoViewModel) awS25S0200100_2.l1).LLILZIL);
        long j = awS25S0200100_2.j2;
        ChatRoomAlphaVideoViewModel chatRoomAlphaVideoViewModel = (ChatRoomAlphaVideoViewModel) awS25S0200100_2.l1;
        Iterator it2 = listLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C869590Y9l c869590Y9l = (C869590Y9l) it2.next();
            if (c869590Y9l != null && c869590Y9l.getOrderIndex() > j && !Intrinsics.LJFF(((C603820NmG) C1716506nr.LIZ.getValue()).LIZJ(Long.valueOf(c869590Y9l.getCreatedAt())), Boolean.TRUE) && (C0ZDX.LJJJJIZL(c869590Y9l) || !c1603006Pk.LL || zBooleanValue)) {
                C0ICM c0icmWQ22 = chatRoomAlphaVideoViewModel.wQ2();
                if (c0icmWQ22 != null && c0icmWQ22.LJJJJJL(c869590Y9l)) {
                    z = true;
                } else {
                    z = false;
                }
                if ((z || c869590Y9l.getMsgType() == 1805) && (c0icmWQ2 = chatRoomAlphaVideoViewModel.wQ2()) != null && c0icmWQ2.LJIJJLI()) {
                    C0ICM c0icmWQ23 = chatRoomAlphaVideoViewModel.wQ2();
                    if (c0icmWQ23 != null) {
                        c0icmWQ23.LJJIJIL(c869590Y9l, new AwS90S0110000_2(chatRoomAlphaVideoViewModel, zBooleanValue, 10));
                    }
                } else if (C1716106nn.LIZ() && c869590Y9l.getMsgType() == 1805 && (list = C1716706nt.LIZ) != null && !list.isEmpty() && (stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(c869590Y9l, StickerTemplate.class)) != null && (str = stickerTemplate.baseRequestComponent.queryData.extras.get("a:sticker_id")) != null && str.length() != 0) {
                    SystemClock.elapsedRealtime();
                    List<C1716406nq> list3 = C1716706nt.LIZ;
                    if (list3 != null) {
                        for (C1716406nq c1716406nq : list3) {
                            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                            long j2 = c1716406nq.LIZ;
                            if (jCurrentTimeMillis <= c1716406nq.LIZIZ && j2 <= jCurrentTimeMillis && (list2 = c1716406nq.LIZJ) != null && list2.contains(str)) {
                                ((C603820NmG) C1716506nr.LIZ.getValue()).LIZLLL(Long.valueOf(c869590Y9l.getCreatedAt()), Boolean.TRUE);
                                String str3 = c1716406nq.LJ;
                                String str4 = c1716406nq.LIZLLL;
                                boolean zLJJJJIZL = C0ZDX.LJJJJIZL(c869590Y9l);
                                String str5 = c869590Y9l.getLocalExt().get("enter_method");
                                AmbientDataSourceHelper.LIZIZ.getClass();
                                DataSource dataSourceLIZIZ = AmbientDataSourceHelper.LIZIZ(str3, null);
                                if (dataSourceLIZIZ != null) {
                                    chatRoomAlphaVideoViewModel.setState(new AwS581S0100000_2(dataSourceLIZIZ, 714));
                                    chatRoomAlphaVideoViewModel.LL.bc(true);
                                    if (zLJJJJIZL) {
                                        str2 = "send";
                                    } else {
                                        str2 = "receive";
                                    }
                                    String enterFromForMob = ((C457780HxI) chatRoomAlphaVideoViewModel.LLILLJJLI.getValue()).LL.getEnterFromForMob();
                                    Object value = chatRoomAlphaVideoViewModel.LLILZ.getValue();
                                    C0I0B.LJFF.LIZIZ();
                                    C20684815ws.LJIILLIIL("dm_display_animation", C2097608Jq.LJIIIIZZ(new Pair("action", str2), new Pair("enter_from", enterFromForMob), new Pair("animation_name", str4), new Pair("send_method", str5), new Pair("chat_type", value)));
                                }
                            }
                        }
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S0200100_2(long j, C1378505aR c1378505aR, InterfaceC497601wk interfaceC497601wk, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC497601wk;
        this.l1 = c1378505aR;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0000: IPUT (r7 I:int), (r2 I:kotlin.jvm.internal.AwS25S0200100_2) (LINE:67174400) kotlin.jvm.internal.AwS25S0200100_2.$t int, block:B:2:0x0000 */
    public AwS25S0200100_2(List list, List<? extends C869590Y9l> list2, ChatRoomAlphaVideoViewModel chatRoomAlphaVideoViewModel, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.j2 = chatRoomAlphaVideoViewModel;
    }
}
