package com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity;

import X.C019F;
import X.C049X;
import X.C0C17;
import X.C0H1U;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1748440vbG;
import X.C1748720vbi;
import X.C1749140vcO;
import X.C1749190vcT;
import X.C1775970wJf;
import X.C197039127h;
import X.C19719912Dl;
import X.C19FO;
import X.C2217381BqS;
import X.C703302op;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C876903bj;
import X.EnumC1749210vcV;
import X.InterfaceC2217461Bqa;
import X.ViewOnFocusChangeListenerC1775860wJU;
import Y.ACListenerS58S0400000_26;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressIdentityAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public TuxNavBar LLIZLLLIL;
    public TuxTextView LLJ;
    public C1749190vcT LLJI;
    public C197039127h LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C1559260qg8 LLJILJILJ;
    public C1748440vbG LLJILLL;
    public IdentityInfoOption LLJJ;
    public List<IdentityInfoOption> LLJJI;
    public long LLJJIII;
    public String LLJJIJI;
    public Boolean LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddressIdentityAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/address/identity/AddressIdentityViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddressIdentityAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressIdentityViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 169), AFwS268S0000000_26.get$arr$(195), null, true);
        this.LLJILJILJ = new C1559260qg8(new C723590SZx(this, C876903bj.class, null), checkSupervisorPrepared());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, java.lang.Object> Go() {
        /*
            r7 = this;
            r0 = 5
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            X.03bj r0 = r7.Ho()
            java.lang.String r2 = r0.LLILLL
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "fill_type"
            r1.<init>(r0, r2)
            r0 = 0
            r3[r0] = r1
            boolean r0 = X.C0C17.LIZ()
            r6 = 2
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L59
            java.lang.String r2 = "tax_id"
        L1e:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "input_box_name"
            r1.<init>(r0, r2)
            r3[r5] = r1
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "page_name"
            java.lang.String r0 = "add_certification"
            r2.<init>(r1, r0)
            r3[r6] = r2
            java.lang.String r2 = r7.LLJJIJI
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "trigger_event"
            r1.<init>(r0, r2)
            r0 = 3
            r3[r0] = r1
            java.lang.Boolean r0 = r7.LLJJIJIIJIL
            if (r0 == 0) goto L4a
            boolean r0 = r0.booleanValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L4a:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_delivery_info_complete"
            r1.<init>(r0, r4)
            r0 = 4
            r3[r0] = r1
            java.util.HashMap r0 = X.C2097608Jq.LJI(r3)
            return r0
        L59:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption r0 = r7.LLJJ
            if (r0 == 0) goto L75
            java.lang.Integer r1 = r0.getType()
            if (r1 == 0) goto L75
            int r0 = r1.intValue()
            if (r0 != r5) goto L6c
            java.lang.String r2 = "rfc_info"
            goto L1e
        L6c:
            int r0 = r1.intValue()
            if (r0 != r6) goto L75
            java.lang.String r2 = "curp_info"
            goto L1e
        L75:
            java.lang.String r2 = ""
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityAssem.Go():java.util.HashMap");
    }

    public final C876903bj Ho() {
        return (C876903bj) this.LLJILJILJ.getValue();
    }

    public final C1749190vcT Jo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.oz4) : null;
            this.LLJI = (C1749190vcT) viewFindViewById;
        }
        return (C1749190vcT) viewFindViewById;
    }

    public final C197039127h Lo() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.oz5) : null;
            this.LLJIJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxNavBar No() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.oz6) : null;
            this.LLIZLLLIL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        IdentityInfoOption identityInfoOption;
        C197039127h c197039127hLo;
        C1749140vcO c1749140vcO;
        String hint;
        String value;
        String name;
        IdentityInfoOption identityInfoOption2;
        View viewFindViewById;
        int iIntValue;
        Integer numLIZJ;
        C19FO c19fo;
        super.onViewCreated(view);
        IdentityInfoPanel identityInfoPanel = Ho().LL;
        this.LLJJIJI = Ho().LLILZIL;
        this.LLJJIJIIJIL = Ho().LLILZLL;
        List<IdentityInfoOption> identityInfoOptions = identityInfoPanel.getIdentityInfoOptions();
        if (identityInfoOptions == null) {
            identityInfoOptions = C13BV.INSTANCE;
        }
        this.LLJJI = identityInfoOptions;
        List<IdentityInfoOption> identityInfoOptions2 = identityInfoPanel.getIdentityInfoOptions();
        String value2 = null;
        if (identityInfoOptions2 != null) {
            identityInfoOption = (IdentityInfoOption) C13LP.LJJJLL(identityInfoOptions2);
        } else {
            identityInfoOption = null;
        }
        this.LLJJ = identityInfoOption;
        Context context = getContext();
        if ((context instanceof C19FO) && (c19fo = (C19FO) context) != null) {
            new KeyBoardVisibilityUtil(c19fo, (Integer) 16, (Function2<? super Boolean, ? super Integer, Unit>) new AwS640S0100000_26(this, 91));
        }
        TuxNavBar tuxNavBarNo = No();
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        String title = identityInfoPanel.getTitle();
        if (title == null) {
            title = "Add certification";
        }
        c1250250idj.LIZJ = title;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1303));
        c0om1.LIZIZ(c1251150ifB);
        tuxNavBarNo.setNavActions(c0om1);
        TuxNavBar tuxNavBarNo2 = No();
        if (tuxNavBarNo2 != null && (viewFindViewById = tuxNavBarNo2.findViewById(R.id.p1z)) != null) {
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context2)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            viewFindViewById.setBackgroundColor(iIntValue);
        }
        C1748720vbi.LIZLLL(No(), new C049X(), new AwS605S0100000_26(this, 557));
        View viewFindViewById2 = this.LLJ;
        if (viewFindViewById2 == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById2 = viewLJJIJL.findViewById(R.id.oz3);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJ = (TuxTextView) viewFindViewById2;
        }
        C0H1U.LJIIL((TextView) viewFindViewById2, identityInfoPanel.getDescription(), true);
        Context context3 = getContext();
        if (context3 != null) {
            String placeholderText = "";
            if (!C0C17.LIZ()) {
                c1749140vcO = new C1749140vcO(context3, null, 6);
                c1749140vcO.setSizeVariant(0);
                List<IdentityInfoOption> identityInfoOptions3 = identityInfoPanel.getIdentityInfoOptions();
                if (identityInfoOptions3 == null || (identityInfoOption2 = (IdentityInfoOption) C13LP.LJJJLL(identityInfoOptions3)) == null || (name = identityInfoOption2.getName()) == null) {
                    name = "";
                }
                c1749140vcO.setText(name);
                c1749140vcO.setInlineMode(true);
                c1749140vcO.setBackground(null);
                C786410Ut5.X8(c1749140vcO, new ACListenerS58S0400000_26(c1749140vcO, context3, this, identityInfoPanel, 3));
            } else {
                c1749140vcO = null;
            }
            C1748440vbG c1748440vbG = new C1748440vbG(context3, null, 6);
            C786410Ut5.L6(c1748440vbG, new LinearLayout.LayoutParams(-1, -2));
            c1748440vbG.LJIILLIIL(true);
            c1748440vbG.setSizeVariant(0);
            IdentityInfoOption identityInfoOption3 = this.LLJJ;
            if (identityInfoOption3 != null) {
                value2 = identityInfoOption3.getValue();
            }
            if (C703302op.LIZ(value2)) {
                IdentityInfoOption identityInfoOption4 = this.LLJJ;
                if (identityInfoOption4 != null && (value = identityInfoOption4.getValue()) != null) {
                    placeholderText = value;
                }
                c1748440vbG.LLJLILLLLZIIL.setText(placeholderText);
            } else {
                if (C0C17.LIZ()) {
                    placeholderText = identityInfoPanel.getPlaceholderText();
                } else {
                    IdentityInfoOption identityInfoOption5 = this.LLJJ;
                    if (identityInfoOption5 != null && (hint = identityInfoOption5.getHint()) != null) {
                        placeholderText = hint;
                    }
                }
                c1748440vbG.setPlaceholderText(placeholderText);
            }
            c1748440vbG.LJI(c1749140vcO);
            c1748440vbG.LIZ(new C1775970wJf(this, identityInfoPanel, 0));
            c1748440vbG.setEditTextOnFocusChangeListener(new ViewOnFocusChangeListenerC1775860wJU(this, 10));
            this.LLJILLL = c1748440vbG;
            C1749190vcT c1749190vcTJo = Jo();
            if (c1749190vcTJo != null) {
                String invalidHint = Ho().LLILZ;
                if (invalidHint == null) {
                    invalidHint = identityInfoPanel.getInvalidHint();
                }
                c1749190vcTJo.LIZJ(invalidHint);
                c1749190vcTJo.setFormField(this.LLJILLL);
                c1749190vcTJo.LIZIZ(EnumC1749210vcV.NONE);
            }
            C1748720vbi.LIZLLL(Jo(), new C049X(), new AwS605S0100000_26(this, 555));
        }
        String taxSubmitButton = Ho().LL.getTaxSubmitButton();
        if (taxSubmitButton != null && (c197039127hLo = Lo()) != null) {
            c197039127hLo.setText(taxSubmitButton);
        }
        C197039127h c197039127hLo2 = Lo();
        if (c197039127hLo2 != null) {
            C786410Ut5.I7(new AjS44S0200000_26(this, identityInfoPanel, 33), c197039127hLo2);
        }
        C1748720vbi.LIZLLL(Lo(), new C049X(), new AwS605S0100000_26(this, 552));
    }
}
