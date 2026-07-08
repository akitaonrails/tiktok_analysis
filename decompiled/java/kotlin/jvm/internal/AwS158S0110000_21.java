package kotlin.jvm.internal;

import X.C09AY;
import X.C20600815jK;
import X.C291001Au;
import X.C735200Ssg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListAssem;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListViewModel;
import defpackage.RepostFeedEntranceVM;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public class AwS158S0110000_21 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S0110000_21(UpvotePanelListAssem upvotePanelListAssem, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = upvotePanelListAssem;
        this.z1 = z;
    }

    public static final Object invoke$0(AwS158S0110000_21 awS158S0110000_21, Object obj, Object obj2) {
        C20600815jK<InterfaceC1891350zJl> state;
        Collection collection = (Collection) obj2;
        if (collection != null) {
            UpvotePanelListAssem upvotePanelListAssem = (UpvotePanelListAssem) awS158S0110000_21.l0;
            boolean z = awS158S0110000_21.z1;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = upvotePanelListAssem.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                state.LJIILL(collection, null);
            }
            if (z) {
                AssemVMLazy assemVMLazy = upvotePanelListAssem.LLJILJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = UpvotePanelListAssem.LLJILJILJ;
                ((RepostFeedEntranceVM) assemVMLazy.getValue()).vQ2();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS158S0110000_21 awS158S0110000_21, Object obj, Object obj2) {
        C735200Ssg c735200Ssg;
        String aid;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c735200Ssg = (C735200Ssg) c291001Au.LIZ) != null) {
            UpvotePanelListAssem upvotePanelListAssem = (UpvotePanelListAssem) awS158S0110000_21.l0;
            boolean z = awS158S0110000_21.z1;
            if (c735200Ssg.LIZLLL) {
                int i = c735200Ssg.LIZ;
                String str = c735200Ssg.LIZIZ;
                UpvotePanelListViewModel upvotePanelListViewModel = upvotePanelListAssem.LLIZLLLIL;
                if (upvotePanelListViewModel != null) {
                    Aweme aweme = upvotePanelListViewModel.LLJIJIL;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid, str)) {
                        ((PowerPageSource) upvotePanelListViewModel.LLJJIII.getValue()).getOperator().refresh();
                        if (z && (i == 1 || i == 2 || i == 3 || i == 4)) {
                            AssemVMLazy assemVMLazy = upvotePanelListAssem.LLJILJIL;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = UpvotePanelListAssem.LLJILJILJ;
                            ((RepostFeedEntranceVM) assemVMLazy.getValue()).vQ2();
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
