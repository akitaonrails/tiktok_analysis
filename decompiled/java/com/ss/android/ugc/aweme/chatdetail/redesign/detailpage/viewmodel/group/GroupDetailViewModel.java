package com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.viewmodel.group;

import X.AbstractC879060Ye8;
import X.C01GW;
import X.C05QR;
import X.C0Y8T;
import X.C0YAE;
import X.C0Z2F;
import X.C0Z2I;
import X.C0Z6F;
import X.C0Z6T;
import X.C0Z6U;
import X.C0Z6Y;
import X.C1434905jX;
import X.C1462005nu;
import X.C14EU;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1727806pg;
import X.C1729206pu;
import X.C2157308cl;
import X.C291001Au;
import X.C452501pT;
import X.C461720I8s;
import X.C877500Ybc;
import X.C893940Z5c;
import X.C893980Z5g;
import X.EnumC877490Ybb;
import X.InterfaceC0148002o;
import X.InterfaceC867020Xzo;
import X.InterfaceC897330ZId;
import Y.AObserverS218S0100000_14;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.viewmodel.group.GroupDetailViewModel;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.EditGroupInfoFragment;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import com.ss.android.ugc.aweme.im.service.service.IBlockUserController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS98S1200000_14;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupDetailViewModel extends AssemViewModel<C1729206pu> {
    public InterfaceC897330ZId LLJILJIL;
    public IBlockUserController LLJILJILJ;
    public boolean LLJJ;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C893980Z5g.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLJJLI = C1509305vX.LIZ(new AwS558S0100000_14(this, 104));
    public final C01GW LLILLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 103));
    public final C01GW LLILZ = C1509305vX.LIZ(new AwS558S0100000_14(this, 106));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(60));
    public final MutableLiveData<Integer> LLILZLL = new MutableLiveData<>();
    public final AObserverS218S0100000_14 LLIZ = new AObserverS218S0100000_14(this, 0);
    public final C01GW LLIZLLLIL = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(61));
    public final C01GW LLJ = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(59));
    public final C01GW LLJI = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(62));
    public final C01GW LLJIJIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 105));
    public boolean LLJILLL = true;
    public final C0Z6F LLJJI = new C05QR() { // from class: X.0Z6F
        @Override // X.C05QR
        public final void WB2(String str) {
        }

        @Override // X.C05QR
        public final void Ys1(C05QT c05qt, String str, List list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.LL.LLJILLL) {
                Iterator it2 = list.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(((BaseContact) it2.next()).getUid(), C461720I8s.LIZIZ())) {
                        if (i != -1) {
                            ListProtector.add(arrayList, 0, ListProtector.remove(arrayList, i));
                        }
                    } else {
                        i++;
                    }
                }
            }
            GroupDetailViewModel groupDetailViewModel = this.LL;
            groupDetailViewModel.setState(new AwS98S1200000_14((List) arrayList, (List<C1462005nu>) groupDetailViewModel, (GroupDetailViewModel) str, (String) 4));
        }
    };

    public final boolean AQ2() {
        return C1727806pg.LIZ.LIZ("group_chat_operation_enable_activity_status", wQ2(), C461720I8s.LIZIZ(), false);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        EnumC877490Ybb enumC877490YbbLIZ = C877500Ybc.LIZ(wQ2());
        C0Y8T c0y8tVQ2 = vQ2();
        boolean z = c0y8tVQ2 != null && c0y8tVQ2.isStickTop();
        String strLJIIIIZZ = yQ2().LJIIIIZZ(vQ2());
        String strLJIILLIIL = yQ2().LJIILLIIL(vQ2());
        Boolean bool = Boolean.FALSE;
        C291001Au c291001Au = new C291001Au(bool);
        C291001Au c291001Au2 = new C291001Au(bool);
        C291001Au c291001Au3 = new C291001Au("");
        C291001Au c291001Au4 = new C291001Au(null);
        C291001Au c291001Au5 = new C291001Au(new ArrayList());
        int iLJFF = ((C0Z2F) this.LLJI.getValue()).LJFF(Long.valueOf(C461720I8s.LIZJ()), wQ2());
        C0Z2I c0z2i = (C0Z2I) this.LLJ.getValue();
        Long l = (Long) this.LLILZ.getValue();
        int iLIZJ = c0z2i.LIZJ(l != null ? l.longValue() : 0L);
        int iLIZLLL = ((C0Z2F) this.LLJI.getValue()).LIZLLL(vQ2());
        String strLJIIJ = yQ2().LJIIJ(vQ2());
        return new C1729206pu(enumC877490YbbLIZ, z, strLJIILLIIL, c291001Au, c291001Au2, c291001Au3, c291001Au4, c291001Au5, iLJFF, iLIZJ, iLIZLLL, strLJIIIIZZ, strLJIIJ != null ? strLJIIJ : "", yQ2().LIZIZ(vQ2()));
    }

    public final String wQ2() {
        return (String) this.LLILLL.getValue();
    }

    public final AbstractC879060Ye8 xQ2() {
        return (AbstractC879060Ye8) this.LLILLJJLI.getValue();
    }

    public final C0Z6T yQ2() {
        return (C0Z6T) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        InterfaceC897330ZId interfaceC897330ZId;
        super.onCleared();
        AbstractC879060Ye8 abstractC879060Ye8XQ2 = xQ2();
        if (abstractC879060Ye8XQ2 != null) {
            abstractC879060Ye8XQ2.LJIILLIIL((C0Z6U) this.LLJIJIL.getValue());
        }
        if (C2157308cl.LIZ() && (interfaceC897330ZId = this.LLJILJIL) != null) {
            interfaceC897330ZId.destroy();
        }
        EventBus.LIZLLL().LJJI(this);
        C0Z2I c0z2i = (C0Z2I) this.LLJ.getValue();
        if (c0z2i != null) {
            C0Y8T c0y8tVQ2 = vQ2();
            c0z2i.LIZIZ(c0y8tVQ2 != null ? c0y8tVQ2.getConversationShortId() : 0L, this.LLILZLL);
        }
        this.LLILZLL.removeObserver(this.LLIZ);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        AbstractC879060Ye8 abstractC879060Ye8XQ2 = xQ2();
        if (abstractC879060Ye8XQ2 != null) {
            abstractC879060Ye8XQ2.LJIIJJI((C0Z6U) this.LLJIJIL.getValue());
        }
        EventBus.LIZLLL().LJIJJ(this);
        C0Z2I c0z2i = (C0Z2I) this.LLJ.getValue();
        if (c0z2i != null) {
            C0Y8T c0y8tVQ2 = vQ2();
            c0z2i.LIZ(c0y8tVQ2 != null ? c0y8tVQ2.getConversationShortId() : 0L, this.LLILZLL);
        }
        this.LLILZLL.observeForever(this.LLIZ);
    }

    public final C0Y8T vQ2() {
        AbstractC879060Ye8 abstractC879060Ye8XQ2 = xQ2();
        if (abstractC879060Ye8XQ2 != null) {
            return abstractC879060Ye8XQ2.LJ();
        }
        return null;
    }

    public final void BQ2(Context context) {
        Object value = this.LLILZIL.getValue();
        String strWQ2 = wQ2();
        value.getClass();
        if (!C1727806pg.LIZ.LIZ("group_chat_edit_group_info", strWQ2, C461720I8s.LIZIZ(), false)) {
            return;
        }
        C0Z6Y c0z6y = EditGroupInfoFragment.LLIZ;
        String strWQ22 = wQ2();
        c0z6y.getClass();
        C0Z6Y.LIZ(context, strWQ22, "group_setting");
    }

    @C14EU(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onContactUserUpdated(C1434905jX c1434905jX) {
        List<C1462005nu> list;
        String uid = c1434905jX.LIZJ.getUid();
        if (uid != null && uid.length() > 0 && (list = getState().LLIZLLLIL.LIZ) != null && !list.isEmpty()) {
            Iterator<C1462005nu> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getUid(), uid)) {
                    setState(new AwS593S0100000_14(c1434905jX.LIZJ, 332));
                    return;
                }
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLocalExitEvent(C893940Z5c c893940Z5c) {
        this.LLJJ = c893940Z5c.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zQ2(IMUser iMUser, Map<String, String> map) {
        AbstractC879060Ye8 abstractC879060Ye8XQ2;
        if (iMUser.getUid() != null && (abstractC879060Ye8XQ2 = xQ2()) != 0) {
            String uid = iMUser.getUid();
            if (uid == null) {
                uid = "";
            }
            abstractC879060Ye8XQ2.LJIIL(Collections.singletonList(uid), map, new InterfaceC867020Xzo<List<? extends C0YAE>>() { // from class: X.0Z6R
                @Override // X.InterfaceC867020Xzo
                public final void LIZ(C868810Y6l<List<? extends C0YAE>> c868810Y6l) {
                    Integer numValueOf;
                    C742250T9r c742250T9r = c868810Y6l.LIZJ;
                    List<? extends C0YAE> list = c868810Y6l.LIZ;
                    C0YMW c0ymw = c868810Y6l.LIZIZ;
                    C0Z6O c0z6o = C0Z6O.LIZIZ;
                    String strWQ2 = this.LIZ.wQ2();
                    if (c0ymw != null) {
                        numValueOf = Integer.valueOf(c0ymw.getCode());
                    } else {
                        numValueOf = null;
                    }
                    c0z6o.LIZ(strWQ2, c742250T9r, numValueOf);
                    this.LIZ.setState(new AwS593S0100000_14(list, (List<C0YAE>) 13));
                }

                @Override // X.InterfaceC867020Xzo
                public final void LIZIZ(C0Y00 c0y00) {
                    C742250T9r c742250T9r = c0y00.LIZIZ;
                    C0YMW c0ymw = c0y00.LIZ;
                    C0Z6O.LIZIZ.LIZ(this.LIZ.wQ2(), c742250T9r, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw)));
                    IIMErrorUtils.LIZ.getClass();
                    IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                    if (iIMErrorUtilsLIZ != null) {
                        C0I0B.LJFF.LIZJ();
                        iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                    }
                }
            });
        }
    }
}
