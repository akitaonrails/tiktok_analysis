package com.ss.android.ugc.aweme.tako.aivideo.detail.cell;

import X.AnonymousClass0999;
import X.C019F;
import X.C0DSB;
import X.C0QSJ;
import X.C127G;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C5182020e;
import X.C687700QyG;
import X.C723830SaL;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS386S0100000_11;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import com.ss.android.ugc.aweme.tako.aivideo.detail.vm.AiVideoViewModel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TakoAIVideoFeedVideoAssem extends FeedVideoAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public C127G LLJLLIL;
    public InterfaceC665370Q7z LLJLLL;
    public C0QSJ LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAIVideoFeedVideoAssem.class, "aiVideoViewModel", "getAiVideoViewModel()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/vm/AiVideoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class, TakoAIVideoDetailScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        arrayList.add(TakoAIVideoDetailScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        TranslationAbility translationAbilityKp = kp();
        if (translationAbilityKp != null) {
            translationAbilityKp.JX0(false);
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{AiVideoViewModel.class, new AObjectS386S0100000_11(this, 0)}, defaultViewModelProviderFactory);
                    this.LLJLLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final TranslationAbility kp() {
        return (TranslationAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TranslationAbility.class, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        TranslationAbility translationAbilityKp = kp();
        if (translationAbilityKp != null) {
            translationAbilityKp.JX0(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        TranslationAbility translationAbilityKp = kp();
        if (translationAbilityKp != null) {
            translationAbilityKp.JX0(false);
        }
        super.LLLI(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem
    /* JADX INFO: renamed from: hp */
    public final void tp(VideoItemParams videoItemParams) {
        super.tp(videoItemParams);
        TranslationAbility translationAbilityKp = kp();
        if (translationAbilityKp != null) {
            translationAbilityKp.JX0(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS377S0200000_11(view, this, 66));
        View viewFindViewById = view.findViewById(R.id.elv);
        if (viewFindViewById != null) {
            C0DSB.LIZIZ(viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        TranslationAbility translationAbilityKp = kp();
        if (translationAbilityKp != null) {
            translationAbilityKp.JX0(false);
        }
        super.J1(i, aweme);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass0999(this, null), 3);
    }

    public TakoAIVideoFeedVideoAssem(BaseFeedPageParams baseFeedPageParams, AObjectS386S0100000_11 aObjectS386S0100000_11, int i, ConcurrentHashSet concurrentHashSet) {
        super(baseFeedPageParams, aObjectS386S0100000_11, i, concurrentHashSet);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AiVideoViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 19), AFwS243S0000000_11.get$arr$(9), null, true);
    }
}
