package kotlin.jvm.internal;

import X.C01GW;
import X.C090X;
import X.C09AY;
import X.C0C64;
import X.C0CHQ;
import X.C0L7R;
import X.C0MAY;
import X.C11NZ;
import X.C123100dR;
import X.C1428470nHB;
import X.C1449720npS;
import X.C1457440o1u;
import X.C1457540o24;
import X.C1463670oBx;
import X.C1660680tJi;
import X.C201955140j;
import X.C238400w2;
import X.C283090B7r;
import X.C573430MeL;
import X.InterfaceC576180Mim;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.StickPointRecommendMusicTimeOutOpt;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS70S0500000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS70S0500000_8 awS70S0500000_8) {
        long jLJFF;
        boolean z = true;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_recommend_music_with_frame_stickpoint", true) == 0) {
            z = false;
        }
        if (z && C0CHQ.LIZ().getAccountService().isLogin()) {
            C0L7R c0l7r = (C0L7R) awS70S0500000_8.l0;
            ShortVideoContext shortVideoContext = (ShortVideoContext) awS70S0500000_8.l1;
            c0l7r.getClass();
            C0L7R.LJJIIJZLJL(shortVideoContext, "upload_frame", "start", 0L, null);
            try {
                C1457540o24 c1457540o24 = new C1457540o24(((MediaModel) ((List) awS70S0500000_8.l2).get(0)).LJFF(), ((C238400w2) awS70S0500000_8.l3).element);
                C573430MeL c573430MeL = C573430MeL.LIZ;
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS70S0500000_8.l4;
                Boolean bool = Boolean.TRUE;
                c573430MeL.getClass();
                c1457540o24.LIZ = C573430MeL.LIZ(videoPublishEditModel, bool);
                C11NZ c11nzLIZJ = C1457440o1u.LIZJ(c1457540o24, false, null, 6);
                if (c11nzLIZJ != null) {
                    C01GW c01gw = StickPointRecommendMusicTimeOutOpt.LIZIZ;
                    if (((StickPointRecommendMusicTimeOutOpt.StickPointRecommendMusicTimeOutOptConfig) c01gw.getValue()).isEnable) {
                        jLJFF = ((StickPointRecommendMusicTimeOutOpt.StickPointRecommendMusicTimeOutOptConfig) c01gw.getValue()).uploadFrameTimeoutMs;
                    } else {
                        SettingsManager.LIZLLL().getClass();
                        jLJFF = SettingsManager.LJFF("studio_recommend_music_delay_video", 0L);
                    }
                    if (jLJFF > 0) {
                        c11nzLIZJ = c11nzLIZJ.LJLJI(jLJFF, TimeUnit.MILLISECONDS);
                    }
                    String str = (String) c11nzLIZJ.LIZLLL();
                    C0L7R c0l7r2 = (C0L7R) awS70S0500000_8.l0;
                    ShortVideoContext shortVideoContext2 = (ShortVideoContext) awS70S0500000_8.l1;
                    List<? extends MediaModel> list = (List) awS70S0500000_8.l2;
                    c0l7r2.getClass();
                    Pair pairLJIILJJIL = C0L7R.LJIILJJIL();
                    boolean zBooleanValue = ((Boolean) pairLJIILJJIL.getFirst()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) pairLJIILJJIL.getSecond()).booleanValue();
                    if (zBooleanValue && C123100dR.LIZ(str)) {
                        C090X.LIZ.getClass();
                        if (C090X.LIZ(null, zBooleanValue2) && ((Boolean) C283090B7r.LIZ.getValue()).booleanValue()) {
                            c0l7r2.LJJIJL(shortVideoContext2, str, list);
                        }
                    }
                    c0l7r2.getClass();
                    C0L7R.LJJIIJZLJL(shortVideoContext2, "upload_frame", "success", 0L, null);
                    return str;
                }
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                C0L7R c0l7r3 = (C0L7R) awS70S0500000_8.l0;
                ShortVideoContext shortVideoContext3 = (ShortVideoContext) awS70S0500000_8.l1;
                c0l7r3.getClass();
                C0L7R.LJJIIJZLJL(shortVideoContext3, "upload_frame", "failure(InterruptedException)", 0L, null);
                return null;
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C0L7R c0l7r4 = (C0L7R) awS70S0500000_8.l0;
                ShortVideoContext shortVideoContext4 = (ShortVideoContext) awS70S0500000_8.l1;
                c0l7r4.getClass();
                C0L7R.LJJIIJZLJL(shortVideoContext4, "upload_frame", "failure(RuntimeException)", 0L, null);
                return null;
            } catch (ExecutionException e3) {
                TryCatchGuardChecker.doCheck(e3);
                C0L7R c0l7r5 = (C0L7R) awS70S0500000_8.l0;
                ShortVideoContext shortVideoContext5 = (ShortVideoContext) awS70S0500000_8.l1;
                c0l7r5.getClass();
                C0L7R.LJJIIJZLJL(shortVideoContext5, "upload_frame", "failure(ExecutionException)", 0L, null);
                return null;
            } catch (TimeoutException e4) {
                TryCatchGuardChecker.doCheck(e4);
                C0L7R c0l7r6 = (C0L7R) awS70S0500000_8.l0;
                ShortVideoContext shortVideoContext6 = (ShortVideoContext) awS70S0500000_8.l1;
                c0l7r6.getClass();
                C0L7R.LJJIIJZLJL(shortVideoContext6, "upload_frame", "failure(TimeoutException)", 0L, null);
                return null;
            }
        }
        return null;
    }

    public static final Object invoke$1(AwS70S0500000_8 awS70S0500000_8) {
        ((InterfaceC576180Mim) awS70S0500000_8.l0).LIZIZ((Field) awS70S0500000_8.l1, (Map) awS70S0500000_8.l2, awS70S0500000_8.l3, (Annotation) awS70S0500000_8.l4);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS70S0500000_8 awS70S0500000_8) {
        C0MAY c0may = C0MAY.LIZIZ;
        C201955140j.LJIILJJIL(c0may, "[DraftRoute] NLEDraftBuilder fetch audio enhance model success");
        C1449720npS.LIZIZ((C1463670oBx) awS70S0500000_8.l1, (VideoPublishEditModel) awS70S0500000_8.l0);
        ((NLEEditor) awS70S0500000_8.l2).done();
        ((VideoPublishEditModel) awS70S0500000_8.l0).setNleData(((NLEEditor) awS70S0500000_8.l2).store());
        C1428470nHB.LLIIZ((Intent) awS70S0500000_8.l3, (VideoPublishEditModel) awS70S0500000_8.l0);
        C1660680tJi.LIZ().LJIIJ((Context) awS70S0500000_8.l4, (Intent) awS70S0500000_8.l3);
        C201955140j.LJIILJJIL(c0may, "[DraftRoute] openVideoPublishPage done (nleImpl+audioEnhance)");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS70S0500000_8(C0L7R c0l7r, C0L7R c0l7r2, ShortVideoContext shortVideoContext, List<? extends MediaModel> list, C238400w2 c238400w2, VideoPublishEditModel videoPublishEditModel) {
        super(0);
        this.$t = videoPublishEditModel;
        this.l0 = c0l7r;
        this.l1 = c0l7r2;
        this.l2 = shortVideoContext;
        this.l3 = list;
        this.l4 = c238400w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS70S0500000_8(InterfaceC576180Mim interfaceC576180Mim, InterfaceC576180Mim<R> interfaceC576180Mim2, Field field, Map<?, ?> map, Object obj, R r) {
        super(0);
        this.$t = r;
        this.l0 = interfaceC576180Mim;
        this.l1 = interfaceC576180Mim2;
        this.l2 = field;
        this.l3 = map;
        this.l4 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0500000_8(Context context, Intent intent, NLEEditor nLEEditor, C1463670oBx c1463670oBx, VideoPublishEditModel videoPublishEditModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoPublishEditModel;
        this.l1 = c1463670oBx;
        this.l2 = nLEEditor;
        this.l3 = intent;
        this.l4 = context;
    }
}
