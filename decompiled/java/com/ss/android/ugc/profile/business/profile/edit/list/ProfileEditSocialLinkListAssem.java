package com.ss.android.ugc.profile.business.profile.edit.list;

import X.AbstractC21688119uJ;
import X.AbstractC738140SxQ;
import X.AnonymousClass0208;
import X.C01GW;
import X.C11NJ;
import X.C1214430hhx;
import X.C13LE;
import X.C15438062q;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20600815jK;
import X.C21688219uK;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1214450hhz;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AfS188S0100000_19;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.edit.IProfileEditLinkAbility;
import com.ss.android.ugc.profile.business.profile.edit.list.ProfileLinksOrderViewModel;
import com.ss.android.ugc.profile.business.profile.edit.list.cell.ProfileEditSocialLinkCell;
import com.ss.android.ugc.profile.business.profile.edit.list.vm.ProfileLinksOrderUpdateAPI;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileEditSocialLinkListAssem extends UIContentAssem implements InterfaceC1214450hhz {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public C1749280vcc LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2091));
    public C21688219uK LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileEditSocialLinkListAssem.class, "profileLinksOrderVM", "getProfileLinksOrderVM()Lcom/ss/android/ugc/profile/business/profile/edit/list/ProfileLinksOrderViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final IProfileEditLinkAbility Go() {
        return (IProfileEditLinkAbility) this.LLJI.getValue();
    }

    public final ProfileLinksOrderViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (ProfileLinksOrderViewModel) assemVMLazy.getValue();
    }

    public ProfileEditSocialLinkListAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileLinksOrderViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2093);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(350);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((AbstractC738140SxQ) this, 2094), aFwS257S0000000_19, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJILJIL = assemVMLazy;
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(358));
        this.LLJILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(357));
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2092));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Ho().xQ2("biolink_setting_result");
    }

    @Override // X.InterfaceC1214450hhz
    public final void Bd1(ProfileEditSocialLinkCell profileEditSocialLinkCell) {
        C21688219uK c21688219uK = this.LLJIJIL;
        if (c21688219uK != null) {
            c21688219uK.LJIILLIIL(profileEditSocialLinkCell);
        }
    }

    public final String Jo(int i) {
        String string;
        Context context = getContext();
        if (context == null || (string = context.getString(i)) == null) {
            return "";
        }
        return string;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        List<Integer> listGv1;
        C20600815jK<InterfaceC1891350zJl> state;
        Map<Integer, String> mapGC;
        String str;
        super.onViewCreated(view);
        Ho().LLILLL = new C11NJ();
        Ho().LLILZ = Go();
        this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.gqc);
        this.LLJ = (C1749280vcc) view.findViewById(R.id.mrq);
        Ho().xQ2("biolink_setting_show");
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(ProfileEditSocialLinkCell.class);
        }
        IProfileEditLinkAbility iProfileEditLinkAbilityGo = Go();
        if (iProfileEditLinkAbilityGo != null && (listGv1 = iProfileEditLinkAbilityGo.Gv1()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listGv1, 10));
            Iterator<Integer> it2 = listGv1.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                String str2 = (String) ((Map) this.LLJJ.getValue()).get(Integer.valueOf(iIntValue));
                if (str2 == null) {
                    str2 = "";
                }
                IProfileEditLinkAbility iProfileEditLinkAbilityGo2 = Go();
                if (iProfileEditLinkAbilityGo2 != null) {
                    mapGC = iProfileEditLinkAbilityGo2.GC();
                } else {
                    mapGC = null;
                }
                if (mapGC != null) {
                    str = mapGC.get(Integer.valueOf(iIntValue));
                } else {
                    str = null;
                }
                arrayList.add(new C1214430hhx(iIntValue, str2, str, Go()));
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                state.LJIILL(arrayList, null);
            }
        }
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            Ho();
            ((PowerAdapter) viewOnAttachStateChangeListenerC20604515jv3.getAdapter()).LLLLII(this, InterfaceC1214450hhz.class);
            final ProfileLinksOrderViewModel profileLinksOrderViewModelHo = Ho();
            C21688219uK c21688219uK = new C21688219uK(new AbstractC21688119uJ(viewOnAttachStateChangeListenerC20604515jv3, profileLinksOrderViewModelHo) { // from class: X.0hhr
                public final ViewOnAttachStateChangeListenerC20604515jv LIZJ;
                public final ProfileLinksOrderViewModel LIZLLL;

                @Override // X.AbstractC21688119uJ
                public final boolean LJII() {
                    return false;
                }

                @Override // X.AbstractC21688119uJ
                public final void LJIILL() {
                }

                {
                    this.LIZJ = viewOnAttachStateChangeListenerC20604515jv3;
                    this.LIZLLL = profileLinksOrderViewModelHo;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC21688119uJ
                public final void LIZJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    User userIx;
                    super.LIZJ(recyclerView, viewHolder);
                    if (viewHolder instanceof InterfaceC1214300hhk) {
                        ((InterfaceC1214300hhk) viewHolder).LJIIJ();
                        ProfileLinksOrderViewModel profileLinksOrderViewModel = this.LIZLLL;
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LIZJ;
                        ((ArrayList) profileLinksOrderViewModel.LLILLJJLI).clear();
                        List<Integer> list = profileLinksOrderViewModel.LLILLJJLI;
                        List<InterfaceC1891350zJl> listLJII = viewOnAttachStateChangeListenerC20604515jv4.getState().LJII();
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
                        Iterator it3 = ((ArrayList) listLJII).iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(Integer.valueOf(((C1214430hhx) ((InterfaceC1891350zJl) it3.next())).LL));
                        }
                        ((ArrayList) list).addAll(new ArrayList(arrayList2));
                        ProfileLinksOrderViewModel profileLinksOrderViewModel2 = this.LIZLLL;
                        if (!Intrinsics.LJFF(profileLinksOrderViewModel2.LL, profileLinksOrderViewModel2.LLILLJJLI)) {
                            String strLJJLIIIJ = C13LP.LJJLIIIJ(profileLinksOrderViewModel2.LLILLJJLI, ",", e3.e, e3.f, 0, null, null, 56);
                            C11NJ c11nj = profileLinksOrderViewModel2.LLILLL;
                            if (c11nj != null) {
                                c11nj.LJ();
                            }
                            C11NJ c11nj2 = profileLinksOrderViewModel2.LLILLL;
                            if (c11nj2 != null) {
                                ((C1214390hht) profileLinksOrderViewModel2.LLILZLL.getValue()).LIZ.getClass();
                                ProfileLinksOrderUpdateAPI.LIZ.getClass();
                                c11nj2.LIZ(C1214380hhs.LIZIZ.getValue().updateProfileLinksOrder(strLJJLIIIJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS188S0100000_19(profileLinksOrderViewModel2, 70), new AfS188S0100000_19(profileLinksOrderViewModel2, 71)));
                            }
                            profileLinksOrderViewModel2.setState(AFwS257S0000000_19.get$arr$(697));
                            IProfileEditLinkAbility iProfileEditLinkAbility = profileLinksOrderViewModel2.LLILZ;
                            if (iProfileEditLinkAbility != null && (userIx = iProfileEditLinkAbility.Ix()) != null) {
                                userIx.setProfileLinkOrderList(profileLinksOrderViewModel2.LLILLJJLI);
                            }
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC21688119uJ
                public final int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    if (!(viewHolder instanceof InterfaceC1214300hhk) || !((InterfaceC1214300hhk) viewHolder).n2()) {
                        return 0;
                    }
                    return AbstractC21688119uJ.LJIIIZ(3, 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC21688119uJ
                public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
                    if (i != 0 && (viewHolder instanceof InterfaceC1214300hhk)) {
                        InterfaceC1214300hhk interfaceC1214300hhk = (InterfaceC1214300hhk) viewHolder;
                        if (interfaceC1214300hhk.n2()) {
                            interfaceC1214300hhk.LJIIZILJ();
                            this.LIZLLL.yQ2(this.LIZJ);
                        }
                    }
                }

                @Override // X.AbstractC21688119uJ
                public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    C1214430hhx c1214430hhx;
                    int adapterPosition = viewHolder.getAdapterPosition();
                    int adapterPosition2 = viewHolder2.getAdapterPosition();
                    if (adapterPosition2 >= 0 && adapterPosition >= 0) {
                        if (recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) {
                            ProfileLinksOrderViewModel profileLinksOrderViewModel = this.LIZLLL;
                            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LIZJ;
                            profileLinksOrderViewModel.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) viewOnAttachStateChangeListenerC20604515jv4.getState().LJII()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(e3.e);
                                Integer numValueOf = null;
                                if ((interfaceC1891350zJl instanceof C1214430hhx) && (c1214430hhx = (C1214430hhx) interfaceC1891350zJl) != null) {
                                    numValueOf = Integer.valueOf(c1214430hhx.LL);
                                }
                                sbLIZ.append(numValueOf);
                                sbLIZ.append(", ");
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(e3.e);
                            sbLIZ2.append(" ]");
                            C2188811AlT.LIZIZ(sbLIZ2);
                            arrayList2.addAll(viewOnAttachStateChangeListenerC20604515jv4.getState().LJII());
                            Collections.swap(arrayList2, adapterPosition, adapterPosition2);
                            C20600815jK.LJIIJ(viewOnAttachStateChangeListenerC20604515jv4.getState(), arrayList2);
                            AbstractC21673619ry adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                adapter.notifyItemMoved(adapterPosition, adapterPosition2);
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
            });
            c21688219uK.LJ(this.LLIZLLLIL);
            this.LLJIJIL = c21688219uK;
        }
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gM6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158850gGJ) obj).LLILZ;
            }
        }, null, AnonymousClass0208.get$arr$(42), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gM7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158850gGJ) obj).LLILLL;
            }
        }, null, new AwS633S0100000_19(this, 261), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gPF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158850gGJ) obj).LLILLJJLI;
            }
        }, null, new AwS616S0100000_2(this, 114), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gLi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1158850gGJ) obj).LL);
            }
        }, null, new AwS633S0100000_19(this, 262), 6);
    }
}
