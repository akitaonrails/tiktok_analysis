package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.AbstractC1387200mCc;
import X.C0Y8U;
import X.C1397950mTx;
import X.C139V;
import X.C1688830u37;
import X.C198S;
import X.C19FO;
import X.C2097608Jq;
import X.C356901a3;
import X.C860330Xp1;
import X.C860340Xp2;
import X.C860540XpM;
import X.C860570XpP;
import X.C861670XrB;
import X.C861730XrH;
import X.InterfaceC1688840u38;
import X.InterfaceC861690XrD;
import Y.AObjectS249S0100000_32;
import android.app.Activity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity;
import com.ss.android.ugc.aweme.port.internal.IActivityPageService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordContainerScene;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ActivityStateServiceImpl implements IActivityPageService {
    public final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("com.ss.android.ugc.gamora.editorpro.EditorProActivity", "tool_editor_pro_page"), new Pair("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "tool_choose_cover_page"));
    public final Map<String, String> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(VideoEditContainerScene.class.getName(), "tool_edit_page"), new Pair(ExteriorVideoRecordScene.class.getName(), "tool_record_page"), new Pair(VideoRecordContainerScene.class.getName(), "tool_record_page"));

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0XrB] */
    @Override // com.ss.android.ugc.aweme.port.internal.IActivityPageService
    public final void listenToCurrentPage(final Function2<? super Boolean, ? super String, Unit> function2) {
        final ?? r0 = new C0Y8U() { // from class: X.0XrB
            @Override // X.C0Y8U, X.C19AH
            public final void LIZ(Scene scene) {
                LJJJLL(scene);
            }

            @Override // X.C0Y8U, X.C19AH
            public final void LIZLLL(Scene scene) {
                LJJJLL(scene);
            }

            @Override // X.C0Y8U, X.C19AH
            public final void LJJIIZI(Scene scene) {
                LJJJLL(scene);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void LJJJLL(Scene scene) {
                if (this.LIZ.LIZIZ.containsKey(scene.getClass().getName())) {
                    function2.invoke(Boolean.TRUE, this.LIZ.LIZIZ.get(scene.getClass().getName()));
                } else if (scene instanceof InterfaceC855420Xh6) {
                    function2.invoke(Boolean.TRUE, ((InterfaceC855420Xh6) scene).LJJLL());
                } else {
                    function2.invoke(Boolean.FALSE, this.LIZ.LIZIZ.get(scene.getClass().getName()));
                }
            }
        };
        C139V c139v = C861730XrH.LIZ;
        InterfaceC1688840u38 interfaceC1688840u38 = new InterfaceC1688840u38() { // from class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ActivityStateServiceImpl.listenToCurrentPage.1

            /* JADX INFO: renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ActivityStateServiceImpl$listenToCurrentPage$1$2, reason: invalid class name */
            public final class AnonymousClass2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
                public final /* synthetic */ Activity LL;
                public final /* synthetic */ C861670XrB LLILLJJLI;

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                    C356901a3.LIZ(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                    C356901a3.LIZIZ(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                    C356901a3.LIZJ(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                    C356901a3.LIZLLL(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                    C356901a3.LJFF(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onStart(LifecycleOwner lifecycleOwner) {
                    ((C19FO) this.LL).getLifecycle().removeObserver(this);
                    CreativeToolContainerScene creativeToolContainerSceneLLLLZI = ((SAASceneWrapperActivity) this.LL).LLLLZI();
                    if (creativeToolContainerSceneLLLLZI == null) {
                        return;
                    }
                    creativeToolContainerSceneLLLLZI.LLJLILLLLZIIL.LIZ(creativeToolContainerSceneLLLLZI, new AObjectS249S0100000_32(this.LLILLJJLI, 13));
                }

                public AnonymousClass2(Activity activity, C861670XrB c861670XrB) {
                    this.LL = activity;
                    this.LLILLJJLI = c861670XrB;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1688840u38
            public final void LIZ(C1688830u37 c1688830u37) {
                byte b;
                byte b2;
                NavigationScene navigationScene;
                String str;
                byte b3;
                byte b4;
                CreativeToolContainerScene creativeToolContainerSceneLLLLZI;
                NavigationScene navigationScene2;
                NavigationScene navigationScene3;
                AbstractC1387200mCc abstractC1387200mCc = c1688830u37.LIZ;
                if (abstractC1387200mCc instanceof C1397950mTx) {
                    Activity activity = ((C1397950mTx) abstractC1387200mCc).LIZLLL;
                    if (!ActivityStateServiceImpl.this.LIZ.containsKey(activity.getLocalClassName())) {
                        str = "unknown";
                    } else {
                        str = ActivityStateServiceImpl.this.LIZ.get(activity.getLocalClassName());
                    }
                    if (Intrinsics.LJFF(str, "unknown")) {
                        if (activity instanceof SAAActivity) {
                            if (c1688830u37.LIZ()) {
                                ((SAAActivity) activity).LLIZLLLIL.LIZ((LifecycleOwner) activity, new AObjectS249S0100000_32(r0, 14));
                                return;
                            } else {
                                if (!c1688830u37.LIZIZ() || (navigationScene3 = ((SAAActivity) activity).LLIZ) == null) {
                                    return;
                                }
                                navigationScene3.unregisterChildSceneLifecycleCallbacks(r0);
                                return;
                            }
                        }
                        if (activity instanceof SAASceneWrapperActivity) {
                            if (c1688830u37.LIZ()) {
                                ((C19FO) activity).getLifecycle().addObserver(new AnonymousClass2(activity, r0));
                                return;
                            } else {
                                if (!c1688830u37.LIZIZ() || (creativeToolContainerSceneLLLLZI = ((SAASceneWrapperActivity) activity).LLLLZI()) == null || (navigationScene2 = creativeToolContainerSceneLLLLZI.LLJLIL) == null) {
                                    return;
                                }
                                navigationScene2.unregisterChildSceneLifecycleCallbacks(r0);
                                return;
                            }
                        }
                        if (!c1688830u37.LIZ() && (b4 = c1688830u37.LIZIZ) != 3 && b4 != 5) {
                            return;
                        }
                        function2.invoke(Boolean.FALSE, null);
                        return;
                    }
                    if (!c1688830u37.LIZ() && (b3 = c1688830u37.LIZIZ) != 3 && b3 != 5) {
                        return;
                    }
                    function2.invoke(Boolean.TRUE, str);
                    return;
                }
                if (abstractC1387200mCc instanceof C198S) {
                    Scene scene = ((C198S) abstractC1387200mCc).LIZLLL;
                    if (scene instanceof CreativeToolContainerScene) {
                        if (c1688830u37.LIZ()) {
                            ((CreativeToolContainerScene) scene).LLJLILLLLZIIL.LIZ(scene, new AObjectS249S0100000_32(r0, 15));
                            return;
                        } else {
                            if (!c1688830u37.LIZIZ() || (navigationScene = ((CreativeToolContainerScene) scene).LLJLIL) == null) {
                                return;
                            }
                            navigationScene.unregisterChildSceneLifecycleCallbacks(r0);
                            return;
                        }
                    }
                    if (!c1688830u37.LIZ() && (b2 = c1688830u37.LIZIZ) != 3 && b2 != 5) {
                        return;
                    }
                    function2.invoke(Boolean.FALSE, null);
                    return;
                }
                if (!c1688830u37.LIZ() && (b = c1688830u37.LIZIZ) != 3 && b != 5) {
                    return;
                }
                function2.invoke(Boolean.FALSE, null);
            }
        };
        c139v.LIZIZ();
        ((ArrayList) c139v.LIZJ).add(interfaceC1688840u38);
        InterfaceC861690XrD interfaceC861690XrD = new InterfaceC861690XrD() { // from class: X.0XrC
            @Override // X.InterfaceC861690XrD
            public final void onAppStateChanged(int i) {
                if (i == 2) {
                    function2.invoke(Boolean.FALSE, null);
                }
            }
        };
        c139v.LIZIZ();
        ((ArrayList) c139v.LIZIZ).add(interfaceC861690XrD);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IActivityPageService
    public final void updateCurrentScene(String str, boolean z) {
        String str2;
        C860570XpP c860570XpP = C860540XpM.LIZ;
        C860570XpP c860570XpP2 = C860540XpM.LIZ;
        if (!z) {
            str2 = "";
        } else {
            str2 = str;
        }
        c860570XpP2.LJIJJ = str2;
        C860330Xp1 c860330Xp1 = C860340Xp2.LIZ;
        if (!z) {
            str = "";
        }
        c860330Xp1.LJIJJ = str;
    }
}
