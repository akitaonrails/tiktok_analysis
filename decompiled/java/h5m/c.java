package h5m;

import X.C0MPJ;
import X.C0MPK;
import X.C0WZX;
import X.C1397620mTQ;
import X.C14D2;
import X.C1701330uNH;
import X.C20622515mp;
import X.C2204961BRm;
import X.C2216131BoR;
import X.C443120HZe;
import X.C531760KtK;
import X.C532330KuF;
import X.C545820Lau;
import X.C786410Ut5;
import X.C810670Vr7;
import X.DialogInterfaceOnClickListenerC580940MqS;
import X.DialogInterfaceOnDismissListenerC580960MqU;
import X.EnumC1412640mre;
import X.InterfaceC2280171EMt;
import X.InterfaceC523450Kfv;
import Y.AObjectS203S0300000_8;
import Y.AObjectS310S0200000_8;
import Y.AObjectS351S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview.TemplateFeedActivity;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements InterfaceC523450Kfv {
    @Override // X.InterfaceC523450Kfv
    public final boolean LJIIIZ() {
        return C0MPK.LJ();
    }

    @Override // X.InterfaceC523450Kfv
    public final C443120HZe<String, String, String> LIZ(String str) {
        String str2;
        String str3;
        C532330KuF c532330KuFLJIIIIZZ = ((ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class)).LJIIIIZZ(str);
        String str4 = null;
        if (c532330KuFLJIIIIZZ != null) {
            str4 = c532330KuFLJIIIIZZ.LIZ;
        }
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        if (c532330KuFLJIIIIZZ == null || (str2 = c532330KuFLJIIIIZZ.LIZIZ) == null) {
            str2 = "";
        }
        if (c532330KuFLJIIIIZZ != null && (str3 = c532330KuFLJIIIIZZ.LJ) != null) {
            str5 = str3;
        }
        return new C443120HZe<>(str4, str2, str5);
    }

    @Override // X.InterfaceC523450Kfv
    public final int LIZIZ(Parcelable parcelable) {
        MvThemeData mvThemeData;
        if ((parcelable instanceof MvThemeData) && (mvThemeData = (MvThemeData) parcelable) != null) {
            return mvThemeData.isMvAnchor;
        }
        return 0;
    }

    @Override // X.InterfaceC523450Kfv
    public final String LIZJ(Parcelable parcelable) {
        MvThemeData mvThemeData;
        Effect effect;
        String name;
        if (parcelable instanceof MvThemeData) {
            mvThemeData = (MvThemeData) parcelable;
        } else {
            mvThemeData = null;
        }
        if (mvThemeData == null || (effect = mvThemeData.effect) == null || effect.getName() == null || (name = mvThemeData.effect.getName()) == null) {
            return "";
        }
        return name;
    }

    @Override // X.InterfaceC523450Kfv
    public final String LIZLLL(Parcelable parcelable) {
        MvThemeData mvThemeData;
        if ((parcelable instanceof MvThemeData) && (mvThemeData = (MvThemeData) parcelable) != null) {
            return mvThemeData.getMvId();
        }
        return "";
    }

    @Override // X.InterfaceC523450Kfv
    public final boolean LJI(ShortVideoContext shortVideoContext) {
        if (C0MPK.LJ() && shortVideoContext != null) {
            return !shortVideoContext.LJJLL();
        }
        return false;
    }

    @Override // X.InterfaceC523450Kfv
    public final void LJIIIIZZ(Activity activity, C0MPJ c0mpj) {
        if (C20622515mp.LJIILIIL(activity)) {
            return;
        }
        String str = TemplateFeedActivity._pnsPageId;
        o.LJFF(C2216131BoR.LIZ());
        Bundle bundle = new Bundle();
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(creativeInfo);
        shortVideoContext.creativeInfo = creativeInfo;
        shortVideoContext.LJ().setCreationId(creativeInfo.getCreationId());
        shortVideoContext.shootWay = c0mpj.LIZIZ;
        shortVideoContext.enterFrom = c0mpj.LIZLLL;
        shortVideoContext.enterMethod = c0mpj.LJ;
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        creativeModel.groupId = c0mpj.LJFF;
        creativeModel.templateSchemaData.schemaTag = c0mpj.LIZJ;
        if (c0mpj.LJI) {
            creativeModel.postLandingModel.landingBack = Intrinsics.LJFF("1", c0mpj.LJII);
            shortVideoContext.creativeModel.postLandingModel.backUrl = c0mpj.LJIIIIZZ;
        }
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
        C786410Ut5.LJJJI("key_template_id", c0mpj.LIZ, bundle);
        Intent intent = new Intent(activity, (Class<?>) TemplateFeedActivity.class);
        intent.putExtras(bundle);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkj9dPSVF/XyG/+XDC6IW4f9NOWzFbhFWfvn9WhYFXLzQgZ6m+13I/Yhj", null));
    }

    @Override // X.InterfaceC523450Kfv
    public final void LJFF(Parcelable parcelable, Scene scene, DialogInterfaceOnClickListenerC580940MqS dialogInterfaceOnClickListenerC580940MqS) {
        MvThemeData mvThemeData;
        Context contextLIZIZ;
        Activity activity;
        Effect effect;
        EnumC1412640mre enumC1412640mre = null;
        if (parcelable instanceof MvThemeData) {
            mvThemeData = (MvThemeData) parcelable;
            if (mvThemeData != null) {
                enumC1412640mre = EnumC1412640mre.MV_TEMPLATE;
            }
        } else {
            mvThemeData = null;
        }
        if (enumC1412640mre == EnumC1412640mre.MV_TEMPLATE && C0MPK.LIZLLL(mvThemeData) && (contextLIZIZ = C545820Lau.LIZIZ(scene)) != null && (activity = scene.mActivity) != null && !C545820Lau.LJ(scene) && mvThemeData != null && (effect = mvThemeData.effect) != null) {
            if (!C810670Vr7.LIZJ(o.LIZ, 0, "mv_template").getBoolean(effect.getId(), false)) {
                C1397620mTQ c1397620mTQ = new C1397620mTQ(contextLIZIZ);
                c1397620mTQ.LIZJ(0, contextLIZIZ.getResources().getString(2131822624), new AObjectS310S0200000_8(mvThemeData, 6));
                c1397620mTQ.LIZJ(1, contextLIZIZ.getResources().getString(2131822623), new AObjectS351S0100000_8(dialogInterfaceOnClickListenerC580940MqS, 8));
                ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(activity, new AObjectS203S0300000_8(contextLIZIZ, c1397620mTQ, new DialogInterfaceOnDismissListenerC580960MqU(mvThemeData, dialogInterfaceOnClickListenerC580940MqS, 1), 1));
            }
        }
    }

    @Override // X.InterfaceC523450Kfv
    public final void LJ(String str, Pair pair, String str2, String str3, Function1 function1, Function2 function2) {
        C531760KtK.LIZ(str, pair, 2, str2, str3, new AwS587S0100000_8(function1, 588), new AwS616S0100000_2(function2, (Function2<? super String, ? super String, Unit>) 93));
    }

    @Override // X.InterfaceC523450Kfv
    public final void LJII(String str, Pair<String, String> pair, int i, String str2, String str3, InterfaceC2280171EMt<? super String, ? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, Unit> interfaceC2280171EMt, Function2<? super String, ? super String, Unit> function2) {
        C531760KtK.LIZ(str, pair, i, str2, str3, new AwS587S0100000_8(interfaceC2280171EMt, (InterfaceC2280171EMt<? super String, ? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, Unit>) 589), new AwS622S0100000_8(function2, (Function2<? super String, ? super String, Unit>) 39));
    }
}
