package com.ss.android.ugc.aweme.ui.assem.publish;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C20600815jK;
import X.C2162308dZ;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C994030byT;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ui.cell.publish.CollabInviteSelectedCell;
import com.ss.android.ugc.aweme.vm.publish.CollabEditPageContainerViewModel;
import irm.AkS91S0100000_24;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabEditPageSelectedListAssem extends UIContentAssem {
    public final C736950SvV LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
    }

    public CollabEditPageSelectedListAssem() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(379);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(CollabEditPageContainerViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(493), new AwS568S0100000_24((AbstractC738140SxQ) this, 1421), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1419));
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1420));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1418));
    }

    public final void Ho(int i) {
        String strLIZIZ;
        TextView textView = (TextView) this.LLJIJIL.getValue();
        if (i == 0) {
            strLIZIZ = LJJIJL().getContext().getResources().getString(2131849601);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJJIJL().getContext().getResources().getString(2131849601));
            sbLIZ.append(" (");
            sbLIZ.append(i);
            sbLIZ.append(')');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        textView.setText(strLIZIZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(CollabInviteSelectedCell.class);
        ((LinearLayoutManager) viewOnAttachStateChangeListenerC20604515jvGo.getLayoutManager()).setOrientation(0);
        List list = (List) this.LLJ.getValue();
        if (list != null && !list.isEmpty()) {
            List list2 = (List) this.LLJ.getValue();
            if (list2 != null) {
                CollabEditPageContainerViewModel collabEditPageContainerViewModel = (CollabEditPageContainerViewModel) this.LLIZLLLIL.getValue();
                ((ArrayList) collabEditPageContainerViewModel.LLILLJJLI).clear();
                ((ArrayList) collabEditPageContainerViewModel.LLILLJJLI).addAll(list2);
                C20600815jK<InterfaceC1891350zJl> state = Go().getState();
                state.LJFF(null);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    String uid = ((User) obj).getUid();
                    if (uid != null && uid.length() != 0) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C20600815jK.LIZJ(state, new C994030byT((User) it2.next()));
                }
                Ho(list2.size());
            }
            C786410Ut5.LJLLLLLL(0, LJJIJL());
        } else {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0r1f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1572540r1Y) obj2).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 116), 4);
        C786410Ut5.I7(new AkS91S0100000_24(this, 5), (View) this.LLJIJIL.getValue());
        if (C2162308dZ.LIZLLL()) {
            ((ViewGroup.MarginLayoutParams) ((View) this.LLJIJIL.getValue()).getLayoutParams()).bottomMargin += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
    }
}
