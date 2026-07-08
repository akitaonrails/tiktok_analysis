package com.ss.android.ugc.aweme.tako.aivideo.detail.cell;

import X.AnonymousClass0956;
import X.C019F;
import X.C09R3;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1627506Yv;
import X.C1637806bA;
import X.C1687380u0m;
import X.C19719212De;
import X.C19719912Dl;
import X.C20088213iq;
import X.C2217381BqS;
import X.C23250099c;
import X.C687700QyG;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1682240tsU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnLayoutChangeListenerC1698100uI4;
import Y.AObjectS399S0100000_25;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import com.ss.android.ugc.aweme.tako.aivideo.detail.vm.AiVideoViewModel;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class TakoAIVideoFeedInfoAreaAssem extends FeedBaseContentAssem<TakoAIVideoFeedInfoAreaAssem> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public Animator LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public AnonymousClass0956 LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public ViewOnLayoutChangeListenerC1698100uI4 LLJLIL;
    public final String LLJLILLLLZIIL;
    public volatile InterfaceC1682240tsU LLJLL;
    public C127G LLJLLIL;
    public InterfaceC665370Q7z LLJLLL;
    public C0QSJ LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAIVideoFeedInfoAreaAssem.class, "hostAbility", "getHostAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/ability/TakoAIVideoHostAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoAIVideoFeedInfoAreaAssem.class, "aiVideoViewModel", "getAiVideoViewModel()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/vm/AiVideoViewModel;", 0);
        c09r3.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TakoAIVideoFeedInfoAreaAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AiVideoViewModel.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1214), AFwS266S0000000_25.get$arr$(254), null, true);
        this.LLJLILLLLZIIL = "tako_ai_video_show_pill";
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoAIVideoDetailScope.class, VideoCellScope.class});
    }

    public final InterfaceC1682240tsU dp() {
        InterfaceC1682240tsU interfaceC1682240tsU = this.LLJLL;
        if (interfaceC1682240tsU == null) {
            synchronized (this) {
                interfaceC1682240tsU = this.LLJLL;
                if (interfaceC1682240tsU == null) {
                    InterfaceC1682240tsU interfaceC1682240tsUCp = cp();
                    this.LLJLL = interfaceC1682240tsUCp;
                    return interfaceC1682240tsUCp;
                }
            }
        }
        return interfaceC1682240tsU;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoAIVideoDetailScope.class);
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        View view;
        ViewOnLayoutChangeListenerC1698100uI4 viewOnLayoutChangeListenerC1698100uI4 = this.LLJLIL;
        if (viewOnLayoutChangeListenerC1698100uI4 != null && (view = this.LLJJLIIIJLLLLLLLZ) != null) {
            view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1698100uI4);
        }
        this.LLJLIL = null;
        Animator animator = this.LLJJJJ;
        if (animator != null) {
            animator.cancel();
        }
        this.LLJJJJ = null;
        AnonymousClass0956 anonymousClass0956 = this.LLJJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    public final InterfaceC1682240tsU cp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJZ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLLL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJLLL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{TakoAIVideoDetailScope.class});
            this.LLJZ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1682240tsU interfaceC1682240tsU = (InterfaceC1682240tsU) c0qsjLIZLLL.getAbility(InterfaceC1682240tsU.class);
        C687700QyG.LJ(interfaceC1682240tsU, InterfaceC1682240tsU.class);
        return interfaceC1682240tsU;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{AiVideoViewModel.class, new AObjectS399S0100000_25(this, 3)}, defaultViewModelProviderFactory);
                    this.LLJLLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View view2;
        ViewOnLayoutChangeListenerC1698100uI4 viewOnLayoutChangeListenerC1698100uI4 = this.LLJLIL;
        if (viewOnLayoutChangeListenerC1698100uI4 != null && (view2 = this.LLJJLIIIJLLLLLLLZ) != null) {
            view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1698100uI4);
        }
        this.LLJJLIIIJLLLLLLLZ = view;
        ViewOnLayoutChangeListenerC1698100uI4 viewOnLayoutChangeListenerC1698100uI42 = new ViewOnLayoutChangeListenerC1698100uI4(this, 0);
        this.LLJLIL = viewOnLayoutChangeListenerC1698100uI42;
        view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1698100uI42);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bm5);
        if (viewGroup != null && viewGroup.findViewWithTag(this.LLJLILLLLZIIL) == null) {
            ComposeView composeView = new ComposeView(view.getContext(), null, 6);
            composeView.setTag(this.LLJLILLLLZIIL);
            composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
            composeView.setContent(new C19719212De(-469961699, new AwS639S0100000_25(this, 59), true));
            viewGroup.addView(composeView, 0, new LinearLayout.LayoutParams(-2, -2));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1627506Yv(this, view, null), 3);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        AnonymousClass0956 anonymousClass0956 = this.LLJJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1687380u0m(this, videoItemParams2, null), 3);
    }

    public final void ep(int i, View view) {
        if (view == null) {
            return;
        }
        this.LLJL = true;
        C786410Ut5.LJLLLLLL(i, view);
        this.LLJL = false;
    }
}
