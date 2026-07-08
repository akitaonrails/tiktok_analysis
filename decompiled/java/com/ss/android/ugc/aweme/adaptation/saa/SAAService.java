package com.ss.android.ugc.aweme.adaptation.saa;

import X.AbstractC1387200mCc;
import X.C0MWH;
import X.C0WZX;
import X.C1906580ziK;
import X.C198H;
import X.C19EG;
import X.C20622515mp;
import X.C2204961BRm;
import X.InterfaceC20597015ii;
import X.InterfaceC524950KiL;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordContainerScene;
import com.ss.android.ugc.aweme.social.creation.edit.SocialVideoEditContainerScene;
import com.ss.android.ugc.aweme.social.creation.record.SocialRecordScene;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class SAAService implements ICreativeSAAService {
    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final boolean hasCreativeToolContainerScene() {
        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
            if (abstractC1387200mCc.LIZ instanceof CreativeToolContainerScene) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final Lifecycle activityGetLifecycleSafely(C19EG c19eg) {
        Lifecycle lifecycleEI;
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(c19eg);
        if (interfaceC20597015iiLIZJ == null || (lifecycleEI = interfaceC20597015iiLIZJ.EI()) == null) {
            Lifecycle lifecycleFindTopSAFExpLifecycle = IMainSAFLifecycleKt.findTopSAFExpLifecycle(c19eg);
            if (lifecycleFindTopSAFExpLifecycle == null) {
                return c19eg.getLifecycle();
            }
            return lifecycleFindTopSAFExpLifecycle;
        }
        return lifecycleEI;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final void finishActivitySafely(Activity activity) {
        if (isSAAActivity(activity)) {
            finishSAAActivitySafely(activity);
        } else {
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final void finishCurrentPage(Activity activity) {
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
        if (interfaceC20597015iiLIZJ != null) {
            C198H c198hLC = interfaceC20597015iiLIZJ.LC();
            if (c198hLC != null) {
                c198hLC.finish();
                return;
            }
            return;
        }
        activity.finish();
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final void finishSAAActivitySafely(Activity activity) {
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
        if (interfaceC20597015iiLIZJ != null) {
            interfaceC20597015iiLIZJ.fM();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final InterfaceC524950KiL getAVListenableActivityRegistry(Activity activity) {
        Scene currentScene = getCurrentScene(activity);
        Object obj = activity;
        if (currentScene != null) {
            obj = currentScene;
        }
        if (obj instanceof InterfaceC524950KiL) {
            return (InterfaceC524950KiL) obj;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final LifecycleOwner getCreativeLifecycleOwner(Activity activity) {
        C198H c198hLC;
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
        if (interfaceC20597015iiLIZJ != null && (c198hLC = interfaceC20597015iiLIZJ.LC()) != null) {
            return c198hLC.getScene();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final Scene getCurrentScene(Activity activity) {
        C198H c198hLC;
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
        if (interfaceC20597015iiLIZJ == null || (c198hLC = interfaceC20597015iiLIZJ.LC()) == null) {
            return null;
        }
        return c198hLC.getScene();
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final Scene getSecondScene(Activity activity) {
        List<Scene> listKI;
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
        if (interfaceC20597015iiLIZJ == null || (listKI = interfaceC20597015iiLIZJ.kI()) == null || listKI.size() < 2) {
            return null;
        }
        return (Scene) ListProtector.get(listKI, listKI.size() - 2);
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final boolean isCreativePage(AbstractC1387200mCc abstractC1387200mCc) {
        if (abstractC1387200mCc == null) {
            return false;
        }
        Object obj = abstractC1387200mCc.LIZ;
        if (!(obj instanceof SAASceneWrapperActivity) && !(obj instanceof SAAActivity) && !(obj instanceof CreativeToolContainerScene)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final boolean isEditScene(Activity activity) {
        Scene currentScene = getCurrentScene(activity);
        if (currentScene != null) {
            return currentScene instanceof VideoEditContainerScene;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final boolean isEditSceneInStory(Activity activity) {
        Scene currentScene = getCurrentScene(activity);
        if (currentScene != null) {
            return currentScene instanceof SocialVideoEditContainerScene;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final boolean isPublishEditScene(Activity activity) {
        Scene currentScene = getCurrentScene(activity);
        if (currentScene != null) {
            return currentScene instanceof VideoPublishEditContainerScene;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final boolean isPublishScene(Activity activity) {
        Scene currentScene = getCurrentScene(activity);
        if (currentScene != null) {
            return currentScene instanceof VideoPublishContainerScene;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final boolean isSAAActivity(Activity activity) {
        if (C20622515mp.LIZJ(activity) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final boolean isShootScene(Activity activity) {
        Scene currentScene = getCurrentScene(activity);
        if (currentScene == null) {
            return false;
        }
        if (!(currentScene instanceof VideoRecordContainerScene) && !(currentScene instanceof SocialRecordScene)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final void invokeMethodsSafely(Activity activity, Function0<Unit> function0) {
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
        if (interfaceC20597015iiLIZJ != null) {
            interfaceC20597015iiLIZJ.ZN(new AwS552S0100000_8(function0, (Function0<Unit>) 20));
        } else {
            function0.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final void openPublishPage(Context context, Intent intent) {
        Bundle extras;
        if (context == null) {
            return;
        }
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        C0MWH.LJIIJJI(context, extras, null);
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final void setResult(Activity activity, int i, Intent intent) throws Throwable {
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
        if (interfaceC20597015iiLIZJ != null) {
            C198H c198hLC = interfaceC20597015iiLIZJ.LC();
            if (c198hLC != null) {
                c198hLC.setResult(i, intent);
                return;
            }
            return;
        }
        C2204961BRm.LJIIL(i, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOusYo/a3Sb5FC8T5ldegbV0pfY9QmsrWlw=", null));
    }
}
