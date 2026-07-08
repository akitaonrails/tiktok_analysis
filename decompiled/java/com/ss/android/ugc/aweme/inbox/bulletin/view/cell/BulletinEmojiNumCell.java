package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C01GW;
import X.C0OPQ;
import X.C0OQ8;
import X.C0OQA;
import X.C0P4N;
import X.C1196320hEk;
import X.C1308910kAL;
import X.C13LP;
import X.C1558520qew;
import X.C19348710mr;
import X.C19374310qz;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C616780OHc;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC19356310o5;
import X.EnumC617010OHz;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ACListenerS144S0100000_9;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinEmojiDetailSheetFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.scope.BulletinEmojiCellScope;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiNumCell extends PowerCell<C0OQ8> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(177));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 685));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 684));
    public TuxTextView LLILZ;
    public LinearLayout LLILZIL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class, BulletinEmojiCellScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a7d;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        arrayList.add(BulletinEmojiCellScope.class);
        return arrayList;
    }

    public final BulletinCommonAbility L5() {
        return (BulletinCommonAbility) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.h02);
        this.LLILZIL = (LinearLayout) this.itemView.findViewById(R.id.gzl);
        View view = this.itemView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJ = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
        view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 2), this.itemView);
        this.itemView.setOnLongClickListener(new C0P4N(this, 2));
    }

    public final void N5(boolean z) {
        boolean z2;
        int status;
        String str;
        BulletinEmojiAbility bulletinEmojiAbility;
        BulletinBaseItem bulletinBaseItemCK;
        View viewMH2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        BulletinInteractionAbility bulletinInteractionAbility;
        int status2;
        String str2;
        BulletinInteractionAbility bulletinInteractionAbility2;
        String str3;
        int status3;
        String str4;
        BulletinCommonAbility bulletinCommonAbilityL5 = L5();
        if (bulletinCommonAbilityL5 != null && bulletinCommonAbilityL5.To()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Long lValueOf = null;
        String str5 = "long_press_n_button";
        int iIE = -1;
        String str6 = "";
        if (z2) {
            P5(getItem());
            C0OPQ c0opq = C0OPQ.LIZ;
            BulletinCommonAbility bulletinCommonAbilityL52 = L5();
            if (bulletinCommonAbilityL52 != null) {
                lValueOf = Long.valueOf(bulletinCommonAbilityL52.Og2());
            }
            String strValueOf = String.valueOf(lValueOf);
            C0OQ8 item = getItem();
            if (item != null && (str4 = item.LLILLL) != null) {
                str6 = str4;
            }
            BulletinCommonAbility bulletinCommonAbilityL53 = L5();
            if (bulletinCommonAbilityL53 != null) {
                iIE = bulletinCommonAbilityL53.IE();
            }
            if (!z) {
                str5 = "click_n_button";
            }
            BulletinCommonAbility bulletinCommonAbilityL54 = L5();
            if (bulletinCommonAbilityL54 != null) {
                status3 = bulletinCommonAbilityL54.qF();
            } else {
                status3 = EnumC617010OHz.INVALID.getStatus();
            }
            c0opq.getClass();
            C0OPQ.LJIJJLI(iIE, status3, strValueOf, str6, str5);
            return;
        }
        BulletinCommonAbility bulletinCommonAbilityL55 = L5();
        if (bulletinCommonAbilityL55 != null && bulletinCommonAbilityL55.Nl()) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZ2 = C1196320hEk.LIZ(this);
            if (interfaceC665370Q7zLIZ2 == null || (bulletinInteractionAbility2 = (BulletinInteractionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ2, BulletinInteractionAbility.class, null)) == null) {
                return;
            }
            C0OQ8 item2 = getItem();
            if (item2 != null && (str3 = item2.LLILLL) != null) {
                str6 = str3;
            }
            bulletinInteractionAbility2.rE1(str6, "click_bulletin_message_emoji", null);
            return;
        }
        if (z) {
            P5(getItem());
            C0OPQ c0opq2 = C0OPQ.LIZ;
            BulletinCommonAbility bulletinCommonAbilityL56 = L5();
            if (bulletinCommonAbilityL56 != null) {
                lValueOf = Long.valueOf(bulletinCommonAbilityL56.Og2());
            }
            String strValueOf2 = String.valueOf(lValueOf);
            C0OQ8 item3 = getItem();
            if (item3 != null && (str2 = item3.LLILLL) != null) {
                str6 = str2;
            }
            BulletinCommonAbility bulletinCommonAbilityL57 = L5();
            if (bulletinCommonAbilityL57 != null) {
                iIE = bulletinCommonAbilityL57.IE();
            }
            BulletinCommonAbility bulletinCommonAbilityL58 = L5();
            if (bulletinCommonAbilityL58 != null) {
                status2 = bulletinCommonAbilityL58.qF();
            } else {
                status2 = EnumC617010OHz.INVALID.getStatus();
            }
            c0opq2.getClass();
            C0OPQ.LJIJJLI(iIE, status2, strValueOf2, str6, "long_press_n_button");
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLIZ3 = C1196320hEk.LIZ(this);
        if (interfaceC665370Q7zLIZ3 != null && (bulletinEmojiAbility = (BulletinEmojiAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ3, BulletinEmojiAbility.class, null)) != null && (bulletinBaseItemCK = bulletinEmojiAbility.cK()) != null && (viewMH2 = bulletinEmojiAbility.MH2()) != null && (interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this)) != null && (bulletinInteractionAbility = (BulletinInteractionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinInteractionAbility.class, null)) != null) {
            bulletinInteractionAbility.Vh1(viewMH2, bulletinBaseItemCK, bulletinEmojiAbility);
        }
        C0OPQ c0opq3 = C0OPQ.LIZ;
        BulletinCommonAbility bulletinCommonAbilityL59 = L5();
        if (bulletinCommonAbilityL59 != null) {
            lValueOf = Long.valueOf(bulletinCommonAbilityL59.Og2());
        }
        String strValueOf3 = String.valueOf(lValueOf);
        C0OQ8 item4 = getItem();
        if (item4 != null && (str = item4.LLILLL) != null) {
            str6 = str;
        }
        BulletinCommonAbility bulletinCommonAbilityL510 = L5();
        if (bulletinCommonAbilityL510 != null) {
            iIE = bulletinCommonAbilityL510.IE();
        }
        BulletinCommonAbility bulletinCommonAbilityL511 = L5();
        if (bulletinCommonAbilityL511 != null) {
            status = bulletinCommonAbilityL511.qF();
        } else {
            status = EnumC617010OHz.INVALID.getStatus();
        }
        c0opq3.getClass();
        C0OPQ.LJIJJLI(iIE, status, strValueOf3, str6, "click_n_button");
    }

    public final void P5(C0OQ8 c0oq8) {
        String str;
        Long lLJIILIIL;
        boolean zIsHalfScreen;
        BulletinCommonAbility bulletinCommonAbilityL5 = L5();
        if (bulletinCommonAbilityL5 != null) {
            long jOg2 = bulletinCommonAbilityL5.Og2();
            if (c0oq8 != null && (str = c0oq8.LLILLL) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                long jLongValue = lLJIILIIL.longValue();
                String str2 = BulletinEmojiDetailSheetFragment._pnsPageId;
                Context context = this.itemView.getContext();
                FragmentManager parentFragmentManager = FragmentManager.LJJJJLL(this.itemView).getParentFragmentManager();
                Bundle bundle = new Bundle();
                bundle.putLong("bulletin_board_id", jOg2);
                bundle.putLong("bbItemId", jLongValue);
                InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
                BulletinEmojiAbility bulletinEmojiAbility = null;
                if (interfaceC665370Q7zLIZ != null) {
                    bulletinEmojiAbility = (BulletinEmojiAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinEmojiAbility.class, null);
                }
                BulletinCommonAbility bulletinCommonAbilityL52 = L5();
                if (bulletinCommonAbilityL52 != null) {
                    zIsHalfScreen = bulletinCommonAbilityL52.isHalfScreen();
                } else {
                    zIsHalfScreen = false;
                }
                C616780OHc.LIZ(context, parentFragmentManager, bundle, bulletinEmojiAbility, zIsHalfScreen);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0OQ8 c0oq8 = (C0OQ8) interfaceC1891350zJl;
        super.onBindItemView(c0oq8);
        I5(c0oq8.LL, c0oq8.LLILLJJLI);
        if (c0oq8.LLILZ) {
            HandlerHook.viewPost(this.itemView, new ARunnableS109S0100000_9(this, 1));
        }
    }

    public final void I5(int i, int i2) {
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('+');
            sbLIZ.append((Object) C19374310qz.LIZ(Integer.valueOf(i - i2), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28));
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C0OQ8 c0oq8 = (C0OQ8) interfaceC1891350zJl;
        super.onBindItemView(c0oq8, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ != null && (objLJJJLZIJ instanceof C0OQA)) {
            C0OQA c0oqa = (C0OQA) objLJJJLZIJ;
            if (c0oqa.LIZ) {
                I5(c0oq8.LL, c0oq8.LLILLJJLI);
            }
            if (c0oqa.LIZIZ) {
                HandlerHook.viewPost(this.itemView, new ARunnableS109S0100000_9(this, 1));
            }
        }
    }
}
