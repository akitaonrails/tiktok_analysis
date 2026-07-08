package com.ss.android.ugc.profile.business.profile.menu.business.content.minis;

import X.C01GW;
import X.C11G4;
import X.C1248270iaX;
import X.C1248950ibd;
import X.C127K;
import X.C127M;
import X.C19ME;
import X.C2097608Jq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC215200sI;
import X.EnumC995430c0j;
import X.InterfaceC215300sJ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.profile.business.cd.IMenuAbility;
import com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.CellBizBaseData;
import com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellBizBaseData;
import com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellMinisRichCardParams;
import com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent;
import com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellRichCardData;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentCellRichCardUIComponent extends ContentCellNewBaseUIComponent<CellBizBaseData> {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLLFF;
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2112));
    public final ACListenerS154S0100000_19 LLLFZ = new ACListenerS154S0100000_19(this, 150);

    @Override // com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent
    public final boolean Ep() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jp() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.menu.business.content.minis.ContentCellRichCardUIComponent.Jp():void");
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent
    public final void Gp() {
        String next;
        View childAt;
        ViewGroup viewGroup;
        List<String> listSd0;
        ContentCellBizBaseData contentCellBizBaseData;
        Context context = getContext();
        if (context == null) {
            return;
        }
        BizBaseData bizBaseData = this.LLJJIJIIJIL;
        ContentCellRichCardData richCard = (!(bizBaseData instanceof ContentCellBizBaseData) || (contentCellBizBaseData = (ContentCellBizBaseData) bizBaseData) == null) ? null : contentCellBizBaseData.getRichCard();
        IMenuAbility iMenuAbilityAp = Ap();
        if (iMenuAbilityAp != null && (listSd0 = iMenuAbilityAp.Sd0()) != null) {
            Iterator<String> it2 = listSd0.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (Intrinsics.LJFF(next, this.assemTagInternal)) {
                        break;
                    }
                }
            }
        } else {
            next = null;
        }
        if (richCard == null || richCard.style != EnumC995430c0j.CONTAINER_LOCATION_BOTTOM.ordinal()) {
            childAt = (View) this.LLJLLL.getValue();
        } else {
            View view = this.LLJJ;
            if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null || (childAt = viewGroup.getChildAt(0)) == null) {
                childAt = this.LLJJ;
            }
        }
        if (!Intrinsics.LJFF(next, this.assemTagInternal)) {
            if (childAt != null) {
                childAt.setBackground(null);
                return;
            }
            return;
        }
        if (childAt != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0c);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            childAt.setBackground(c384050F3z.LIZ(context));
        }
        ContentCellProtocol contentCellProtocolUp = up();
        if (contentCellProtocolUp != null) {
            contentCellProtocolUp.LLJLLL = true;
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent, X.AbstractC738140SxQ
    public final void onResume() throws JSONException {
        super.onResume();
        Jp();
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        ContentCellBizBaseData contentCellBizBaseData;
        ContentCellRichCardData richCard;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        String str;
        Describe describe;
        ProfileComponents profileComponents;
        String str2;
        Describe describe2;
        ProfileComponents profileComponents2;
        ContentCellProtocol contentCellProtocolUp = up();
        String text = null;
        Boolean boolValueOf = contentCellProtocolUp != null ? Boolean.valueOf(contentCellProtocolUp.LJJLIIIJILLIZJL()) : null;
        BizBaseData bizBaseData = this.LLJJIJIIJIL;
        if (!(bizBaseData instanceof ContentCellBizBaseData) || (contentCellBizBaseData = (ContentCellBizBaseData) bizBaseData) == null || (richCard = contentCellBizBaseData.getRichCard()) == null || Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return;
        }
        View view = this.LLJJ;
        int i = richCard.style;
        if (i == EnumC995430c0j.CONTAINER_LOCATION_ACCESSORY.ordinal()) {
            if (view instanceof C127K) {
                C127K c127k = (C127K) view;
                C1248950ibd c1248950ibd = this.LLJJI;
                if (c1248950ibd == null || (profileComponents2 = c1248950ibd.LLILLJJLI) == null || (str2 = profileComponents2.componentId) == null) {
                    str2 = this.LLJILJIL;
                }
                BizBaseData bizBaseData2 = this.LLJJIJIIJIL;
                if (bizBaseData2 != null && (describe2 = bizBaseData2.getDescribe()) != null) {
                    text = describe2.getText();
                }
                c127k.setTitle(text);
                TuxTextView tuxTextView = (TuxTextView) c127k.findViewById(R.id.y3j);
                if (tuxTextView != null) {
                    C1248270iaX.LIZJ(tuxTextView, this.LLJJIJIIJIL, str2, null, null, false, 28);
                }
                TuxIconView tuxIconView = (TuxIconView) c127k.findViewById(R.id.k1_);
                if (tuxIconView != null) {
                    C1248270iaX.LIZ(tuxIconView, this.LLJJIJIIJIL, str2, null, null, null);
                    return;
                }
                return;
            }
            return;
        }
        if (i != EnumC995430c0j.CONTAINER_LOCATION_BOTTOM.ordinal()) {
            super.tp();
            return;
        }
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        View childAt = viewGroup.getChildAt(0);
        if (!(childAt instanceof ViewGroup) || (viewGroup2 = (ViewGroup) childAt) == null) {
            return;
        }
        View childAt2 = viewGroup2.getChildAt(0);
        if (childAt2 instanceof C127K) {
            C127K c127k2 = (C127K) childAt2;
            C1248950ibd c1248950ibd2 = this.LLJJI;
            if (c1248950ibd2 == null || (profileComponents = c1248950ibd2.LLILLJJLI) == null || (str = profileComponents.componentId) == null) {
                str = this.LLJILJIL;
            }
            BizBaseData bizBaseData3 = this.LLJJIJIIJIL;
            if (bizBaseData3 != null && (describe = bizBaseData3.getDescribe()) != null) {
                text = describe.getText();
            }
            c127k2.setTitle(text);
            TuxTextView tuxTextView2 = (TuxTextView) c127k2.findViewById(R.id.y3j);
            if (tuxTextView2 != null) {
                C1248270iaX.LIZJ(tuxTextView2, this.LLJJIJIIJIL, str, null, null, false, 28);
            }
            TuxIconView tuxIconView2 = (TuxIconView) c127k2.findViewById(R.id.k1_);
            if (tuxIconView2 != null) {
                C1248270iaX.LIZ(tuxIconView2, this.LLJJIJIIJIL, str, null, null, null);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent
    public final View.OnClickListener zp() {
        return this.LLLFZ;
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent
    public final void Fp(boolean z) throws JSONException {
        ContentCellRichCardData richCard;
        String string;
        Map<String, Object> mapBy0;
        ContentCellMinisRichCardParams contentCellMinisRichCardParams;
        List<String> list;
        String string2;
        ContentCellMinisRichCardParams contentCellMinisRichCardParams2;
        List<String> list2;
        ContentCellBizBaseData contentCellBizBaseData;
        BizBaseData bizBaseData = this.LLJJIJIIJIL;
        Object obj = null;
        if ((bizBaseData instanceof ContentCellBizBaseData) && (contentCellBizBaseData = (ContentCellBizBaseData) bizBaseData) != null) {
            richCard = contentCellBizBaseData.getRichCard();
        } else {
            richCard = null;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("if_rich_card", "1");
        String str = "";
        if (richCard == null || (contentCellMinisRichCardParams2 = richCard.minisInfo) == null || (list2 = contentCellMinisRichCardParams2.minisClientKeyList) == null || (string = list2.toString()) == null) {
            string = "";
        }
        pairArr[1] = new Pair("minis_lst", string);
        if (richCard != null && (contentCellMinisRichCardParams = richCard.minisInfo) != null && (list = contentCellMinisRichCardParams.minisTypeList) != null && (string2 = list.toString()) != null) {
            str = string2;
        }
        pairArr[2] = new Pair("minis_type_lst", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        IMenuAbility iMenuAbilityAp = Ap();
        if (iMenuAbilityAp != null && (mapBy0 = iMenuAbilityAp.by0()) != null) {
            obj = mapBy0.get("minis_auto_open_profile_more_from");
        }
        if ((obj instanceof String) && obj != null) {
            mapLJIIJ.put("enter_from", obj);
        }
        ContentCellProtocol contentCellProtocolUp = up();
        if (contentCellProtocolUp != null) {
            contentCellProtocolUp.LJLJJLL(mapLJIIJ, z);
        }
        Jp();
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        ContentCellBizBaseData contentCellBizBaseData;
        ContentCellRichCardData richCard;
        ContentCellMinisRichCardParams contentCellMinisRichCardParams;
        List<Map<String, Object>> list;
        IMinisApiService iMinisApiService;
        InterfaceC215300sJ interfaceC215300sJLJIIJJI;
        super.Hj(profileComponents);
        BizBaseData bizBaseData = this.LLJJIJIIJIL;
        if ((bizBaseData instanceof ContentCellBizBaseData) && (contentCellBizBaseData = (ContentCellBizBaseData) bizBaseData) != null && (richCard = contentCellBizBaseData.getRichCard()) != null && (contentCellMinisRichCardParams = richCard.minisInfo) != null && (list = contentCellMinisRichCardParams.minisList) != null && (iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null)) != null && (interfaceC215300sJLJIIJJI = iMinisApiService.LJIIJJI()) != null) {
            interfaceC215300sJLJIIJJI.LIZ(EnumC215200sI.PROFILE_SIDEBAR, list);
        }
    }

    public final C127K Ip(Context context) {
        String text;
        int iIntValue;
        View viewLJFF;
        C19ME c19me;
        C19ME c19me2;
        Icon icon;
        Integer iconInt$default;
        Describe describe;
        C127K c127k = new C127K(context, null, 6);
        BizBaseData bizBaseData = this.LLJJIJIIJIL;
        if (bizBaseData != null && (describe = bizBaseData.getDescribe()) != null) {
            text = describe.getText();
        } else {
            text = null;
        }
        c127k.setTitle(text);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = yp().LIZIZ;
        c419910GdJ.LIZJ = yp().LIZJ;
        BizBaseData bizBaseData2 = this.LLJJIJIIJIL;
        if (bizBaseData2 != null && (icon = bizBaseData2.getIcon()) != null && (iconInt$default = Icon.getIconInt$default(icon, null, null, 3, null)) != null) {
            iIntValue = iconInt$default.intValue();
        } else {
            iIntValue = 0;
        }
        c419910GdJ.LIZ = iIntValue;
        c419910GdJ.LJ = Integer.valueOf(yp().LIZLLL);
        c127k.setIcon(c419910GdJ);
        C11G4 c11g4 = new C11G4(context, null);
        c11g4.LJIILL(this.LLLFZ);
        c127k.setAccessory(c11g4);
        TuxIconView tuxIconView = (TuxIconView) c127k.findViewById(R.id.k1_);
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me2 = (C19ME) layoutParams) != null) {
                c19me2.startToStart = 0;
                c19me2.topToTop = 0;
                c19me2.bottomToBottom = 0;
                ((ViewGroup.MarginLayoutParams) c19me2).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = 0;
                c19me2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                c19me2.setMarginEnd(0);
                C786410Ut5.M6(tuxIconView, c19me2);
            }
        }
        TextView textView = (TextView) c127k.findViewById(R.id.y3j);
        if (textView != null) {
            C426750GoL.LJIIIZ(textView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, false, 16);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        C127M accessory = c127k.getAccessory();
        if (accessory != null && (viewLJFF = accessory.LJFF()) != null) {
            ViewGroup.LayoutParams layoutParams2 = viewLJFF.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                c19me.topToTop = 0;
                c19me.bottomToBottom = 0;
                ((ViewGroup.MarginLayoutParams) c19me).height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = 0;
                c19me.setMarginStart(0);
                c19me.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                C786410Ut5.W5(viewLJFF, c19me);
            }
            c127k.setGravity(8388629);
        }
        ViewGroup viewGroup = (ViewGroup) c127k.findViewById(R.id.dlh);
        if (viewGroup != null) {
            C426750GoL.LJIIL(viewGroup, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 16);
            C427690Gpr.LJ(viewGroup, C418440Gaw.LIZIZ(8));
            viewGroup.setClipToPadding(false);
        }
        return c127k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0ic4] */
    @Override // com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig r12) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.menu.business.content.minis.ContentCellRichCardUIComponent.So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig):android.view.View");
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        ContentCellBizBaseData contentCellBizBaseData;
        ContentCellRichCardData richCard;
        ContentCellMinisRichCardParams contentCellMinisRichCardParams;
        List<Map<String, Object>> list;
        IMinisApiService iMinisApiService;
        InterfaceC215300sJ interfaceC215300sJLJIIJJI;
        super.ep(nVar);
        BizBaseData bizBaseData = this.LLJJIJIIJIL;
        if ((bizBaseData instanceof ContentCellBizBaseData) && (contentCellBizBaseData = (ContentCellBizBaseData) bizBaseData) != null && (richCard = contentCellBizBaseData.getRichCard()) != null && (contentCellMinisRichCardParams = richCard.minisInfo) != null && (list = contentCellMinisRichCardParams.minisList) != null && (iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null)) != null && (interfaceC215300sJLJIIJJI = iMinisApiService.LJIIJJI()) != null) {
            interfaceC215300sJLJIIJJI.LIZ(EnumC215200sI.PROFILE_SIDEBAR, list);
        }
    }
}
