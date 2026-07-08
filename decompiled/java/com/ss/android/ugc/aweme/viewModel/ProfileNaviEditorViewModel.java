package com.ss.android.ugc.aweme.viewModel;

import X.C004I;
import X.C09BH;
import X.C0VSJ;
import X.C19424410z4;
import X.C19425610zG;
import X.C19427910zd;
import X.C19429110zp;
import X.C20010313Rd;
import X.InterfaceC1635410sex;
import X.InterfaceC19403010vc;
import X.InterfaceC19423310yt;
import X.InterfaceC19426310zN;
import X.InterfaceC19426410zO;
import android.content.Context;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.experiment.NaviAvatarLokiConfig;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS80S0210000_29;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviEditorViewModel extends BaseJediViewModel<ProfileNaviEditorState> implements InterfaceC19426410zO {
    public static final /* synthetic */ int LLILZIL = 0;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new ProfileNaviEditorState(null, 0, null, null, null, null, null, false, false, false, false, false, false, false, 24, null);
    }

    public static InterfaceC19426310zN lR2(InterfaceC19403010vc interfaceC19403010vc) {
        InterfaceC19403010vc interfaceC19403010vc2;
        HashMap<String, InterfaceC19403010vc> map = C19429110zp.LJ;
        if (map != null && (interfaceC19403010vc2 = map.get(interfaceC19403010vc.getKey())) != null) {
            String groupId = interfaceC19403010vc2.getGroupId();
            if (groupId != null && groupId.length() != 0) {
                C19424410z4 c19424410z4 = C19429110zp.LIZIZ;
                if (c19424410z4 != null) {
                    return c19424410z4.LIZ(interfaceC19403010vc2.getGroupId());
                }
                return null;
            }
            C19424410z4 c19424410z42 = C19429110zp.LIZIZ;
            if (c19424410z42 != null) {
                return c19424410z42.LIZ(interfaceC19403010vc2.getKey());
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC19426410zO
    public final void Ls2(List list) {
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            setStateImmediate(new AwS608S0100000_29((C19427910zd) it2.next(), 569));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void init(Context context) {
        List<InterfaceC19423310yt> tabList;
        C20010313Rd.LIZ.getClass();
        C20010313Rd.LIZIZ(context);
        ((InterfaceC1635410sex) C20010313Rd.LIZJ.getValue()).LLJILJILJ();
        ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) FQ2();
        String sceneStickerPath = profileNaviEditorState.getSceneStickerPath();
        if (sceneStickerPath == null || sceneStickerPath.length() == 0 || (tabList = profileNaviEditorState.getTabList()) == null || tabList.isEmpty()) {
            nR2(false);
        }
        C19425610zG.LIZIZ = this;
    }

    public final void nR2(final boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(NaviAvatarLokiConfig.LIZ().pluginEffectId);
        C20010313Rd c20010313Rd = C20010313Rd.LIZ;
        IFetchEffectListListener iFetchEffectListListener = new IFetchEffectListListener() { // from class: X.10zn
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<Effect> list) {
                Effect effect;
                List<Effect> list2 = list;
                if (list2 != null && (effect = (Effect) C13LP.LJJJLL(list2)) != null) {
                    ProfileNaviEditorViewModel profileNaviEditorViewModel = this.LIZ;
                    boolean z2 = z;
                    C20010313Rd c20010313Rd2 = C20010313Rd.LIZ;
                    final String str = NaviAvatarLokiConfig.LIZ().AssetLokiPanelName;
                    AwS80S0210000_29 awS80S0210000_29 = new AwS80S0210000_29(profileNaviEditorViewModel, effect, z2, 1);
                    c20010313Rd2.getClass();
                    final EffectManager effectManagerLLJILJILJ = ((InterfaceC1635410sex) C20010313Rd.LIZJ.getValue()).LLJILJILJ();
                    if (effectManagerLLJILJILJ != null) {
                        final C19773612Yc c19773612Yc = new C19773612Yc(awS80S0210000_29, 4);
                        effectManagerLLJILJILJ.checkedEffectListUpdate(str, new ICheckChannelListener() { // from class: X.10zq
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                            public final void checkChannelFailed(ExceptionResult exceptionResult) {
                                if (exceptionResult != null) {
                                    exceptionResult.getException();
                                }
                            }

                            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                            public final void checkChannelSuccess(boolean z3) {
                                if (z3) {
                                    effectManagerLLJILJILJ.fetchEffectList(str, false, (IFetchEffectChannelListener) c19773612Yc);
                                } else {
                                    effectManagerLLJILJILJ.fetchEffectListFromCache(str, c19773612Yc);
                                }
                            }
                        });
                    }
                }
            }
        };
        c20010313Rd.getClass();
        ((InterfaceC1635410sex) C20010313Rd.LIZJ.getValue()).LJFF(arrayList, true, null, iFetchEffectListListener);
    }

    public static n mR2(Effect effect, String str) {
        try {
            new p();
            StringBuilder sb = new StringBuilder(effect.getTransResPath());
            String str2 = File.separator;
            sb.append(str2);
            sb.append("custom");
            sb.append(str2);
            sb.append(str);
            String string = sb.toString();
            if (!new C0VSJ(string).exists()) {
                return null;
            }
            return (n) p.LIZJ(C09BH.LJI(new C0VSJ(string), Charsets.UTF_8));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            return null;
        }
    }
}
