package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts;

import X.AnonymousClass0951;
import X.C019F;
import X.C01GW;
import X.C09IC;
import X.C0GS7;
import X.C0H2H;
import X.C0P0T;
import X.C0Q4Y;
import X.C0ZP4;
import X.C13LE;
import X.C13LQ;
import X.C1558520qew;
import X.C1581410rFr;
import X.C1637806bA;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C1BNE;
import X.C20603715jn;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C452501pT;
import X.C459400Hzu;
import X.C724750Sbp;
import X.EnumC1581430rFt;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS106S0100000_6;
import Y.AsS50S0100000_24;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolPostAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.cell.SchoolPostCell;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.cell.SchoolPostLoadingCell;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.list.SchoolPostLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SchoolPostListAssem extends UIListContentAssem<SchoolPostsListViewModel> implements SchoolPostAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C2252321DDq LLJIJIL;
    public C0ZP4 LLJILJIL;
    public InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> LLJILJILJ;
    public AsS50S0100000_24 LLJILLL;
    public C0P0T LLJJ;
    public boolean LLJJI;
    public C0GS7 LLJJIII;
    public final float LLJJIJI;
    public boolean LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SchoolPostListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/school/findschoolfriends/schoolposts/SchoolPostsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SchoolPostListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SchoolPostsListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1590), AFwS264S0000000_24.get$arr$(542), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1589));
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1588));
        this.LLJIJIL = C1BNE.LIZ(C459400Hzu.LIZ);
        this.LLJJIJI = 0.9f;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1047923767) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZLLL = SchoolPostLoadingCell.class;
        c20603715jn.LIZJ = false;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final SchoolPostsListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (SchoolPostsListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolPostAbility
    public final AnonymousClass0951 Yi1() {
        return C09IC.LIZIZ(this.LLJIJIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0ZP4 c0zp4 = this.LLJILJIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLJILJIL = null;
        AsS50S0100000_24 asS50S0100000_24 = this.LLJILLL;
        if (asS50S0100000_24 != null) {
            Go().removeOnScrollListener(asS50S0100000_24);
        }
        this.LLJILLL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolPostAbility
    public final void LLZL(boolean z) {
        RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
        } else {
            if (layoutManager == null) {
                return;
            }
            layoutManager.scrollToPosition(0);
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolPostAbility
    public final void aU(String str) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int iIntValue;
        Jo().LLIZLLLIL = str;
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(541);
        RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
        if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
            int iLJJIII = staggeredGridLayoutManager.LJJIII();
            int[] iArr = new int[iLJJIII];
            int[] iArr2 = new int[iLJJIII];
            staggeredGridLayoutManager.LJIJ(iArr);
            staggeredGridLayoutManager.LJIJJ(iArr2);
            Integer numLJJJJLL = C13LQ.LJJJJLL(iArr);
            int iIntValue2 = -1;
            if (numLJJJJLL != null) {
                iIntValue = numLJJJJLL.intValue();
            } else {
                iIntValue = -1;
            }
            Integer numLJJJJJL = C13LQ.LJJJJJL(iArr2);
            if (numLJJJJJL != null) {
                iIntValue2 = numLJJJJJL.intValue();
            }
            if (iIntValue >= 0 && iIntValue2 >= 0 && iIntValue2 >= iIntValue && iIntValue <= iIntValue2) {
                while (true) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = Go().findViewHolderForLayoutPosition(iIntValue);
                    if ((viewHolderFindViewHolderForLayoutPosition instanceof SchoolPostCell) && viewHolderFindViewHolderForLayoutPosition != null) {
                        aFwS264S0000000_24.invoke(viewHolderFindViewHolderForLayoutPosition);
                    }
                    if (iIntValue == iIntValue2) {
                        break;
                    } else {
                        iIntValue++;
                    }
                }
            }
        }
        Jo().LLIZLLLIL = EnumC1581430rFt.OTHER.getValue();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolPostAbility
    public final void j2(InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LLJILJILJ = interfaceC1631620sYq;
        if (Go().getParent() != null) {
            HandlerHook.viewPost(Go(), new ARunnableS106S0100000_6(this, 129));
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        int i = C1581410rFr.LLILLJJLI;
        viewOnAttachStateChangeListenerC20604515jvGo.setPaddingRelative(i, 0, i, 0);
        int i2 = Go().getResources().getConfiguration().screenWidthDp;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo2 = Go();
        SchoolPostLayoutManager schoolPostLayoutManager = new SchoolPostLayoutManager(C19252910Tv.LIZIZ.LIZLLL().LJIIJJI().LJJLIIIIJ(i2));
        schoolPostLayoutManager.LJJIL(2);
        viewOnAttachStateChangeListenerC20604515jvGo2.setLayoutManager(schoolPostLayoutManager);
        Go().addItemDecoration(new C1581410rFr());
        Go().LJIILJJIL(SchoolPostCell.class);
        Go().getState().LIZLLL = C0Q4Y.BUFFER;
        AsS50S0100000_24 asS50S0100000_24 = new AsS50S0100000_24(this, 5);
        Go().addOnScrollListener(asS50S0100000_24);
        this.LLJILLL = asS50S0100000_24;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0H2H(this, null), 3);
    }

    public final Rect No(View view, ViewGroup viewGroup) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }
}
