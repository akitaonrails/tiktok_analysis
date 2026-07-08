package kotlin.jvm.internal;

import X.C01TT;
import X.C09AY;
import X.C0L92;
import X.C0M2T;
import X.C0M5N;
import X.C0MR3;
import X.C0WZX;
import X.C1436960nUs;
import X.C1440005kM;
import X.C1443030nef;
import X.C1443400nfG;
import X.C198H;
import X.C20622515mp;
import X.C2204961BRm;
import X.C522360KeA;
import X.C523870Kgb;
import X.C531590Kt3;
import X.C533830Kwf;
import X.C538590LAj;
import X.C540370LHf;
import X.C568250MQl;
import X.C786410Ut5;
import X.InterfaceC20597015ii;
import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.onthisday.RefreshLocalMediasEvent;
import com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes9.dex */
public class AwS68S0301000_8 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS68S0301000_8 awS68S0301000_8) throws Throwable {
        C198H c198hLC;
        if (!((AtomicBoolean) awS68S0301000_8.l0).get()) {
            C522360KeA.LIZ(C523870Kgb.LIZIZ((Intent) awS68S0301000_8.l1, C0L92.SUCCESS, ""));
            InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(((C533830Kwf) awS68S0301000_8.l2).LL);
            if (interfaceC20597015iiLIZJ != null) {
                c198hLC = interfaceC20597015iiLIZJ.LC();
            } else {
                c198hLC = null;
            }
            if (c198hLC instanceof SelectMaterialScene) {
                C01TT.LIZLLL(new AwS134S0201000_8(awS68S0301000_8.i3, (Intent) awS68S0301000_8.l1, interfaceC20597015iiLIZJ, 0));
                ((AtomicBoolean) awS68S0301000_8.l0).set(true);
            } else {
                C2204961BRm.LLJJIJIL(awS68S0301000_8.i3, (Intent) awS68S0301000_8.l1, ((C533830Kwf) awS68S0301000_8.l2).LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOetZ5bP3zojwSJvkPRN24BglIeM3nZuyYf42XXVY5dwSXhqmcoCP8s=", null));
                ((C533830Kwf) awS68S0301000_8.l2).LL.finish();
                C786410Ut5.ce(((C533830Kwf) awS68S0301000_8.l2).LL, 0, R.anim.a8);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS68S0301000_8 awS68S0301000_8) throws Throwable {
        C198H c198hLC;
        if (!((AtomicBoolean) awS68S0301000_8.l0).get()) {
            InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(((C531590Kt3) awS68S0301000_8.l1).LL);
            if (interfaceC20597015iiLIZJ != null) {
                c198hLC = interfaceC20597015iiLIZJ.LC();
            } else {
                c198hLC = null;
            }
            if (c198hLC instanceof SelectMaterialScene) {
                int i = awS68S0301000_8.i3;
                if (i != 31000 && i != 31001) {
                    C01TT.LIZLLL(new AwS134S0201000_8(i, (Intent) awS68S0301000_8.l2, interfaceC20597015iiLIZJ, 2));
                } else {
                    C01TT.LIZLLL(new AwS134S0201000_8((Intent) awS68S0301000_8.l2, (C531590Kt3) awS68S0301000_8.l1, i, 1));
                }
                ((AtomicBoolean) awS68S0301000_8.l0).set(true);
            } else {
                C522360KeA.LIZ(C523870Kgb.LIZIZ((Intent) awS68S0301000_8.l2, C0L92.SUCCESS, ""));
                C2204961BRm.LJIIL(awS68S0301000_8.i3, ((C531590Kt3) awS68S0301000_8.l1).LL, (Intent) awS68S0301000_8.l2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOetZ5bP3zojwSJvkPJI35F9h5ufyFpzHqjoBTC02629h5wJY5A=", null));
                ((C531590Kt3) awS68S0301000_8.l1).LL.finish();
                C786410Ut5.ae(0, ((C531590Kt3) awS68S0301000_8.l1).LL, R.anim.a8);
                ((AtomicBoolean) awS68S0301000_8.l0).set(true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS68S0301000_8 awS68S0301000_8) {
        EventBus.LIZLLL().LJIILL(new RefreshLocalMediasEvent((List) awS68S0301000_8.l0));
        ((C0MR3) awS68S0301000_8.l1).X1().addAll((List) awS68S0301000_8.l2);
        if (((List) awS68S0301000_8.l2).isEmpty()) {
            C1440005kM.LIZ(new C568250MQl(3));
        } else {
            C1440005kM.LIZ(new C568250MQl(awS68S0301000_8.i3));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS68S0301000_8 awS68S0301000_8) {
        C1443400nfG.LJIIZILJ((VideoPublishEditModel) awS68S0301000_8.l0);
        C1443030nef.LJII().LJIIL(((VideoPublishEditModel) awS68S0301000_8.l0).getCreationId());
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS68S0301000_8.l0;
        videoPublishEditModel.creativeModel.draftInfoModel.saveDraftScene = "saveBeforePublish";
        C0M5N c0m5n = C0M5N.LIZ;
        C540370LHf c540370LHf = new C540370LHf(new C538590LAj(videoPublishEditModel, new C0M2T(true, "DmtInternalPublishServiceImpl", null, awS68S0301000_8.i3, false, 24), false), new C1436960nUs((Function1) awS68S0301000_8.l1, (Function1) awS68S0301000_8.l2, videoPublishEditModel));
        c0m5n.getClass();
        C0M5N.LIZ(c540370LHf);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S0301000_8(int i, VideoPublishEditModel videoPublishEditModel, Function1 function1, Function1 function12, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = videoPublishEditModel;
        this.i3 = i;
        this.l1 = function1;
        this.l2 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS68S0301000_8(List list, List<? extends MediaModel> list2, C0MR3 c0mr3, List<ForwardMedia> list3, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c0mr3;
        this.i3 = list3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S0301000_8(AtomicBoolean atomicBoolean, C531590Kt3 c531590Kt3, int i, Intent intent, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = atomicBoolean;
        this.l1 = c531590Kt3;
        this.i3 = i;
        this.l2 = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S0301000_8(AtomicBoolean atomicBoolean, Intent intent, C533830Kwf c533830Kwf, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = atomicBoolean;
        this.l1 = intent;
        this.l2 = c533830Kwf;
        this.i3 = i;
    }
}
