package kotlin.jvm.internal;

import X.C09AY;
import X.C0E3H;
import X.C0E3M;
import X.C0E3O;
import X.C0E48;
import X.C0E5S;
import X.C0FX2;
import X.C0FX3;
import X.C1662010tLr;
import X.C350870DpF;
import X.C355480Dwg;
import X.C358490E3r;
import X.C369740Eea;
import X.C369770Eed;
import X.C369850Eel;
import X.C369860Eem;
import X.C386801es;
import X.InterfaceC355460Dwe;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.common.logic.VideoCropService;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim.SmartTrimFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS37S0200100_5 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS37S0200100_5 awS37S0200100_5) {
        ((C0E3O) awS37S0200100_5.l0).LL = awS37S0200100_5.j2;
        final C0E3M c0e3m = (C0E3M) awS37S0200100_5.l1;
        C0E3H c0e3h = c0e3m.LLJJJIL.LIZJ;
        long j = c0e3h.LIZ;
        final long j2 = c0e3h.LIZIZ;
        long j3 = j2 - j;
        long j4 = awS37S0200100_5.j2;
        if (j4 >= j2 - ((long) 50) && j2 != 0) {
            C358490E3r c358490E3r = c0e3m.LLJJJ;
            final C0E3O c0e3o = (C0E3O) awS37S0200100_5.l0;
            c358490E3r.LIZIZ(j2, new INLEListenerSeek() { // from class: X.0E3N
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSeek
                public final void onSeekDone(int i) {
                    C0E55 player;
                    if (c0e3o.LL >= j2 - ((long) 50)) {
                        C0E48 c0e48F4 = c0e3m.F4();
                        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
                            player.pause(false);
                        }
                        c0e3m.LLJJJIL.LIZJ(false);
                    }
                }
            }, true, true);
            ((C0E3M) awS37S0200100_5.l1).Z4(1.0f);
        } else if (j4 < j) {
            c0e3m.Z4(0.0f);
            C0E3M c0e3m2 = (C0E3M) awS37S0200100_5.l1;
            c0e3m2.LLJJJ.LIZIZ(j, new C0FX3(c0e3m2, 2), true, true);
        } else if (j3 != 0) {
            c0e3m.Z4(((j4 - j) * 1.0f) / j3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS37S0200100_5 awS37S0200100_5) {
        INLEPlayer playerApi;
        INLEPlayer playerApi2;
        INLEMediaSession iNLEMediaSessionF1 = ((C0E48) awS37S0200100_5.l0).f1();
        if (iNLEMediaSessionF1 != null && (playerApi2 = iNLEMediaSessionF1.getPlayerApi()) != null) {
            playerApi2.stop();
        }
        INLEMediaSession iNLEMediaSessionF12 = ((C0E48) awS37S0200100_5.l0).f1();
        if (iNLEMediaSessionF12 != null && (playerApi = iNLEMediaSessionF12.getPlayerApi()) != null) {
            playerApi.prepare();
        }
        VideoCropService videoCropService = (VideoCropService) awS37S0200100_5.l1;
        C0E48 c0e48 = (C0E48) awS37S0200100_5.l0;
        VideoCropService.seek$default(videoCropService, c0e48, awS37S0200100_5.j2, 0L, new C0FX2(videoCropService, c0e48, 6), 4, null);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS37S0200100_5 awS37S0200100_5) {
        ((SmartTrimFragment) awS37S0200100_5.l0).jT();
        C350870DpF.LJIIIZ((C0E48) awS37S0200100_5.l1, "IS_ACTIVE_TRACKPANEL", Boolean.TRUE);
        C350870DpF.LIZ((C0E48) awS37S0200100_5.l1, false);
        ((SmartTrimFragment) awS37S0200100_5.l0).NR();
        ((SmartTrimFragment) awS37S0200100_5.l0).nT(awS37S0200100_5.j2);
        C0E5S c0e5s = ((SmartTrimFragment) awS37S0200100_5.l0).LLLL;
        if (c0e5s != null) {
            c0e5s.pl(1.0f);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS37S0200100_5 awS37S0200100_5) {
        C369860Eem c369860Eem = (C369860Eem) awS37S0200100_5.l0;
        long j = awS37S0200100_5.j2;
        c369860Eem.LL = j;
        long j2 = c369860Eem.LLILLJJLI;
        long j3 = j2 - 0;
        if (j >= j2 - ((long) 50) && j2 != 0) {
            C369740Eea c369740Eea = (C369740Eea) awS37S0200100_5.l1;
            c369740Eea.LLJJIII.LIZIZ(j2, new C0FX2(c369860Eem, c369740Eea, 9), true, true);
            ((C369740Eea) awS37S0200100_5.l1).K4(1.0f);
        } else if (j < 0) {
            ((C369740Eea) awS37S0200100_5.l1).K4(0.0f);
            C358490E3r c358490E3r = ((C369740Eea) awS37S0200100_5.l1).LLJJIII;
            ((C369860Eem) awS37S0200100_5.l0).getClass();
            c358490E3r.LIZIZ(0L, new C0FX3((C369740Eea) awS37S0200100_5.l1, 22), true, true);
        } else if (j3 != 0) {
            c369860Eem.getClass();
            ((C369740Eea) awS37S0200100_5.l1).K4(((j - 0) * 1.0f) / j3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS37S0200100_5 awS37S0200100_5) {
        C369850Eel c369850Eel = (C369850Eel) awS37S0200100_5.l0;
        long j = awS37S0200100_5.j2;
        c369850Eel.LL = j;
        long j2 = c369850Eel.LLILLJJLI;
        long j3 = j2 - 0;
        if (j >= j2 - ((long) 50) && j2 != 0) {
            C369770Eed c369770Eed = (C369770Eed) awS37S0200100_5.l1;
            c369770Eed.LLJJJJLIIL.LIZIZ(j2, new C0FX2(c369850Eel, c369770Eed, 14), true, true);
            ((C369770Eed) awS37S0200100_5.l1).H5(1.0f);
        } else if (j < 0) {
            ((C369770Eed) awS37S0200100_5.l1).H5(0.0f);
            C358490E3r c358490E3r = ((C369770Eed) awS37S0200100_5.l1).LLJJJJLIIL;
            ((C369850Eel) awS37S0200100_5.l0).getClass();
            c358490E3r.LIZIZ(0L, new C0FX3((C369770Eed) awS37S0200100_5.l1, 25), true, true);
        } else if (j3 != 0) {
            c369850Eel.getClass();
            ((C369770Eed) awS37S0200100_5.l1).H5(((j - 0) * 1.0f) / j3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS37S0200100_5 awS37S0200100_5) {
        InterfaceC355460Dwe interfaceC355460Dwe = (InterfaceC355460Dwe) awS37S0200100_5.l0;
        if (interfaceC355460Dwe != null) {
            interfaceC355460Dwe.LIZ(C386801es.DEFAULT, String.valueOf(((C1662010tLr) awS37S0200100_5.l1).LIZIZ), new C355480Dwg(awS37S0200100_5.j2, false));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0200100_5(InterfaceC355460Dwe interfaceC355460Dwe, C1662010tLr c1662010tLr, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC355460Dwe;
        this.l1 = c1662010tLr;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0200100_5(C0E3O c0e3o, long j, C0E3M c0e3m, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0e3o;
        this.j2 = j;
        this.l1 = c0e3m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0200100_5(C0E48 c0e48, VideoCropService videoCropService, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0e48;
        this.l1 = videoCropService;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0200100_5(C369850Eel c369850Eel, long j, C369770Eed c369770Eed, int i) {
        super(0);
        this.$t = i;
        this.l0 = c369850Eel;
        this.j2 = j;
        this.l1 = c369770Eed;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0200100_5(C369860Eem c369860Eem, long j, C369740Eea c369740Eea, int i) {
        super(0);
        this.$t = i;
        this.l0 = c369860Eem;
        this.j2 = j;
        this.l1 = c369740Eea;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0200100_5(SmartTrimFragment smartTrimFragment, C0E48 c0e48, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = smartTrimFragment;
        this.l1 = c0e48;
        this.j2 = j;
    }
}
