package com.ss.android.ugc.aweme.detail.component.biz;

import X.C01GW;
import X.C0NNE;
import X.C0P4Y;
import X.C1388190mED;
import X.C1843500y4a;
import X.C197039127h;
import X.C19EG;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2276471E8n;
import X.C23250099c;
import X.C384050F3z;
import X.C452501pT;
import X.C600090NgF;
import X.C600100NgG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C948503nH;
import Y.ACListenerS144S0100000_9;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursBottomShootComponent extends ShootButtonBottomComponent {
    public TuxTextView LLILZLL;
    public C197039127h LLIZ;
    public C0NNE LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 92));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 93));

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final int mo176do() {
        return 2131825072;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C0P4Y(this, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void bo(View view) {
        C0NNE c0nne;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        Aweme awemeLJIIIIZZ;
        Context context;
        C19EG c19egLIZIZ;
        LifecycleOwner lifecycleOwnerLIZ;
        LifecycleCoroutineScope lifecycleScope;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(C724240Sb0.LIZ(this), "add_yours", true) && (c0nne = this.LLIZLLLIL) != null && (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJ.getValue()) != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) != null && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            if (view != null && (lifecycleOwnerLIZ = C948503nH.LIZ(view)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ)) != null) {
                C23250099c.LIZLLL(lifecycleScope, null, null, new C600090NgF(c0nne, this, awemeLJIIIIZZ, c19egLIZIZ, null), 3);
                return;
            }
            C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cannot get valid add yours for aweme, aid=");
            sbLIZ.append(awemeLJIIIIZZ.getAid());
            c2276471E8n.LIZIZ("detail_feed", "AddYoursBottomShootComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void fo(View view) {
        TuxIconView tuxIconView;
        if (view != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.syy)) != null) {
            tuxIconView.setTintColorRes(R.attr.ee);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final View ko(ViewGroup viewGroup) {
        C0NNE c0nneLIZ;
        Long addYoursVideoCount;
        Aweme awemeLJIIIIZZ;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bkl, viewGroup, false);
        this.LLILZLL = (TuxTextView) viewTd.findViewById(R.id.ahk);
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.ahm);
        this.LLIZ = c197039127h;
        if (c197039127h != null) {
            c197039127h.setText(2131825072);
        }
        C197039127h c197039127h2 = this.LLIZ;
        if (c197039127h2 != null) {
            c197039127h2.setTextColorRes(R.attr.ef);
        }
        C197039127h c197039127h3 = this.LLIZ;
        if (c197039127h3 != null) {
            c197039127h3.setIconTintColorRes(R.attr.ef);
        }
        C197039127h c197039127h4 = this.LLIZ;
        if (c197039127h4 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            c197039127h4.setBackground(c384050F3z.LIZ(viewGroup.getContext()));
        }
        C197039127h c197039127h5 = this.LLIZ;
        if (c197039127h5 != null) {
            C786410Ut5.U8(c197039127h5, new ACListenerS144S0100000_9(this, 29));
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLJ.getValue();
        String quantityString = null;
        if (iFeedPanelPlatformAbility != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) != null) {
            c0nneLIZ = C600100NgG.LIZ(awemeLJIIIIZZ);
        } else {
            c0nneLIZ = null;
        }
        this.LLIZLLLIL = c0nneLIZ;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null && (addYoursVideoCount = c2189821An6.getAddYoursVideoCount()) != null) {
            long jLongValue = addYoursVideoCount.longValue();
            TuxTextView tuxTextView = this.LLILZLL;
            if (tuxTextView != null) {
                Resources resources = viewGroup.getContext().getResources();
                if (resources != null) {
                    quantityString = resources.getQuantityString(2131755081, (int) jLongValue, C1843500y4a.LIZIZ(jLongValue));
                }
                tuxTextView.setText(quantityString);
            }
        }
        return viewTd;
    }
}
