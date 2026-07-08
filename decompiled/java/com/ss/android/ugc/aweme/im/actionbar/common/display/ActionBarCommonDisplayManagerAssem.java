package com.ss.android.ugc.aweme.im.actionbar.common.display;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C0I20;
import X.C0QSJ;
import X.C0ZLG;
import X.C0ZLT;
import X.C0ZLU;
import X.C0ZLZ;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1605206Qg;
import X.C1629106Zl;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C341010DYl;
import X.C456490HvD;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C908520ZkY;
import X.C910130Zn9;
import X.C910160ZnC;
import X.C910170ZnD;
import X.C910180ZnE;
import X.C910190ZnF;
import X.C910200ZnG;
import X.C910210ZnH;
import X.C910230ZnJ;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC456120Huc;
import X.InterfaceC665370Q7z;
import Y.AObjectS67S0000000_14;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel;
import com.ss.android.ugc.aweme.im.actionbar.viewmodel.ActionBarViewModelImpl;
import com.ss.android.ugc.aweme.im.assem.BasePanelAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatNoticeStateVM;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.ChatLongPressVM;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarCommonDisplayManagerAssem extends AbstractC738140SxQ implements InterfaceC1146704e9 {
    public static final C910130Zn9 LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C910200ZnG.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public final AssemVMLazy LLILZIL;
    public volatile C0I20 LLILZLL;
    public C127G LLIZ;
    public InterfaceC665370Q7z LLIZLLLIL;
    public C0QSJ LLJ;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0Zn9] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ActionBarCommonDisplayManagerAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(ActionBarCommonDisplayManagerAssem.class, "replyVM", "getReplyVM()Lcom/ss/android/ugc/aweme/im/replyarea/ability/IReplyStateAbility;", 0), new C2217381BqS(ActionBarCommonDisplayManagerAssem.class, "actionBarVM", "getActionBarVM()Lcom/ss/android/ugc/aweme/im/actionbar/api/viewmodel/ActionBarViewModel;", 0), new C2217381BqS(ActionBarCommonDisplayManagerAssem.class, "longPressVM", "getLongPressVM()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/ChatLongPressVM;", 0), new C2217381BqS(ActionBarCommonDisplayManagerAssem.class, "noticeVM", "getNoticeVM()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatNoticeStateVM;", 0)};
        LLJI = new Object() { // from class: X.0Zn9
        };
    }

    public ActionBarCommonDisplayManagerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PanelStateViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 198), AFwS248S0000000_14.get$arr$(51), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ActionBarViewModel.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 199), AFwS248S0000000_14.get$arr$(52), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ChatLongPressVM.class);
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, 200), AFwS248S0000000_14.get$arr$(53), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(ChatNoticeStateVM.class);
        this.LLILZIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ4, 201), AFwS248S0000000_14.get$arr$(54), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    public final C0I20 bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLIZLLLIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLIZLLLIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLJ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C0I20 c0i20 = (C0I20) c0qsjLIZLLL.getAbility(C0I20.class);
        C687700QyG.LJ(c0i20, C0I20.class);
        return c0i20;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final ActionBarViewModel m223do() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (ActionBarViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLIZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLIZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ActionBarViewModel.class, new AObjectS67S0000000_14(this, 30)}, defaultViewModelProviderFactory);
                    this.LLIZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (((C910200ZnG) this.LL.getValue()).LLILLL) {
            AssemVMLazy assemVMLazy = this.LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            boolean zBooleanValue = ((Boolean) ((ChatNoticeStateVM) assemVMLazy.getValue()).LLILLJJLI.getValue()).booleanValue();
            ((ActionBarViewModelImpl) m223do()).MA1(new C908520ZkY(new C1605206Qg(0), C910230ZnJ.LIZ), !zBooleanValue);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C910160ZnC(this, null), 3);
        }
        if (((C910200ZnG) this.LL.getValue()).LLILLJJLI) {
            AssemVMLazy assemVMLazy2 = this.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJIJIL;
            fo((C0ZLG) ((ChatLongPressVM) assemVMLazy2.getValue()).LLILLJJLI.getValue());
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C910170ZnD(this, null), 3);
        }
        if (((C910200ZnG) this.LL.getValue()).LL) {
            AssemVMLazy assemVMLazy3 = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = LLJIJIL;
            ho((InterfaceC456120Huc) ((PanelStateViewModel) assemVMLazy3.getValue()).LLIZ.getValue());
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C910180ZnE(this, null), 3);
        }
        if (((C910200ZnG) this.LL.getValue()).LLILZ) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C910190ZnF(this, null), 3);
        }
    }

    public final void fo(C0ZLG c0zlg) {
        if (c0zlg instanceof C0ZLU) {
            C0ZLU c0zlu = (C0ZLU) c0zlg;
            if (c0zlu.LIZJ) {
                long j = c0zlu.LIZ;
                float f = c0zlu.LIZIZ;
                ((ActionBarViewModelImpl) m223do()).MA1(new C908520ZkY(new C341010DYl(f, j), new C0ZLZ() { // from class: X.0ZnI
                    @Override // X.C0ZLZ
                    public final String getId() {
                        return "long_press";
                    }
                }), false);
                return;
            }
            return;
        }
        if (!(c0zlg instanceof C0ZLT)) {
            return;
        }
        C0ZLT c0zlt = (C0ZLT) c0zlg;
        if (!c0zlt.LIZJ) {
            return;
        }
        long j2 = c0zlt.LIZ;
        float f2 = c0zlt.LIZIZ;
        ((ActionBarViewModelImpl) m223do()).MA1(new C908520ZkY(new C341010DYl(f2, j2), new C0ZLZ() { // from class: X.0ZnI
            @Override // X.C0ZLZ
            public final String getId() {
                return "long_press";
            }
        }), true);
    }

    public final void ho(InterfaceC456120Huc interfaceC456120Huc) {
        ActionBarViewModel actionBarViewModelM223do = m223do();
        C910210ZnH c910210ZnH = new C0ZLZ() { // from class: X.0ZnH
            @Override // X.C0ZLZ
            public final String getId() {
                return "chat_panel";
            }
        };
        BasePanelAssem.LLJJIII.getClass();
        ((ActionBarViewModelImpl) actionBarViewModelM223do).MA1(new C908520ZkY(new C456490HvD(BasePanelAssem.LLJJIJIIJIL), c910210ZnH), Intrinsics.LJFF(interfaceC456120Huc, C1629106Zl.LL));
    }
}
