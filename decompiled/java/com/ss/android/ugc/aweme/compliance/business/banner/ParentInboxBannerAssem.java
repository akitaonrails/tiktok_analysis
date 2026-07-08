package com.ss.android.ugc.aweme.compliance.business.banner;

import X.AbstractC431450Gvv;
import X.C098200Yq;
import X.C1056650dbT;
import X.C1227904rF;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1713200ugQ;
import X.C189200o6;
import X.C1904630zfB;
import X.C786410Ut5;
import X.EnumC637310OzB;
import X.InterfaceC1891350zJl;
import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class ParentInboxBannerAssem extends InboxBannerCustomAssem {
    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        ParentInboxBannerConfig parentInboxBannerConfig;
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        Object c098200Yq;
        super.onCreate();
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService == null || (eligibilityModelLIZ = iGatekeeperService.LIZ("vpc_parent_inbox_banner_go_rule")) == null) {
            parentInboxBannerConfig = new ParentInboxBannerConfig(false, "", "", "");
        } else {
            List<DecisionMakerNetworkApi.PPFActionModel> list = eligibilityModelLIZ.actionList;
            if (list.isEmpty()) {
                parentInboxBannerConfig = new ParentInboxBannerConfig(false, "", "", "");
            } else {
                try {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    String str = ((DecisionMakerNetworkApi.PPFActionModel) C13LP.LJJJJZI(list)).actionParams;
                    c1227904rF.getClass();
                    c098200Yq = (ParentInboxBannerConfig) C1227904rF.LIZIZ(str, ParentInboxBannerConfig.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = new ParentInboxBannerConfig(false, "", "", "");
                }
                parentInboxBannerConfig = (ParentInboxBannerConfig) c098200Yq;
            }
        }
        if (parentInboxBannerConfig.showStatus) {
            this.LL.setValue(new Pair(EnumC637310OzB.TOP_SHOW, new C1713200ugQ(parentInboxBannerConfig.content, parentInboxBannerConfig.actionString, parentInboxBannerConfig.actionUrl)));
        } else {
            this.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final RecyclerView.ViewHolder ko(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1713200ugQ.class))) {
            int i = C1056650dbT.LL;
            return new C1056650dbT(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dub, viewGroup, false));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final void ho(RecyclerView.ViewHolder viewHolder, InterfaceC1891350zJl interfaceC1891350zJl, int i) {
        C1713200ugQ c1713200ugQ;
        if ((interfaceC1891350zJl instanceof C1713200ugQ) && (c1713200ugQ = (C1713200ugQ) interfaceC1891350zJl) != null && (viewHolder instanceof C1056650dbT)) {
            final C1056650dbT c1056650dbT = (C1056650dbT) viewHolder;
            C1904630zfB c1904630zfB = new C1904630zfB(this);
            View view = c1056650dbT.itemView;
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.eu1);
            String str = c1713200ugQ.LL;
            String str2 = c1713200ugQ.LLILLJJLI;
            final String str3 = c1713200ugQ.LLILLL;
            SpannableString spannableString = new SpannableString(str);
            final int iIntValue = 0;
            int iLJJJ = a0.LJJJ(spannableString, str2, 0, false, 6);
            if (iLJJJ >= 0) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, c1056650dbT.itemView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                C786410Ut5.p2(spannableString, new AbstractC431450Gvv(iIntValue, c1056650dbT, str3) { // from class: X.0zfC
                    public final /* synthetic */ C1056650dbT LLILZ;
                    public final /* synthetic */ String LLILZIL;

                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view2) {
                        this.LLILZ.I5(this.LLILZIL);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(iIntValue, iIntValue);
                        this.LLILZ = c1056650dbT;
                        this.LLILZIL = str3;
                    }
                }, iLJJJ, str2.length() + iLJJJ, 33);
            }
            tuxTextView.setText(spannableString);
            C786410Ut5.h9(tuxTextView, new ACListenerS130S0200000_28(c1056650dbT, c1713200ugQ, 52));
            C786410Ut5.a9((TuxIconView) view.findViewById(R.id.e1i), new ACListenerS162S0100000_28(c1904630zfB, 134));
        }
    }
}
