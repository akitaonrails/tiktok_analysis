package kotlin.jvm.internal;

import X.AbstractC551020LjI;
import X.C05P0;
import X.C08CL;
import X.C08CM;
import X.C09AY;
import X.C0ET4;
import X.C0MJ9;
import X.C1412490mrP;
import X.C1417310mzB;
import X.C1428470nHB;
import X.C1DRG;
import X.C201955140j;
import X.C2188811AlT;
import X.C259800zU;
import X.C443120HZe;
import X.C533720KwU;
import X.C534820KyG;
import X.C534860KyK;
import X.C545510LaP;
import X.C550560LiY;
import X.C550580Lia;
import X.C551070LjN;
import X.C551080LjO;
import X.C551100LjQ;
import X.C551110LjR;
import X.C551120LjS;
import X.C552700Lm0;
import X.C552780Lm8;
import X.C559610Lx9;
import X.C571500MbE;
import X.C572850MdP;
import X.EnumC1412640mre;
import X.InterfaceC1680560tpm;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.AlbumAiContentRepositoryImpl;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.texttoimage.choose.TextToImageChooseScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS62S0210000_8 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS62S0210000_8 awS62S0210000_8, Object obj) {
        C1417310mzB c1417310mzB = (C1417310mzB) obj;
        if (awS62S0210000_8.z2 && ((AVMusic) awS62S0210000_8.l0) != null) {
            return ((ShortVideoContext) awS62S0210000_8.l1).LJIIJJI();
        }
        if (c1417310mzB.LIZJ == EnumC1412640mre.CUT_SAME.getValue()) {
            if (Intrinsics.LJFF(c1417310mzB.LJIJJLI, Boolean.TRUE)) {
                return "original";
            }
            return "lv_sync";
        }
        return "auto_cut_music_recommend";
    }

    public static final Object invoke$1(AwS62S0210000_8 awS62S0210000_8, Object obj) {
        C1417310mzB c1417310mzB = (C1417310mzB) obj;
        if (awS62S0210000_8.z2 && ((AVMusic) awS62S0210000_8.l0) != null) {
            return C1412490mrP.LIZIZ((VideoPublishEditModel) awS62S0210000_8.l1);
        }
        if (c1417310mzB.LIZJ == EnumC1412640mre.CUT_SAME.getValue()) {
            return "lv_sync";
        }
        if (c1417310mzB.LIZ == C0MJ9.MIX_EDITING && C1428470nHB.LJLI((VideoPublishEditModel) awS62S0210000_8.l1)) {
            return "mix_template_music_recommend";
        }
        return "auto_cut_music_recommend";
    }

    public static final Object invoke$2(AwS62S0210000_8 awS62S0210000_8, Object obj) {
        C1417310mzB c1417310mzB = (C1417310mzB) obj;
        if (awS62S0210000_8.z2 && ((AVMusic) awS62S0210000_8.l0) != null) {
            return C1412490mrP.LIZIZ((VideoPublishEditModel) awS62S0210000_8.l1);
        }
        if (c1417310mzB.LIZJ == EnumC1412640mre.CUT_SAME.getValue()) {
            if (Intrinsics.LJFF(c1417310mzB.LJIJJLI, Boolean.TRUE)) {
                return "original";
            }
            return "lv_sync";
        }
        if (c1417310mzB.LIZ == C0MJ9.MIX_EDITING && C1428470nHB.LJLI((VideoPublishEditModel) awS62S0210000_8.l1)) {
            return "mix_template_music_recommend";
        }
        return "auto_cut_music_recommend";
    }

    public static final Object invoke$3(AwS62S0210000_8 awS62S0210000_8, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("total count = ");
        sbLIZ.append(iIntValue);
        C201955140j.LIZLLL(c552700Lm0, "AlbumAiContentRepository", C2188811AlT.LIZIZ(sbLIZ));
        if (awS62S0210000_8.z2 && iIntValue <= 0 && ((C534820KyG) awS62S0210000_8.l0).LIZJ) {
            ((AlbumAiContentRepositoryImpl) awS62S0210000_8.l1).getClass();
            ((Keva) ((C533720KwU) C534860KyK.LIZ.getValue()).LIZ()).storeBoolean("has_ai_content", false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0MAP, android.view.View, android.widget.VideoView, java.lang.Object] */
    public static /* bridge */ /* synthetic */ Object invoke$4(AwS62S0210000_8 awS62S0210000_8, Object obj) {
        final Context context = (Context) obj;
        final ?? r5 = new VideoView(context) { // from class: X.0MAP
            @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
            public final void onMeasure(int i, int i2) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            }
        };
        SocMediaResource socMediaResource = (SocMediaResource) awS62S0210000_8.l0;
        C05P0 c05p0 = (C05P0) awS62S0210000_8.l1;
        final boolean z = awS62S0210000_8.z2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r5);
        r5.setLayoutParams(layoutParams);
        c05p0.setValue(r5);
        r5.setVideoURI(UriProtector.parse(socMediaResource.LIZ()));
        r5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.0MAN
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
                if (z) {
                    start();
                }
            }
        });
        return r5;
    }

    public static final Object invoke$5(AwS62S0210000_8 awS62S0210000_8, Object obj) {
        final boolean z = awS62S0210000_8.z2;
        final C05P0 c05p0 = (C05P0) awS62S0210000_8.l1;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.BasicMediaEngine$Video$5$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                VideoView value;
                VideoView value2;
                int i = C08CL.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i == 2 && z) {
                        VideoView value3 = c05p0.getValue();
                        if ((value3 != null && value3.isPlaying()) || (value2 = c05p0.getValue()) == null) {
                            return;
                        }
                        value2.start();
                        return;
                    }
                    return;
                }
                VideoView value4 = c05p0.getValue();
                if (value4 == null || !value4.isPlaying() || (value = c05p0.getValue()) == null) {
                    return;
                }
                value.pause();
            }
        };
        ((LifecycleOwner) awS62S0210000_8.l0).getLifecycle().addObserver(lifecycleEventObserver);
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) awS62S0210000_8.l0;
        final C05P0 c05p02 = (C05P0) awS62S0210000_8.l1;
        return new InterfaceC1680560tpm() { // from class: X.0MAK
            @Override // X.InterfaceC1680560tpm
            public final void dispose() {
                VideoView videoView = (VideoView) c05p02.getValue();
                if (videoView != null) {
                    videoView.stopPlayback();
                }
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    public static final Object invoke$6(AwS62S0210000_8 awS62S0210000_8, Object obj) {
        final C259800zU c259800zU = (C259800zU) awS62S0210000_8.l1;
        final boolean z = awS62S0210000_8.z2;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine$AndroidVideoView$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                VideoView videoView;
                VideoView videoView2;
                int i = C08CM.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i == 2 && z) {
                        VideoView videoView3 = c259800zU.element;
                        if ((videoView3 != null && videoView3.isPlaying()) || (videoView2 = c259800zU.element) == null) {
                            return;
                        }
                        videoView2.start();
                        return;
                    }
                    return;
                }
                VideoView videoView4 = c259800zU.element;
                if (videoView4 == null || !videoView4.isPlaying() || (videoView = c259800zU.element) == null) {
                    return;
                }
                videoView.pause();
            }
        };
        ((LifecycleOwner) awS62S0210000_8.l0).getLifecycle().addObserver(lifecycleEventObserver);
        final C259800zU c259800zU2 = (C259800zU) awS62S0210000_8.l1;
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) awS62S0210000_8.l0;
        return new InterfaceC1680560tpm() { // from class: X.0MAL
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1680560tpm
            public final void dispose() {
                VideoView videoView = (VideoView) c259800zU2.element;
                if (videoView != null) {
                    videoView.stopPlayback();
                }
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$7(AwS62S0210000_8 awS62S0210000_8, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C572850MdP c572850MdP = new C572850MdP((C1DRG) obj, C571500MbE.LJII(((TextToImageChooseScene) awS62S0210000_8.l1).getEditModel(), 0, 0, 7), null, (TextToImageChooseScene) awS62S0210000_8.l1, R.id.rpx, awS62S0210000_8.z2, 4, 0 == true ? 1 : 0);
        ((TextToImageChooseScene) awS62S0210000_8.l1).LLJLL = c572850MdP;
        ((C559610Lx9) awS62S0210000_8.l0).getClass();
        C559610Lx9.LIZ(c572850MdP);
        c572850MdP.afterInit$als_release(jUptimeMillis);
        return c572850MdP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AwS62S0210000_8 awS62S0210000_8, Object obj) {
        C552780Lm8 c552780Lm8 = (C552780Lm8) obj;
        C545510LaP c545510LaP = (C545510LaP) awS62S0210000_8.l0;
        C550580Lia c550580Lia = (C550580Lia) c545510LaP.LJIIJ;
        CreativeInfo creativeInfo = c550580Lia.LIZ;
        C551070LjN c551070LjN = (C551070LjN) c550580Lia.LIZJ;
        String str = c552780Lm8.LIZ;
        c552780Lm8.LIZIZ = (AIGCWorkflowConfig) new AwS51S2100000_8((AbstractC551020LjI) c545510LaP, (AbstractC551020LjI<C550580Lia<Object>>) c551070LjN.LJ, c551070LjN.LIZLLL, (String) 1).invoke();
        AwS93S1200000_8 awS93S1200000_8 = new AwS93S1200000_8((C545510LaP) awS62S0210000_8.l0, (C545510LaP<C550580Lia<C551070LjN>>) str, (String) c551070LjN, (C551070LjN) 11);
        C551080LjO c551080LjO = new C551080LjO();
        awS93S1200000_8.invoke(c551080LjO);
        c552780Lm8.LIZJ.putAll(c551080LjO.LIZ);
        C443120HZe c443120HZe = (C443120HZe) c552780Lm8.LIZ(new AwS30S0310000_8(creativeInfo, awS62S0210000_8.z2, (C550560LiY) awS62S0210000_8.l1, c551070LjN, 2));
        AwS217S0300000_8 awS217S0300000_8 = new AwS217S0300000_8((C551100LjQ) c443120HZe.getFirst(), (C551120LjS) c443120HZe.getThird(), (C551120LjS) c443120HZe.getSecond(), 52);
        C551110LjR c551110LjR = new C551110LjR();
        awS217S0300000_8.invoke(c551110LjR);
        ((ArrayList) c552780Lm8.LJ).addAll(c551110LjR.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS62S0210000_8(C545510LaP c545510LaP, C545510LaP<C550580Lia<C551070LjN>> c545510LaP2, boolean z, C550560LiY c550560LiY) {
        super(1);
        this.$t = c550560LiY;
        this.l0 = c545510LaP;
        this.z2 = c545510LaP2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS62S0210000_8(LifecycleOwner lifecycleOwner, LifecycleOwner lifecycleOwner2, C259800zU<VideoView> c259800zU, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = lifecycleOwner;
        this.l1 = lifecycleOwner2;
        this.z2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS62S0210000_8(LifecycleOwner lifecycleOwner, LifecycleOwner lifecycleOwner2, boolean z, C05P0<VideoView> c05p0) {
        super(1);
        this.$t = c05p0;
        this.l0 = lifecycleOwner;
        this.z2 = lifecycleOwner2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS62S0210000_8(SocMediaResource socMediaResource, SocMediaResource socMediaResource2, C05P0<VideoView> c05p0, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = socMediaResource;
        this.l1 = socMediaResource2;
        this.z2 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S0210000_8(boolean z, C534820KyG c534820KyG, AlbumAiContentRepositoryImpl albumAiContentRepositoryImpl, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c534820KyG;
        this.l1 = albumAiContentRepositoryImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S0210000_8(boolean z, AVMusic aVMusic, ShortVideoContext shortVideoContext, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = aVMusic;
        this.l1 = shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S0210000_8(boolean z, AVMusic aVMusic, VideoPublishEditModel videoPublishEditModel, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = aVMusic;
        this.l1 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S0210000_8(C0ET4 c0et4, C559610Lx9 c559610Lx9, TextToImageChooseScene textToImageChooseScene, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c559610Lx9;
        this.l1 = textToImageChooseScene;
        this.z2 = z;
    }
}
