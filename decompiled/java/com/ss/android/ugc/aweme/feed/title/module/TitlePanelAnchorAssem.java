package com.ss.android.ugc.aweme.feed.title.module;

import X.C01GW;
import X.C1066830drt;
import X.C1066860drw;
import X.C1350320lF8;
import X.C15438062q;
import X.C1A5L;
import X.C20600815jK;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C346270Dhp;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1066840dru;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope;
import com.ss.android.ugc.aweme.feed.title.anchor.TitlePanelAnchorCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes17.dex */
public final class TitlePanelAnchorAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 338));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bax;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TitlePanelRootScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TitlePanelRootScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        Aweme aweme;
        String str;
        C20600815jK<InterfaceC1891350zJl> state;
        super.onViewCreated(view);
        View contentView = getContentView();
        if (contentView instanceof ViewOnAttachStateChangeListenerC20604515jv) {
            viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) contentView;
        } else {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        this.LLJJI = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TitlePanelAnchorCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setOrientation(0);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.addItemDecoration(new C346270Dhp(11));
        }
        C1350320lF8 c1350320lF8 = (C1350320lF8) this.LLJJIII.getValue();
        if (c1350320lF8 != null && (aweme = c1350320lF8.LL) != null) {
            List<InterfaceC1066840dru> list = C1066830drt.LIZ;
            C1350320lF8 c1350320lF82 = (C1350320lF8) this.LLJJIII.getValue();
            if (c1350320lF82 == null || (str = c1350320lF82.LLILLJJLI) == null) {
                str = "";
            }
            List listLIZ = C1066830drt.LIZ(str, aweme, aweme.getAnchors());
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
            Iterator it2 = ((ArrayList) listLIZ).iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1066860drw((InterfaceC1066840dru) it2.next()));
            }
            if (arrayList.isEmpty()) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJI;
                if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                    C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv4);
                }
            } else {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJJI;
                if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                    C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv5);
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LLJJI;
                if (viewOnAttachStateChangeListenerC20604515jv6 != null && (state = viewOnAttachStateChangeListenerC20604515jv6.getState()) != null) {
                    state.LIZLLL(arrayList, null);
                }
            }
        }
        C2271391DvN.LIZ(view, (C1A5L) C2271381DvM.N0.getValue());
    }
}
