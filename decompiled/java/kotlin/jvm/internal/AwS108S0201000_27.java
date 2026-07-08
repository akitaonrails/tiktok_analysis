package kotlin.jvm.internal;

import X.C09AY;
import X.C09IC;
import X.C1023640ckE;
import X.C1556350qbR;
import X.C1785690wZL;
import X.C1785910wZh;
import X.C1785940wZk;
import X.C1785950wZl;
import X.C1785960wZm;
import X.C1785970wZn;
import X.C1786010wZr;
import X.C1786400waU;
import X.C1797130wrn;
import X.C1797200wru;
import X.C1810690xDf;
import X.C1838970xxH;
import X.C1850190yFN;
import X.C1853060yK0;
import X.C1857470yR7;
import X.C1954807lC;
import X.C20441214yg;
import X.C2188811AlT;
import X.C436790HAv;
import X.C991800bus;
import X.EnumC1785890wZf;
import X.InterfaceC1785410wYt;
import X.InterfaceC1785930wZj;
import X.InterfaceC665370Q7z;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingSubPageFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.PreviewMediaState;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS108S0201000_27 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS108S0201000_27 awS108S0201000_27, Object obj) {
        InterfaceC1785930wZj interfaceC1785930wZj = (InterfaceC1785930wZj) obj;
        if (Intrinsics.LJFF(interfaceC1785930wZj, C1785970wZn.LIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("retryFromSubStatus rankType=");
            sbLIZ.append(awS108S0201000_27.i2);
            C20441214yg.LIZIZ("CreatorRankingSubPageFragment", C2188811AlT.LIZIZ(sbLIZ));
            ((CreatorRankingSubPageFragment) awS108S0201000_27.l0).NR().onEvent(C1785940wZk.LIZ);
        } else if (interfaceC1785930wZj instanceof C1556350qbR) {
            if (((C1785910wZh) ((InterfaceC1785410wYt) awS108S0201000_27.l1)).LIZ.LIZ == EnumC1785890wZf.FRIEND_RANKING_EMPTY) {
                C1786010wZr c1786010wZrTw = ((CreatorRankingSubPageFragment) awS108S0201000_27.l0).MR().tw();
                c1786010wZrTw.getClass();
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                DataChannel dataChannel = c1786010wZrTw.LIZ.getDataChannel();
                String strLIZLLL = c1786010wZrTw.LIZLLL();
                c1810690xDf.getClass();
                C1810690xDf.LJIIZILJ(dataChannel, strLIZLLL);
            }
            ((CreatorRankingSubPageFragment) awS108S0201000_27.l0).NR().onEvent(new C991800bus(((C1556350qbR) interfaceC1785930wZj).LIZ));
        } else if (Intrinsics.LJFF(interfaceC1785930wZj, C1785960wZm.LIZ)) {
            ((CreatorRankingSubPageFragment) awS108S0201000_27.l0).NR().onEvent(C1785690wZL.LIZ);
        } else if (!Intrinsics.LJFF(interfaceC1785930wZj, C1785950wZl.LIZ)) {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS108S0201000_27 awS108S0201000_27, Object obj) {
        return C1853060yK0.LIZ((C1853060yK0) obj, new PreviewMediaState((TikTokMediaModel) awS108S0201000_27.l0, awS108S0201000_27.i2), (ArrayList) awS108S0201000_27.l1, false, null, null, null, null, false, null, null, null, null, null, 0, null, 65532);
    }

    public static final Object invoke$2(AwS108S0201000_27 awS108S0201000_27, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1797130wrn c1797130wrn = (C1797130wrn) awS108S0201000_27.l0;
            c1797130wrn.LJII = true;
            c1797130wrn.LIZ.LIZLLL(((C1797200wru) awS108S0201000_27.l1).getProductId(), ((C1797200wru) awS108S0201000_27.l1).getOrderId(), 1, (C1797130wrn) awS108S0201000_27.l0, true);
        } else {
            ((C1797130wrn) awS108S0201000_27.l0).LIZIZ.LJ(awS108S0201000_27.i2, (C1797200wru) awS108S0201000_27.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS108S0201000_27 awS108S0201000_27, Object obj) {
        C1857470yR7 c1857470yR7 = C1857470yR7.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS108S0201000_27.l0;
        Message message = (Message) awS108S0201000_27.l1;
        int i = awS108S0201000_27.i2;
        c1857470yR7.getClass();
        C1857470yR7.LIZJ(interfaceC665370Q7z, message, i);
        C1857470yR7.LIZIZ((InterfaceC665370Q7z) awS108S0201000_27.l0, (Message) awS108S0201000_27.l1, awS108S0201000_27.i2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS108S0201000_27 awS108S0201000_27, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext((MusicModel) awS108S0201000_27.l0, ((C1786400waU) ListProtector.get(((C436790HAv) C09IC.LIZIZ(((C1838970xxH) awS108S0201000_27.l1).LLILZ.LLILLL).getValue()).LIZ, awS108S0201000_27.i2)).LIZ);
        C1850190yFN.LIZ.getClass();
        c1023640ckE.withParam(C1850190yFN.LJFF, Integer.valueOf(awS108S0201000_27.i2));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS108S0201000_27 awS108S0201000_27, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext((Aweme) awS108S0201000_27.l0, (MusicDetail) awS108S0201000_27.l1);
        C1850190yFN.LIZ.getClass();
        c1023640ckE.withParam(C1850190yFN.LJFF, Integer.valueOf(awS108S0201000_27.i2));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS108S0201000_27 awS108S0201000_27, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext((Aweme) awS108S0201000_27.l0, (MusicDetail) awS108S0201000_27.l1);
        C1850190yFN.LIZ.getClass();
        c1023640ckE.withParam(C1850190yFN.LJFF, Integer.valueOf(awS108S0201000_27.i2));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS108S0201000_27(int i, CreatorRankingSubPageFragment creatorRankingSubPageFragment, InterfaceC1785410wYt interfaceC1785410wYt, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = creatorRankingSubPageFragment;
        this.l1 = interfaceC1785410wYt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS108S0201000_27(int i, Aweme aweme, MusicDetail musicDetail, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.l1 = musicDetail;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS108S0201000_27(InterfaceC665370Q7z interfaceC665370Q7z, Message message, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC665370Q7z;
        this.l1 = message;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS108S0201000_27(C1797130wrn c1797130wrn, C1797200wru c1797200wru, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1797130wrn;
        this.l1 = c1797200wru;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS108S0201000_27(MusicModel musicModel, C1838970xxH c1838970xxH, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = musicModel;
        this.l1 = c1838970xxH;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS108S0201000_27(TikTokMediaModel tikTokMediaModel, TikTokMediaModel tikTokMediaModel2, int i, ArrayList<TikTokMediaModel> arrayList) {
        super(1);
        this.$t = arrayList;
        this.l0 = tikTokMediaModel;
        this.i2 = tikTokMediaModel2;
        this.l1 = i;
    }
}
