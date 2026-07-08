package com.bytedance.android.livesdk.moderator;

import X.C01GW;
import X.C092O;
import X.C0IJT;
import X.C0UO0;
import X.C1119170fEJ;
import X.C13LP;
import X.C16F5;
import X.C19322110iZ;
import X.C20736316Cj;
import X.C21411718qp;
import X.C292401Bi;
import X.C418440Gaw;
import X.C443120HZe;
import X.C474500IjA;
import X.C475510Ikn;
import X.C482260Ivg;
import X.C497740JfY;
import X.C500060JjI;
import X.C500260Jjc;
import X.C510160Jza;
import X.C749660Tau;
import X.C750710Tcb;
import X.C750740Tce;
import X.C751090TdD;
import X.C751120TdG;
import X.C751350Tdd;
import X.C752450TfP;
import X.C758170Tod;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC748580TYa;
import Y.ACListenerS147S0100000_12;
import Y.AfS12S0111000_12;
import Y.AfS148S0200000_12;
import Y.AfS181S0100000_12;
import Y.AfS32S0210000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicModeratorPermissionOrderSetting;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.android.livesdk.usermanage.UpdateAdminParams;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class ModeratorPermissionEditFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JSooLD0yPCo+HELIOSZwI8LCA+KDs8OhUpOyI6OzYlJiEWLCw4Dz0yLygpJzsAICApPQ==";
    public C750740Tce LLJLLL;
    public EnumC748580TYa LLJZ;
    public boolean LLLFF;
    public boolean LLLFFI;
    public C16F5 LLLFZ;
    public final long LLJZIJLIL = UserService.getInstance().user().getCurrentUserId();
    public final String LLL = UserService.getInstance().user().getCurrentUser().getSecUid();
    public final C01GW LLLF = C292401Bi.LIZ(new AwS556S0100000_12(this, 331));
    public final C01GW LLLI = C292401Bi.LIZ(new AwS556S0100000_12(this, 332));
    public Map<C21411718qp, Integer> LLLII = new LinkedHashMap();
    public final Map<C21411718qp, Integer> LLLIIII = new HashMap();
    public final Map<C21411718qp, Integer> LLLIIIIL = new HashMap();
    public final C01GW LLLIIIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 330));

    public final C752450TfP BS() {
        return (C752450TfP) this.LLLI.getValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        if (this.LLLFF) {
            return null;
        }
        C500060JjI c500060JjI = new C500060JjI();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131843826), R.style.a7b, new C092O() { // from class: X.0Tcc
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.C092O
            public final void accept(Object obj) {
                ((C510160Jza) obj).LIZJ();
                ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet = this.LIZ;
                Set<Map.Entry> setEntrySet = ((LinkedHashMap) moderatorPermissionEditFragmentSheet.LLLII).entrySet();
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (Map.Entry entry : setEntrySet) {
                    Pair pair = new Pair(Integer.valueOf(((Number) entry.getValue()).intValue()), Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(((CompoundButton) entry.getKey()).isChecked())) ? 1 : 0));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_confirm");
                moderatorPermissionEditFragmentSheet.yS(c474500IjALIZ);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(C751350Tdd.LIZIZ(((Number) entry2.getKey()).intValue()), entry2.getValue());
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap2.size()));
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    linkedHashMap3.put(entry3.getKey(), String.valueOf(((Number) entry3.getValue()).intValue()));
                }
                c474500IjALIZ.LJJIIZI(linkedHashMap3);
                c474500IjALIZ.LIZ();
                AdminApi adminApi = (AdminApi) C482260Ivg.LIZJ(AdminApi.class);
                C750740Tce c750740Tce = moderatorPermissionEditFragmentSheet.LLJLLL;
                if (c750740Tce == null) {
                    c750740Tce = null;
                }
                adminApi.updateAdminWithExtra(new UpdateAdminParams(3, c750740Tce.LIZ, moderatorPermissionEditFragmentSheet.LLJZIJLIL, ((Number) moderatorPermissionEditFragmentSheet.LLLF.getValue()).longValue(), linkedHashMap)).LJIILIIL(C0J1R.LIZIZ(moderatorPermissionEditFragmentSheet)).LJIILIIL(new C0UO0()).LJJLL(new AfS148S0200000_12(moderatorPermissionEditFragmentSheet, linkedHashMap, 71), new AfS181S0100000_12(moderatorPermissionEditFragmentSheet, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
            }
        }));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131843151));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        if (this.LLLFF) {
            C751090TdD c751090TdD = new C751090TdD();
            c751090TdD.LIZIZ = C497740JfY.LJIJI(2131843157);
            c751090TdD.LIZLLL = new ACListenerS147S0100000_12(this, 223);
            c1119170fEJ.LIZLLL = c751090TdD;
        }
        return c1119170fEJ;
    }

    public final void zS() {
        if (this.LLLFFI) {
            this.LLJJIJIL.LJIIJJI();
        } else {
            C19322110iZ.LIZ(this.LLJJIJIL.LJIIIZ);
        }
    }

    public final void FS(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_remove_moderator_popup");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        yS(c474500IjALIZ);
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        sheetOptions.cornerRadius = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C443120HZe c443120HZe;
        super.onCreate(bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (c443120HZe = (C443120HZe) dataChannelLJ.gg0(C749660Tau.class)) != null) {
            this.LLJLLL = (C750740Tce) c443120HZe.getSecond();
            EnumC748580TYa enumC748580TYa = (EnumC748580TYa) c443120HZe.getFirst();
            enumC748580TYa.pre();
            this.LLJZ = enumC748580TYa;
            this.LLLFFI = ((C750710Tcb) c443120HZe.getThird()).LIZ;
            C750740Tce c750740Tce = this.LLJLLL;
            if (c750740Tce == null) {
                c750740Tce = null;
            }
            this.LLLFF = c750740Tce.LJII;
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final boolean wS(Checkable checkable) {
        boolean z;
        Set<C21411718qp> setKeySet = this.LLLII.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = setKeySet.iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((View) next).getVisibility() == 0) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (((Checkable) it3.next()).isChecked()) {
                    break;
                }
            }
            z = true;
        } else {
            z = true;
        }
        return C500260Jjc.LJLLJ(Boolean.valueOf(z), new AwS556S0100000_12(checkable, 329));
    }

    public final void yS(C474500IjA c474500IjA) {
        String str;
        c474500IjA.LJIJJLI(C475510Ikn.LJ(this));
        C750740Tce c750740Tce = this.LLJLLL;
        C750740Tce c750740Tce2 = null;
        if (c750740Tce == null) {
            c750740Tce = null;
        }
        c474500IjA.LJJII(String.valueOf(c750740Tce.LIZ), "to_user_id");
        boolean z = this.LLLFF;
        if (this.LLLFFI) {
            if (z) {
                str = "edit_button";
            } else {
                str = "add_button";
            }
        } else if (z) {
            str = "profile_page_edit";
        } else {
            str = "profile_page_add";
        }
        c474500IjA.LJJII(str, "click_position");
        EnumC748580TYa enumC748580TYa = this.LLJZ;
        if (enumC748580TYa == null) {
            enumC748580TYa = null;
        }
        c474500IjA.LJJII(C751350Tdd.LIZ(enumC748580TYa), "click_page");
        C750740Tce c750740Tce3 = this.LLJLLL;
        if (c750740Tce3 == null) {
            c750740Tce3 = null;
        }
        int i = c750740Tce3.LJI;
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0), "is_in_room");
        C750740Tce c750740Tce4 = this.LLJLLL;
        if (c750740Tce4 != null) {
            c750740Tce2 = c750740Tce4;
        }
        c474500IjA.LJJII(c750740Tce2.LJIIJJI, "relation_tag");
    }

    public final void GS(CompoundButton compoundButton, boolean z) {
        Integer num;
        String str;
        if (!wS(compoundButton) && (num = (Integer) ((LinkedHashMap) this.LLLII).get(compoundButton)) != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 14) {
                DataChannel dataChannelLJ = C475510Ikn.LJ(this);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_filter_manage_access_toggle");
                c474500IjALIZ.LJIJJLI(dataChannelLJ);
                yS(c474500IjALIZ);
                if (z) {
                    str = "select";
                } else {
                    str = "deselect";
                }
                c474500IjALIZ.LJJII(str, "action");
                c474500IjALIZ.LIZ();
            }
            AdminApi adminApi = (AdminApi) C482260Ivg.LIZJ(AdminApi.class);
            boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(z));
            C750740Tce c750740Tce = this.LLJLLL;
            C750740Tce c750740Tce2 = null;
            if (c750740Tce == null) {
                c750740Tce = null;
            }
            long j = c750740Tce.LIZ;
            long j2 = this.LLJZIJLIL;
            long jLongValue = ((Number) this.LLLF.getValue()).longValue();
            String str2 = this.LLL;
            C750740Tce c750740Tce3 = this.LLJLLL;
            if (c750740Tce3 != null) {
                c750740Tce2 = c750740Tce3;
            }
            adminApi.updateAdminPermission(iIntValue, zLJJJI ? 1 : 0, j, j2, jLongValue, str2, c750740Tce2.LIZIZ).LJIILIIL(new C0UO0()).LJJLL(new AfS12S0111000_12(this, iIntValue, z, 1), new AfS32S0210000_12(compoundButton, this, z, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0284  */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Map] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 1863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void uS(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (C13LP.LJJJJ(compoundButton, ((HashMap) this.LLLIIII).keySet())) {
                C500260Jjc.LJJJJJ(getViewLifecycleOwner(), null, new C751120TdG(this, compoundButton, null), 3);
                return;
            }
            return;
        }
        wS(compoundButton);
    }

    public final void ES(int i, String str, boolean z) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_limit_popup");
        c474500IjALIZ.LJIL();
        if (C500260Jjc.LJJIJLIJ()) {
            str2 = "live_take_page";
        } else {
            str2 = "live_take_detail";
        }
        c474500IjALIZ.LJJII(str2, "event_page");
        c474500IjALIZ.LJJII("profile_page_edit", "click_position");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "moderator_number");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_above_limit");
        c474500IjALIZ.LJJII("first_profile_add_moderators", "toast_situation");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (LinkMicModeratorPermissionOrderSetting.INSTANCE.enable()) {
            i = R.layout.g60;
        } else {
            i = R.layout.g5z;
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
