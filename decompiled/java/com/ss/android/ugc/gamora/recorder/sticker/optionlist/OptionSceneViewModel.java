package com.ss.android.ugc.gamora.recorder.sticker.optionlist;

import X.C11A0;
import X.C1625440sOs;
import X.C1633850scR;
import X.C1642250spz;
import X.C1697810uHb;
import X.C1698190uID;
import X.C194561119z;
import X.C19EG;
import X.C1DRG;
import X.C560530Lyd;
import X.EnumC1448980noG;
import X.InterfaceC1624530sNP;
import X.InterfaceC1635410sex;
import X.InterfaceC379610EuV;
import android.content.Context;
import com.bytedance.als.LiveEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.UiState;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionSceneViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public final class OptionSceneViewModel extends LifecycleAwareViewModel<OptionPanelState> implements InterfaceC1624530sNP, InterfaceC379610EuV {
    public static final C1642250spz LLJIJIL = new Object() { // from class: X.0spz
    };
    public static final int LLJILJIL = 8;
    public final C1DRG LLILZLL;
    public final q LLIZ = (q) getDiContainer().LJIIL(null, q.class);
    public Effect LLIZLLLIL;
    public final C560530Lyd<Boolean> LLJ;
    public final LiveEvent<Boolean> LLJI;

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public OptionPanelState zQ2() {
        return new OptionPanelState(new C194561119z(), null, false);
    }

    public final void qR2() {
        q qVar;
        Effect effect = this.LLIZLLLIL;
        if (effect == null || (qVar = this.LLIZ) == null) {
            return;
        }
        qVar.w4().LIZJ(new C1625440sOs(effect, -1, EnumC1448980noG.MANUAL_SET, null, null, null, null, Integer.MIN_VALUE, true, null, ""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1624530sNP
    public boolean Z60() {
        return ((OptionPanelState) FQ2()).isBottomSheetVisible();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1624530sNP
    public boolean isShowing() {
        return ((UiState) FQ2()).getUi() instanceof C11A0;
    }

    public final void mR2() {
        InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ((Context) getDiContainer().LJII(C19EG.class, null), null);
        Effect effect = this.LLIZLLLIL;
        if (effect == null) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("OptionSceneViewModel", "effect metadate downloading");
            lR2(interfaceC1635410sexLIZ);
            return;
        }
        EffectManager effectManagerLLJILJILJ = interfaceC1635410sexLIZ.LLJILJILJ();
        if (effectManagerLLJILJILJ == null || effectManagerLLJILJILJ.isEffectDownloaded(effect)) {
            return;
        }
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("OptionSceneViewModel", "effect content downloading");
        kR2(interfaceC1635410sexLIZ);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZLL;
    }

    public final Effect nR2() {
        return this.LLIZLLLIL;
    }

    public final LiveEvent<Boolean> oR2() {
        return this.LLJI;
    }

    public OptionSceneViewModel(C1DRG c1drg) {
        this.LLILZLL = c1drg;
        C560530Lyd<Boolean> c560530Lyd = new C560530Lyd<>();
        this.LLJ = c560530Lyd;
        this.LLJI = c560530Lyd;
        mR2();
    }

    private final void lR2(final InterfaceC1635410sex interfaceC1635410sex) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("panel", "default");
        interfaceC1635410sex.Cg(C1697810uHb.LJIILJJIL("7171145719842083329"), linkedHashMap, new IFetchEffectListByIdsListener() { // from class: X.0spx
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
            public final void onFail(ExceptionResult exceptionResult) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectListResponse effectListResponse) {
                List<Effect> data;
                UrlModel trans_file_url;
                List<String> urlList;
                List<String> url_prefix;
                UrlModel trans_file_url2;
                UrlModel trans_file_url3;
                EffectListResponse effectListResponse2 = effectListResponse;
                if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null) {
                    String uri = null;
                    if (!data.isEmpty()) {
                        OptionSceneViewModel optionSceneViewModel = this.LIZ;
                        InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
                        Effect effect = (Effect) ListProtector.get(data, 0);
                        optionSceneViewModel.LLIZLLLIL = effect;
                        if (effect != null && (trans_file_url = effect.getTrans_file_url()) != null && (urlList = trans_file_url.getUrlList()) != null && urlList.isEmpty() && (url_prefix = effectListResponse2.getUrl_prefix()) != null && !url_prefix.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            Effect effect2 = optionSceneViewModel.LLIZLLLIL;
                            if (effect2 != null && (trans_file_url3 = effect2.getTrans_file_url()) != null) {
                                uri = trans_file_url3.getUri();
                            }
                            List<String> url_prefix2 = effectListResponse2.getUrl_prefix();
                            if (url_prefix2 != null) {
                                for (String str : url_prefix2) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(str);
                                    sbLIZ.append(uri);
                                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                                }
                            }
                            Effect effect3 = optionSceneViewModel.LLIZLLLIL;
                            if (effect3 != null && (trans_file_url2 = effect3.getTrans_file_url()) != null) {
                                trans_file_url2.setUrlList(arrayList);
                            }
                        }
                        optionSceneViewModel.kR2(interfaceC1635410sex2);
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC1624530sNP
    public void EG(boolean z) {
        this.LLJ.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1624530sNP
    public void LJJJJLL(boolean z) {
        setState(new AwS37S0010000_25(z, 22));
    }

    public final void kR2(InterfaceC1635410sex interfaceC1635410sex) {
        EffectManager effectManagerLLJILJILJ;
        Effect effect = this.LLIZLLLIL;
        if (effect != null && (effectManagerLLJILJILJ = interfaceC1635410sex.LLJILJILJ()) != null) {
            effectManagerLLJILJILJ.fetchEffect(effect, new C1698190uID(interfaceC1635410sex, effect, 0));
        }
    }

    public final void pR2(Effect effect) {
        this.LLIZLLLIL = effect;
    }

    public final void rR2(boolean z) {
        setStateImmediate(new AwS37S0010000_25(z, 23));
    }

    @Override // X.InterfaceC1624530sNP
    public void s(Effect effect) {
        setState(new AwS604S0100000_25(effect, 394));
    }
}
