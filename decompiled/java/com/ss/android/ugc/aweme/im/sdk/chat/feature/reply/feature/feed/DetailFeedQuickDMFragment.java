package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed;

import X.C01GW;
import X.C07PJ;
import X.C098200Yq;
import X.C0I08;
import X.C0I0E;
import X.C0OBG;
import X.C0S1J;
import X.C0S1K;
import X.C0S1M;
import X.C0SZG;
import X.C1041450dCx;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1440005kM;
import X.C14LC;
import X.C1599690rjL;
import X.C1602160rnK;
import X.C1618440sDa;
import X.C1636506ax;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C419820GdA;
import X.C424370GkV;
import X.C444960Hcc;
import X.C452501pT;
import X.C453940Hr6;
import X.C786410Ut5;
import X.C800330VaR;
import X.EnumC896890ZGl;
import X.InterfaceC1209750haP;
import X.InterfaceC1361990lXx;
import X.InterfaceC1365380ldQ;
import X.InterfaceC424410GkZ;
import X.InterfaceC438360HGw;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFragment;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class DetailFeedQuickDMFragment extends BaseFragment implements C0I08, View.OnClickListener, InterfaceC1209750haP {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw3I2svIS4nZiMpKDsmOiBiHELIOSOyojJDxiLyoyPDA+LGE1LSAoZws2PCQlJQk2LSEdPCYwIwEBDz0yLygpJzs=";
    public TuxTextView LLIZ;
    public TuxIconView LLIZLLLIL;
    public C424370GkV LLJ;
    public C0SZG LLJI;
    public Aweme LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(120));
    public Bundle LLJILJILJ;
    public C1389890mGx LLJILLL;

    @Override // X.C0I08
    public final void TG() {
        C1440005kM.LIZ(new C453940Hr6(true, false, 4));
    }

    public final C424370GkV UR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.h0_) : null;
            this.LLJ = (C424370GkV) viewFindViewById;
        }
        return (C424370GkV) viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final QuickDMEventParam VR() {
        Bundle bundle = this.LLJILJILJ;
        String string = bundle != null ? bundle.getString("enter_position") : null;
        Bundle bundle2 = this.LLJILJILJ;
        String string2 = bundle2 != null ? bundle2.getString("enter_from") : null;
        Bundle bundle3 = this.LLJILJILJ;
        String string3 = bundle3 != null ? bundle3.getString("group_id") : null;
        Bundle bundle4 = this.LLJILJILJ;
        String string4 = bundle4 != null ? bundle4.getString("author_id") : null;
        Bundle bundle5 = this.LLJILJILJ;
        String string5 = bundle5 != null ? bundle5.getString("follow_status") : null;
        C0S1J c0s1j = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        InterfaceC438360HGw interfaceC438360HGwLJJLIIIJL = C1618440sDa.LIZIZ.LJJLIIIJL();
        Aweme aweme = this.LLJIJIL;
        Bundle bundle6 = this.LLJILJILJ;
        boolean z = false;
        return new QuickDMEventParam(string, string2, string3, string4, string5, c0s1j, interfaceC438360HGwLJJLIIIJL.LIZ(aweme, bundle6 != null ? bundle6.getBoolean("is_story_immersive_feed") : false, false, false) ? "1" : CardStruct.IStatusCode.DEFAULT, objArr2 == true ? 1 : 0, z, z, objArr == true ? 1 : 0, z, 16224);
    }

    public final TuxTextView WR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t7o) : null;
            this.LLIZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxIconView ZR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uq2) : null;
            this.LLIZLLLIL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    @Override // X.InterfaceC1209750haP
    public final void Zg() {
        C1389890mGx c1389890mGx = this.LLJILLL;
        if (c1389890mGx != null) {
            c1389890mGx.LIZIZ();
        }
    }

    public final void cS() {
        TuxTextView tuxTextViewWR = WR();
        if (tuxTextViewWR != null) {
            C0S1K c0s1k = C0S1K.LIZIZ;
            Context context = getContext();
            InterfaceC438360HGw interfaceC438360HGwLJJLIIIJL = C1618440sDa.LIZIZ.LJJLIIIJL();
            Aweme aweme = this.LLJIJIL;
            Bundle bundle = this.LLJILJILJ;
            tuxTextViewWR.setHint(c0s1k.LJII(context, interfaceC438360HGwLJJLIIIJL.LIZ(aweme, bundle != null ? bundle.getBoolean("is_story_immersive_feed") : false, false, false)));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
    }

    @Override // X.InterfaceC1209750haP
    public final void LJLJJI(Aweme aweme) {
        this.LLJIJIL = aweme;
        cS();
    }

    public final void SR(String str) {
        String string;
        int i;
        int i2;
        int i3;
        boolean z;
        TuxIconView tuxIconViewZR = ZR();
        if (tuxIconViewZR == null) {
            return;
        }
        int iIntValue = 0;
        if (str != null) {
            int length = str.length() - 1;
            int i4 = 0;
            boolean z2 = false;
            while (i4 <= length) {
                if (!z2) {
                    i3 = i4;
                } else {
                    i3 = length;
                }
                if (Intrinsics.LJI(str.charAt(i3), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i4++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            string = str.subSequence(i4, length + 1).toString();
        } else {
            string = null;
        }
        boolean z3 = !TextUtils.isEmpty(string);
        boolean zIsActivated = tuxIconViewZR.isActivated();
        tuxIconViewZR.setActivated(z3);
        tuxIconViewZR.setEnabled(z3);
        Context context = getContext();
        if (context != null) {
            if (z3) {
                i2 = R.attr.a04;
            } else {
                i2 = R.attr.a2o;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(i2, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
        }
        if (z3) {
            i = R.attr.ee;
        } else {
            i = R.attr.c3;
        }
        tuxIconViewZR.getBackground().setTint(iIntValue);
        tuxIconViewZR.setTintColorRes(i);
        if (z3 && !zIsActivated) {
            C419820GdA.LIZ(tuxIconViewZR);
        }
    }

    public final void bS(CharSequence charSequence) {
        User author;
        String string;
        String string2;
        if (charSequence != null) {
            IMSharePanelApi.LIZ.getClass();
            InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
            String string3 = charSequence.toString();
            Aweme aweme = this.LLJIJIL;
            if (aweme != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            Aweme aweme2 = this.LLJIJIL;
            Bundle bundle = this.LLJILJILJ;
            if (bundle != null) {
                string = bundle.getString("enter_from");
            } else {
                string = null;
            }
            String str = "";
            if (string == null) {
                string = "";
            }
            Bundle bundle2 = this.LLJILJILJ;
            if (bundle2 != null && (string2 = bundle2.getString("enter_position")) != null) {
                str = string2;
            }
            shareService.LJIJJ(string3, null, author, aweme2, string, "story_exposed_emoji", str, Boolean.TRUE, true, null, null, null, new LinkedHashMap(), new InterfaceC1361990lXx() { // from class: X.0SVH
                @Override // X.InterfaceC1361990lXx
                public final /* synthetic */ void LIZIZ(HashMap map) {
                }

                @Override // X.InterfaceC1361990lXx
                public final void LIZ() {
                    User author2;
                    DetailFeedQuickDMFragment detailFeedQuickDMFragment = this.LIZ;
                    Aweme aweme3 = detailFeedQuickDMFragment.LLJIJIL;
                    String nickname = (aweme3 == null || (author2 = aweme3.getAuthor()) == null) ? null : author2.getNickname();
                    C0S1K c0s1k = C0S1K.LIZIZ;
                    C19EG activity = detailFeedQuickDMFragment.getActivity();
                    if (nickname == null) {
                        nickname = "";
                    }
                    C1389890mGx c1389890mGxLJIIIZ = c0s1k.LJIIIZ(activity, nickname);
                    detailFeedQuickDMFragment.LLJILLL = c1389890mGxLJIIIZ;
                    if (c1389890mGxLJIIIZ != null) {
                        c1389890mGxLJIIIZ.LJIIJJI();
                    }
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Aweme aweme;
        User author;
        C19EG c19egLIZIZ;
        String string;
        CharSequence text;
        if (!C1636506ax.LIZ(this) || C0OBG.LIZ(500L, view)) {
            return;
        }
        if (Intrinsics.LJFF(view, ZR())) {
            if (C1636506ax.LIZ(this) && (text = WR().getText()) != null) {
                bS(text);
                WR().setText("");
                SR("");
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(view, WR()) || (aweme = this.LLJIJIL) == null || (author = aweme.getAuthor()) == null) {
            return;
        }
        String strLJII = C0S1K.LIZIZ.LJII(getContext(), false);
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            IIMChatService imChatService = ((IIMService) this.LLJILJIL.getValue()).getImChatService();
            FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            Bundle bundle = this.LLJILJILJ;
            String string2 = null;
            if (bundle == null || (string = bundle.getString("enter_from")) == null) {
                string = "";
            }
            Bundle bundle2 = this.LLJILJILJ;
            if (bundle2 != null) {
                string2 = bundle2.getString("enter_position");
            }
            imChatService.LIZIZ(c19egLIZIZ, supportFragmentManager, author, aweme, string, string2, new AwS377S0200000_11(this, author, 89), this.LLJI, true, false, EnumC896890ZGl.TYPE_DETAIL_FEED_STORY_ENTRANCE, strLJII, null, "", VR(), this, null, null, null, null, false, null, null);
        }
        aS("click_story_dm_input_box", "click_input_box");
    }

    @Override // X.InterfaceC1209750haP
    public final void x5(View view) {
        View viewFindViewById;
        if (view != null && (viewFindViewById = view.findViewById(R.id.ka1)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
    }

    @Override // X.C0I08
    public final void YO(C0I0E c0i0e, String str) {
        C1440005kM.LIZ(new C453940Hr6(false, false, 4));
        if (C1636506ax.LIZ(this) && str != null) {
            WR().setText(str);
            SR(str);
        }
    }

    public final void aS(String str, String str2) {
        C0S1M.LIZ(str, QuickDMEventParam.LIZ(VR(), str2, null, null, 16351));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        super.onViewCreated(view, bundle);
        cS();
        C786410Ut5.h9(WR(), this);
        TuxIconView tuxIconViewZR = ZR();
        if (tuxIconViewZR != null) {
            C786410Ut5.a9(tuxIconViewZR, this);
        }
        InterfaceC438360HGw interfaceC438360HGwLJJLIIIJL = C1618440sDa.LIZIZ.LJJLIIIJL();
        Aweme aweme = this.LLJIJIL;
        Bundle bundle2 = this.LLJILJILJ;
        if (bundle2 != null) {
            z = bundle2.getBoolean("is_story_immersive_feed");
        } else {
            z = false;
        }
        if (interfaceC438360HGwLJJLIIIJL.LIZ(aweme, z, false, false)) {
            UR().LIZ(C07PJ.LIZ());
            C424370GkV c424370GkVUR = UR();
            if (c424370GkVUR != null) {
                c424370GkVUR.setEmojiRecommendationSelectListener(new InterfaceC424410GkZ() { // from class: X.0SVI
                    @Override // X.InterfaceC424410GkZ
                    public final void LIZ(View view2, CharSequence charSequence, int i2) {
                        this.LIZ.bS(charSequence.toString());
                        C0SZG c0szg = this.LIZ.LLJI;
                        if (c0szg != null) {
                            c0szg.LIZIZ(view2, charSequence);
                        }
                        this.LIZ.aS("click_story_dm_input_box", "click_exposed_emoji");
                    }
                });
            }
        } else {
            C424370GkV c424370GkVUR2 = UR();
            int visibility = c424370GkVUR2.getVisibility();
            c424370GkVUR2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c424370GkVUR2);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            float fLIZIZ = C1041450dCx.LIZIZ(C14LC.LJIILIIL, activity);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = (int) fLIZIZ;
            C786410Ut5.W5(view, layoutParams);
        }
        Context context = view.getContext();
        if (C444960Hcc.LIZIZ()) {
            i = R.drawable.c_1;
        } else {
            i = R.drawable.c_0;
        }
        Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, i);
        View viewFindViewById = view.findViewById(R.id.kqv);
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(drawableLIZIZ);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.so2);
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
    }

    @Override // X.InterfaceC1209750haP
    public final void Wp(View view, Aweme aweme, Bundle bundle) {
        View viewFindViewById;
        this.LLJILJILJ = bundle;
        if (aweme != null) {
            if (view != null && (viewFindViewById = view.findViewById(R.id.ka1)) != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            this.LLJIJIL = aweme;
        }
        aS("story_dm_input_box_show", null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.chl, viewGroup, false);
        C786410Ut5.LJLLLL((ViewStub) viewTd.findViewById(R.id.t7y));
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
