package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0AZC;
import X.C0CHQ;
import X.C0MQU;
import X.C1403840mdS;
import X.C1642080spi;
import X.C1664600tQ2;
import X.C19EG;
import X.C1DRG;
import X.C201955140j;
import X.C20684815ws;
import X.C21305518Zh;
import X.C2344009Gk;
import X.C282920B7a;
import X.C554890LpX;
import X.C562670M4z;
import X.C568710MSf;
import X.C580810MqF;
import X.C724240Sb0;
import X.InterfaceC1444410ngt;
import android.os.Bundle;
import android.view.View;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.explore.assem.creation.ExploreText2ImageComponent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.v2.assem.MusicCreateSongAssem;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService;
import com.ss.android.ugc.aweme.services.external.ability.TextToImageRouteParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.CelebrationVideoTemplatePreviewScene;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AbS690S0100000_8 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS690S0100000_8(Object obj, int i) {
        super(500L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AbS690S0100000_8 abS690S0100000_8, View view) {
        if (view != null) {
            ((C21305518Zh) abS690S0100000_8.l0).LLLLIL().LIZIZ.invoke();
        }
    }

    public static final void LIZ$1(AbS690S0100000_8 abS690S0100000_8, View view) {
        boolean z;
        IOpenTextToImageService iOpenTextToImageServiceOpenTextToImageService;
        if (view != null) {
            ExploreText2ImageComponent exploreText2ImageComponent = (ExploreText2ImageComponent) abS690S0100000_8.l0;
            exploreText2ImageComponent.getClass();
            String string = UUID.randomUUID().toString();
            C562670M4z.LIZ.getClass();
            Keva keva = C562670M4z.LIZIZ;
            if (keva.getBoolean("text_to_image_entrance_anim_shown", false) && (((Boolean) C0AZC.LIZ.getValue()).booleanValue() || ((Boolean) C282920B7a.LIZ.getValue()).booleanValue())) {
                z = false;
            } else {
                z = true;
            }
            C19EG c19egLIZ = C724240Sb0.LIZ(exploreText2ImageComponent);
            if (c19egLIZ != null) {
                if (z) {
                    keva.storeBoolean("text_to_image_entrance_anim_shown", true);
                }
                IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                if (iExternalService != null && (iOpenTextToImageServiceOpenTextToImageService = iExternalService.openTextToImageService()) != null) {
                    iOpenTextToImageServiceOpenTextToImageService.openTextToImage(c19egLIZ, "", "homepage_explore", new TextToImageRouteParams(string, "", "explore_quick_entrance", Boolean.FALSE, Boolean.TRUE, new Bundle(), null, new Bundle(), new Bundle(), true, false, "", true, false, "", null, null, null, null, null, Boolean.valueOf(z), null, 0, null, null, null, null, null, null, false, null, 2146402304, null));
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                c2344009Gk.LJIIIIZZ("enter_method", "");
                c2344009Gk.LJIIIIZZ("shoot_way", "explore_quick_entrance");
                c2344009Gk.LJIIIIZZ("creation_id", string);
                c2344009Gk.LJIIIIZZ("previous_page", "");
                C20684815ws.LJIILLIIL("shoot", c2344009Gk.LIZ);
            }
        }
    }

    public static final void LIZ$2(AbS690S0100000_8 abS690S0100000_8, View view) {
        if (view != null) {
            MusicCreateSongAssem musicCreateSongAssem = (MusicCreateSongAssem) abS690S0100000_8.l0;
            musicCreateSongAssem.getClass();
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("MusicDetailFragment", new C580810MqF(musicCreateSongAssem, 6));
        }
    }

    public static final void LIZ$3(AbS690S0100000_8 abS690S0100000_8, View view) {
        if (view != null) {
            ((C1642080spi) abS690S0100000_8.l0).LLJJIJIL.invoke();
        }
    }

    public static final void LIZ$4(AbS690S0100000_8 abS690S0100000_8, View view) {
        if (view != null) {
            ((CelebrationVideoTemplatePreviewScene) abS690S0100000_8.l0).LLLLLJIL("on_this_day_slider_edit");
        }
    }

    public static final void LIZ$5(AbS690S0100000_8 abS690S0100000_8, View view) {
        InterfaceC1444410ngt interfaceC1444410ngt;
        if (view != null) {
            C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ((CelebrationVideoTemplatePreviewScene) abS690S0100000_8.l0)).LLJJI;
            if (c1drg != null && (interfaceC1444410ngt = (InterfaceC1444410ngt) c1drg.LJIIL(null, InterfaceC1444410ngt.class)) != null) {
                interfaceC1444410ngt.s80();
            }
            C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
            VideoPublishEditModel videoPublishEditModel = ((CelebrationVideoTemplatePreviewScene) abS690S0100000_8.l0).LLJJJIL;
            String enterFrom = videoPublishEditModel.getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            C1403840mdS.LIZJ(videoPublishEditModel, enterFrom, null);
        }
    }

    public static final void LIZ$6(AbS690S0100000_8 abS690S0100000_8, View view) {
        if (view != null) {
            C201955140j.LIZLLL(C554890LpX.LIZIZ, "OnThisDayVideoPreviewScene", "SurfaceView clicked, triggering edit callback");
            C0MQU c0mqu = ((C568710MSf) abS690S0100000_8.l0).LLJL;
            if (c0mqu != null) {
                c0mqu.LIZ();
            }
        }
    }

    public static final void LIZ$7(AbS690S0100000_8 abS690S0100000_8, View view) {
        if (view != null) {
            ((Function1) abS690S0100000_8.l0).invoke(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS690S0100000_8(Object obj, int i, int i2) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }
}
