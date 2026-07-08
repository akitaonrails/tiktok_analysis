package com.ss.android.ugc.aweme.authorize;

import X.C098200Yq;
import X.C09RB;
import X.C0JEF;
import X.C1233040iBy;
import X.C1255390im1;
import X.C12ES;
import X.C1326305Gz;
import X.C1388190mED;
import X.C1390920mIc;
import X.C13LP;
import X.C1428310nGv;
import X.C15438062q;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C19H6;
import X.C19H7;
import X.C1B3Q;
import X.C1B3S;
import X.C1B3X;
import X.C20684815ws;
import X.C21411818qq;
import X.C2188811AlT;
import X.C2197221Az2;
import X.C2197371AzH;
import X.C2198601B3a;
import X.C2248981D0u;
import X.C2344009Gk;
import X.C259800zU;
import X.C444890HcV;
import X.C786410Ut5;
import X.EnumC1779940wQ4;
import X.EnumC688760Qzy;
import X.InterfaceC2198731B3n;
import Y.ACListenerS168S0100000_34;
import Y.ARunnableS129S0100000_29;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.authorize.I18nAuthorizeFragment;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPageDetail;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPageText;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScopeStruct;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes35.dex */
public class I18nAuthorizeFragment extends Fragment implements C0JEF, InterfaceC2198731B3n {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQ5PSHELIOSc8Oiw2LGEaeX0iCDonICo+IDU2DjctLiI2JjE=";
    public TuxTextView LL;
    public LinearLayout LLILLJJLI;
    public C197039127h LLILLL;
    public C197039127h LLILZ;
    public LinearLayout LLILZIL;
    public TuxIconView LLILZLL;
    public TuxTextView LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public RelativeLayout LLJI;
    public RemoteImageView LLJIJIL;
    public RemoteImageView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public FrameLayout LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public C197039127h LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public View LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public LinearLayout LLJJL;
    public LinearLayout LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxIconView LLJLIL;
    public RemoteImageView LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public View LLJLLIL;
    public TuxTextView LLJLLL;
    public LinearLayout LLJZ;
    public View LLJZIJLIL;
    public LinearLayout LLL;
    public String LLLFFI;
    public AuthCommonViewModel LLLFZ;
    public AwemeAuthorizePlatformDepend LLLI;
    public C19H7 LLLII;
    public String LLLIIIIL;
    public String LLLIIIL;
    public OAuthPage LLLIIL;
    public List<OAuthScope> LLLIILIL;
    public List<OAuthScope> LLLIL;
    public List<OAuthScope> LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLIZZ;
    public String LLLJ;
    public boolean LLLJIL;
    public String LLLJL;
    public String LLLL;
    public String LLLLII;
    public boolean LLLLIIIILLL;
    public boolean LLLLIILL;
    public String LLLLLLZZ;
    public TuxSheet LLLLLZ;
    public View LLLLLZIL;
    public boolean LLLLLZL;
    public final List<C21411818qq> LLLF = new ArrayList();
    public final List<OAuthScope> LLLFF = new ArrayList();
    public C1B3S LLLIIII = new C1B3S();
    public String LLLILZLLLI = "";
    public EnumC1779940wQ4 LLLLIIL = EnumC1779940wQ4.AUTHENTICATION_ONLY;
    public String LLLLIILLL = "";
    public String LLLLIL = "";
    public String LLLLILI = "";
    public String LLLLJ = "";
    public String LLLLJI = "";
    public String LLLLL = "";
    public String LLLLLIL = "";
    public String LLLLLILLIL = "";
    public String LLLLLJIL = "";
    public String LLLLLJLJLL = "";
    public final StringBuilder LLLLLL = new StringBuilder();
    public String LLLLLLIL = "";
    public String LLLLLLJ = "";
    public String LLLLLLL = "";
    public final List<C21411818qq> LLLLLLLLL = new ArrayList();
    public final List<Pair<String, View>> LLLLLLLLLL = new ArrayList();
    public final Set<String> LLLLLLLZIL = new HashSet();
    public final Set<String> LLLLLLZ = new HashSet();
    public final boolean LLLLZ = true;

    public final TuxTextView BS() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wt5) : null;
            this.LLJILJILJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxIconView ES() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wt0) : null;
            this.LLJLIL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final RemoteImageView FS() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.xvr) : null;
            this.LLJIJIL = (RemoteImageView) viewFindViewById;
        }
        return (RemoteImageView) viewFindViewById;
    }

    public final void GS() {
        ((HashSet) this.LLLLLLZ).clear();
        ((HashSet) this.LLLLLLLZIL).clear();
        MR(this.LLLIIII);
        new Pair(C13LP.LJJLIIIJ(this.LLLLLLZ, ",", null, null, 0, null, null, 62), C13LP.LJJLIIIJ(this.LLLLLLLZIL, ",", null, null, 0, null, null, 62));
    }

    public final View HS() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.y82) : null;
            this.LLJLLIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final TuxTextView JS() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.y85) : null;
            this.LLJLLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView NS() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.txtIncremental) : null;
            this.LLJJJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView PS() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.txt_login_title_below) : null;
            this.LLJJIJIIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView QS() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.txt_login_title) : null;
            this.LL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final void RR() {
        StringBuilder sb = new StringBuilder();
        String str = this.LLLLIILLL;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '{' && cCharAt != '}') {
                sb.append(cCharAt);
            }
        }
        this.LLLLIILLL = sb.toString();
    }

    public final TuxTextView RS() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.txt_scope_hint) : null;
            this.LLJJIJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final RemoteImageView SR() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bbj) : null;
            this.LLJLILLLLZIIL = (RemoteImageView) viewFindViewById;
        }
        return (RemoteImageView) viewFindViewById;
    }

    public final LinearLayout UR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bbo) : null;
            this.LLILLJJLI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final TuxTextView US() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.txt_select_all) : null;
            this.LLIZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final LinearLayout VR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bch) : null;
            this.LLILZIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final TuxTextView VS() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.user_account_tv) : null;
            this.LLJJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final LinearLayout WR() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bht) : null;
            this.LLJJIJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C2344009Gk ZR() {
        C1B3Q c1b3q = C1B3Q.LIZ;
        String str = this.LLLJ;
        String str2 = this.LLLIIII.LIZJ;
        boolean z = this.LLLILZJ;
        String str3 = this.LLLIIIIL;
        if (str3 == null) {
            str3 = null;
        }
        String str4 = this.LLLIIIL;
        String str5 = str4 != null ? str4 : null;
        String str6 = this.LLLL;
        String str7 = this.LLLJL;
        c1b3q.getClass();
        return C1B3Q.LIZ(str, str2, str3, str5, str6, str7, str, z);
    }

    public final View aS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dtc) : null;
            this.LLIZLLLIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final TuxTextView bS() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.e14) : null;
            this.LLJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final String cS() {
        return this.LLLIIII.LIZJ;
    }

    public final RelativeLayout dS() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eux) : null;
            this.LLJI = (RelativeLayout) viewFindViewById;
        }
        return (RelativeLayout) viewFindViewById;
    }

    public final C197039127h gS() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.f716h5m) : null;
            this.LLILZ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h hS() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.h5n) : null;
            this.LLILLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final LinearLayout iS() {
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.h5o) : null;
            this.LLJJJJJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final TuxTextView kS() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.h5p) : null;
            this.LLJL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxIconView mS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jxz) : null;
            this.LLILZLL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final TuxIconView nS() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kmg) : null;
            this.LLJLL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final LinearLayout oS() {
        View viewFindViewById = this.LLJZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.mpb) : null;
            this.LLJZ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final View qS() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u1t) : null;
            this.LLJJJ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View rS() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u1w) : null;
            this.LLJ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View sS() {
        View viewFindViewById = this.LLJZIJLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uyb) : null;
            this.LLJZIJLIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final LinearLayout uS() {
        View viewFindViewById = this.LLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uyc) : null;
            this.LLL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C197039127h wS() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wt1) : null;
            this.LLJJIII = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxTextView yS() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wt3) : null;
            this.LLJJJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final FrameLayout zS() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wt4) : null;
            this.LLJILLL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final void PR() {
        hS().setEnabled(true);
        hS().setClickable(true);
        hS().setButtonVariant(0);
    }

    public final void fT() {
        AccountUserService accountUserServiceLJIIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tooltip_shown");
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        sbLIZ.append((iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? null : accountUserServiceLJIIJ.getCurUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Keva repo = Keva.getRepo("mini_game_auth_keva");
        if (repo.getBoolean(strLIZIZ, false)) {
            C786410Ut5.LLLLZLL(JS(), 8);
            C786410Ut5.LJLLLLLL(8, HS());
            return;
        }
        JS().setText(this.LLLLLIL);
        C786410Ut5.LLLLZLL(JS(), 0);
        C786410Ut5.LJLLLLLL(0, HS());
        repo.storeBoolean(strLIZIZ, true);
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, new BPEAHandler(Looper.getMainLooper()), new ARunnableS129S0100000_29(this, 19));
    }

    public final void hT() {
        String str;
        hS().setEnabled(true);
        Collection arrayList = this.LLLIILIL;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str2 = ((OAuthScope) it2.next()).scopeName;
            if (str2 != null) {
                arrayList3.add(str2);
            }
        }
        Set setLLIIIZ = C13LP.LLIIIZ(arrayList3);
        int i = 0;
        for (C21411818qq c21411818qq : this.LLLF) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            C21411818qq c21411818qq2 = c21411818qq;
            OAuthScope oAuthScope = (OAuthScope) C13LP.LJJJLZIJ(i, this.LLLFF);
            if (oAuthScope != null && (str = oAuthScope.scopeName) != null) {
                if (c21411818qq2.isChecked()) {
                    if (!setLLIIIZ.contains(str)) {
                        arrayList2.add(oAuthScope);
                        setLLIIIZ.add(str);
                    }
                } else if (setLLIIIZ.contains(str)) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.LJFF(((OAuthScope) it3.next()).scopeName, str)) {
                            it3.remove();
                        }
                    }
                    setLLIIIZ.remove(str);
                }
            }
            i = i2;
        }
        this.LLLIILIL = arrayList2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        ((ArrayList) this.LLLF).clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:463:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0c1d  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0e3e  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0e8e  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x0ea4  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0f07  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x0f2c  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x0fc9  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x1158  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x115b  */
    /* JADX WARN: Removed duplicated region for block: B:824:0x1178  */
    /* JADX WARN: Type inference failed for: r29v0, types: [androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.authorize.I18nAuthorizeFragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v121 */
    /* JADX WARN: Type inference failed for: r2v122, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v135 */
    /* JADX WARN: Type inference failed for: r2v136, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v150 */
    /* JADX WARN: Type inference failed for: r2v151, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v164 */
    /* JADX WARN: Type inference failed for: r2v165, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v174 */
    /* JADX WARN: Type inference failed for: r2v175, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v211 */
    /* JADX WARN: Type inference failed for: r2v212, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v221 */
    /* JADX WARN: Type inference failed for: r2v222, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v231 */
    /* JADX WARN: Type inference failed for: r2v232, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v265 */
    /* JADX WARN: Type inference failed for: r2v266, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v275 */
    /* JADX WARN: Type inference failed for: r2v276, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v284 */
    /* JADX WARN: Type inference failed for: r2v285, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.List<com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope>] */
    /* JADX WARN: Type inference failed for: r2v320 */
    /* JADX WARN: Type inference failed for: r2v321, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v332 */
    /* JADX WARN: Type inference failed for: r2v333, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v342 */
    /* JADX WARN: Type inference failed for: r2v343, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.util.List<com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope>] */
    /* JADX WARN: Type inference failed for: r2v359 */
    /* JADX WARN: Type inference failed for: r2v360, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v376 */
    /* JADX WARN: Type inference failed for: r2v377, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.util.List<com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope>] */
    /* JADX WARN: Type inference failed for: r2v398 */
    /* JADX WARN: Type inference failed for: r2v399, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v485 */
    /* JADX WARN: Type inference failed for: r2v486 */
    /* JADX WARN: Type inference failed for: r2v487 */
    /* JADX WARN: Type inference failed for: r2v488 */
    /* JADX WARN: Type inference failed for: r2v489 */
    /* JADX WARN: Type inference failed for: r2v490 */
    /* JADX WARN: Type inference failed for: r2v491 */
    /* JADX WARN: Type inference failed for: r2v492 */
    /* JADX WARN: Type inference failed for: r2v493 */
    /* JADX WARN: Type inference failed for: r2v494 */
    /* JADX WARN: Type inference failed for: r2v495 */
    /* JADX WARN: Type inference failed for: r2v496 */
    /* JADX WARN: Type inference failed for: r2v497 */
    /* JADX WARN: Type inference failed for: r2v500 */
    /* JADX WARN: Type inference failed for: r2v501 */
    /* JADX WARN: Type inference failed for: r2v502 */
    /* JADX WARN: Type inference failed for: r2v503 */
    /* JADX WARN: Type inference failed for: r2v504 */
    /* JADX WARN: Type inference failed for: r2v505 */
    /* JADX WARN: Type inference failed for: r2v506 */
    /* JADX WARN: Type inference failed for: r2v507 */
    /* JADX WARN: Type inference failed for: r2v508 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55, types: [com.ss.android.ugc.aweme.openauthorize.entity.OAuthScopeStruct] */
    /* JADX WARN: Type inference failed for: r3v171, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v172, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v183, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void XS(com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 4578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.authorize.I18nAuthorizeFragment.XS(com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage, boolean):void");
    }

    public static boolean OR(String str) {
        return new Regex("<[^>]+>").containsMatchIn(str);
    }

    public static String eT(String str) {
        return new Regex("<.*?>").replace(str, "");
    }

    public final void MR(C1B3S c1b3s) {
        HashSet hashSet = new HashSet();
        List<OAuthScope> list = this.LLLIILIL;
        if (list != null) {
            Iterator<OAuthScope> it2 = list.iterator();
            while (it2.hasNext()) {
                hashSet.add(String.valueOf(it2.next().scopeName));
            }
        }
        List<OAuthScope> list2 = this.LLLIL;
        if (list2 != null) {
            Iterator<OAuthScope> it3 = list2.iterator();
            while (it3.hasNext()) {
                hashSet.add(String.valueOf(it3.next().scopeName));
            }
        }
        List<OAuthScope> list3 = this.LLLILZ;
        if (list3 != null) {
            Iterator<OAuthScope> it4 = list3.iterator();
            while (it4.hasNext()) {
                String str = it4.next().scopeName;
                if (str != null) {
                    hashSet.add(str);
                }
            }
        }
        for (Pair pair : (ArrayList) this.LLLLLLLLLL) {
            Object first = pair.getFirst();
            if (!((CompoundButton) ((View) pair.getSecond()).findViewById(R.id.bbs)).isChecked()) {
                ((HashSet) this.LLLLLLLZIL).add(first);
            } else {
                ((HashSet) this.LLLLLLZ).add(first);
            }
        }
        String strLJJLIIIJ = null;
        for (String strLIZIZ : C13LP.LJLLLLLL(hashSet, C13LP.LLIIJI(this.LLLLLLLZIL))) {
            C2197371AzH.LIZ.getClass();
            if (strLJJLIIIJ != null && strLJJLIIIJ.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJJLIIIJ);
                sbLIZ.append(',');
                sbLIZ.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZIZ, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it5 = listLJJLIIIJILLIZJL.iterator();
            while (it5.hasNext()) {
                arrayList.add(a0.LJLIIIL((String) it5.next()).toString());
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LLIIJI(arrayList), ",", null, null, 0, null, null, 62);
        }
        this.LLLFFI = strLJJLIIIJ;
        c1b3s.LJII = strLJJLIIIJ;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [T, java.lang.Object] */
    public final SpannableStringBuilder NR(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        int i2 = 2;
        Object obj = null;
        int i3 = 0;
        for (MatchResult matchResult : Regex.findAll$default(new Regex("<a([^>]*)>(.*?)</a>", EnumC688760Qzy.DOT_MATCHES_ALL), str, 0, 2, null)) {
            int i4 = matchResult.LIZIZ().LL;
            int i5 = matchResult.LIZIZ().LLILLJJLI;
            if (i4 > i3) {
                spannableStringBuilder.append(str.substring(i3, i4));
            }
            if (matchResult.LIZ().size() >= 3) {
                final C259800zU c259800zU = new C259800zU();
                c259800zU.element = "";
                int i6 = 1;
                MatchResult matchResultFind$default = Regex.find$default(new Regex("href='([^']+)'"), (CharSequence) ListProtector.get(matchResult.LIZ(), 1), i, i2, obj);
                if (matchResultFind$default != null && matchResultFind$default.LIZ().size() > 1) {
                    c259800zU.element = ListProtector.get(matchResultFind$default.LIZ(), 1);
                }
                String str2 = (String) ListProtector.get(matchResult.LIZ(), i2);
                List listLJJII = C09RB.LJJII(Regex.findAll$default(new Regex("<b>(.*?)</b>", EnumC688760Qzy.DOT_MATCHES_ALL), str2, i, i2, obj));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (!listLJJII.isEmpty()) {
                    Iterator it2 = listLJJII.iterator();
                    int i7 = 0;
                    while (it2.hasNext()) {
                        int i8 = i7 + 1;
                        final String str3 = (String) ListProtector.get(((MatchResult) it2.next()).LIZ(), i6);
                        int length = spannableStringBuilder2.length();
                        spannableStringBuilder2.append((CharSequence) str3);
                        int length2 = spannableStringBuilder2.length();
                        C786410Ut5.q2(spannableStringBuilder2, new StyleSpan(i6), length, length2, 33);
                        C444890HcV c444890HcV = new C444890HcV();
                        c444890HcV.LIZ(73);
                        Typeface typeface = c444890HcV.getTypeface();
                        if (length >= 0) {
                            C786410Ut5.q2(spannableStringBuilder2, new ClickableSpan() { // from class: X.1B3K
                                @Override // android.text.style.ClickableSpan
                                public final void onClick(View view) {
                                    C19EG activity;
                                    String str4;
                                    try {
                                        I18nAuthorizeFragment i18nAuthorizeFragment = this.LL;
                                        if (i18nAuthorizeFragment.isAdded() && !i18nAuthorizeFragment.isDetached() && i18nAuthorizeFragment.getActivity() != null && (activity = i18nAuthorizeFragment.getActivity()) != null) {
                                            C259800zU<String> c259800zU2 = c259800zU;
                                            I18nAuthorizeFragment i18nAuthorizeFragment2 = this.LL;
                                            String str5 = str3;
                                            if (C123100dR.LIZ(c259800zU2.element)) {
                                                C2197371AzH c2197371AzH = C2197371AzH.LIZ;
                                                String str6 = c259800zU2.element;
                                                c2197371AzH.getClass();
                                                C2197371AzH.LJ(activity, str6);
                                                HashMap map = new HashMap();
                                                map.putAll(i18nAuthorizeFragment2.ZR().LIZ);
                                                map.put("pattern", i18nAuthorizeFragment2.LLLLIIL.getValue());
                                                if (Intrinsics.LJFF(str5, i18nAuthorizeFragment2.getString(2131826811))) {
                                                    str4 = "terms_of_service";
                                                } else if (Intrinsics.LJFF(str5, i18nAuthorizeFragment2.getString(2131826808))) {
                                                    str4 = "privacy_policy";
                                                } else if (Intrinsics.LJFF(str5, i18nAuthorizeFragment2.getString(2131822376))) {
                                                    str4 = "tiktok_privacy_policy";
                                                } else {
                                                    str4 = "";
                                                }
                                                if (str4.length() > 0) {
                                                    map.put(str4, 1);
                                                }
                                                map.put("toggled_scope", C13LP.LJJLIIIJ(i18nAuthorizeFragment2.LLLLLLZ, ",", null, null, 0, null, null, 62));
                                                map.put("untoggled_scope", C13LP.LJJLIIIJ(i18nAuthorizeFragment2.LLLLLLLZIL, ",", null, null, 0, null, null, 62));
                                                C1326305Gz.LIZ.getClass();
                                                C1326305Gz.LIZ("auth_page_button_click", map, null);
                                            }
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        C1233040iBy c1233040iBy = new C1233040iBy(this.LL.getActivity());
                                        c1233040iBy.LIZJ("Unknown error");
                                        c1233040iBy.LIZLLL();
                                    }
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(TextPaint textPaint) {
                                    int iLIZ;
                                    Context context = this.LL.getContext();
                                    if (context != null) {
                                        iLIZ = C960203pA.LIZ(R.attr.a1h, context);
                                    } else {
                                        iLIZ = 0;
                                    }
                                    textPaint.setColor(iLIZ);
                                    textPaint.setUnderlineText(false);
                                }
                            }, length, length2, 33);
                            C786410Ut5.q2(spannableStringBuilder2, new StyleSpan(typeface.getStyle()), length, length2, 33);
                        }
                        if (i7 < listLJJII.size() - 1) {
                            spannableStringBuilder2.append((CharSequence) " ");
                        }
                        i6 = 1;
                        i7 = i8;
                    }
                } else {
                    spannableStringBuilder2.append((CharSequence) str2);
                }
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                i3 = i5 + 1;
                i = 0;
                i2 = 2;
                obj = null;
            }
        }
        if (i3 < str.length()) {
            spannableStringBuilder.append(str.substring(i3));
        }
        return spannableStringBuilder;
    }

    public final void ZS(String str) {
        if (Intrinsics.LJFF(this.LLLIIII.callerPackage, "com.mobile.legends")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("action_type", str);
            C20684815ws.LJIILLIIL("mlbb_bind_page", c2344009Gk.LIZ);
        }
    }

    public final void gT(List<String> list) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        C1326305Gz c1326305Gz = C1326305Gz.LIZ;
        HashMap map = new HashMap();
        map.putAll(ZR().LIZ);
        map.put("pattern", this.LLLLIIL.getValue());
        map.put("learn_more_scope", 1);
        C19EG c19egLIZIZ2 = null;
        map.put("toggled_scope", C13LP.LJJLIIIJ(this.LLLLLLZ, ",", null, null, 0, null, null, 62));
        map.put("untoggled_scope", C13LP.LJJLIIIJ(this.LLLLLLLZIL, ",", null, null, 0, null, null, 62));
        c1326305Gz.getClass();
        C1326305Gz.LIZ("auth_page_button_click", map, null);
        String str = this.LLLLLJLJLL;
        String string = this.LLLLLL.toString();
        if (this.LLLJIL) {
            Context context = getContext();
            if (context != null) {
                c19egLIZIZ2 = C1388190mED.LIZIZ(context);
            }
            int iLJIIIIZZ = (int) (((double) C12ES.LJIIIIZZ(c19egLIZIZ2)) * 0.77d);
            AwemeAuthLearnMoreFragment awemeAuthLearnMoreFragment = new AwemeAuthLearnMoreFragment(new AwS578S0100000_34(this, 174));
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = awemeAuthLearnMoreFragment;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJL = iLJIIIIZZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLLL = true;
            tuxSheet.LLILLL = true;
            tuxSheet.LLJLLIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            this.LLLLLZ = tuxSheet;
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("auth_SDK_learn_more_header_key", str, bundle);
            C786410Ut5.LJJJI("auth_SDK_learn_more_title_key", string, bundle);
            C786410Ut5.LJJIZ(bundle, "auth_SDK_learn_more_items_key", (Serializable) list);
            awemeAuthLearnMoreFragment.setArguments(bundle);
            Context context2 = getContext();
            if (context2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(context2)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                tuxSheet.show(supportFragmentManager, "TTOP_AuthSDK_LearnMore");
                C1B3Q c1b3q = C1B3Q.LIZ;
                String str2 = this.LLLJ;
                String str3 = this.LLLIIII.LIZJ;
                boolean z = this.LLLILZJ;
                String strLIZ = C2198601B3a.LIZ(getArguments());
                String str4 = this.LLLIIIL;
                if (str4 == null) {
                    str4 = null;
                }
                String str5 = this.LLLL;
                String str6 = this.LLLJ;
                c1b3q.getClass();
                C2344009Gk c2344009GkLIZ = C1B3Q.LIZ(str2, str3, strLIZ, str4, str5, null, str6, z);
                c2344009GkLIZ.LJIIIIZZ("pattern", this.LLLLIIL.getValue());
                C20684815ws.LJIILLIIL("access_details_show", c2344009GkLIZ.LIZ);
                return;
            }
            return;
        }
        if (!(getParentFragment() instanceof BaseI18nAuthorizedFragment)) {
            return;
        }
        BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) getParentFragment();
        Bundle arguments = baseI18nAuthorizedFragment.getArguments();
        if (arguments != null) {
            C786410Ut5.LJJJI("auth_SDK_learn_more_header_key", str, arguments);
        }
        Bundle arguments2 = baseI18nAuthorizedFragment.getArguments();
        if (arguments2 != null) {
            C786410Ut5.LJJJI("auth_SDK_learn_more_title_key", string, arguments2);
        }
        Bundle arguments3 = baseI18nAuthorizedFragment.getArguments();
        if (arguments3 != null) {
            C786410Ut5.LJJIZ(arguments3, "auth_SDK_learn_more_items_key", (Serializable) list);
        }
        Bundle arguments4 = baseI18nAuthorizedFragment.getArguments();
        AwemeAuthLearnMoreFullSizeFragment awemeAuthLearnMoreFullSizeFragment = new AwemeAuthLearnMoreFullSizeFragment();
        awemeAuthLearnMoreFullSizeFragment.setArguments(arguments4);
        BaseI18nAuthorizedFragment.LLJLLL = awemeAuthLearnMoreFullSizeFragment;
        try {
            C19EH c19ehLJIIJ = baseI18nAuthorizedFragment.getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.drh, awemeAuthLearnMoreFullSizeFragment, null);
            c19ehLJIIJ.LJIIIZ();
            baseI18nAuthorizedFragment.wS();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1233040iBy c1233040iBy = new C1233040iBy(baseI18nAuthorizedFragment.getActivity());
            c1233040iBy.LIZJ("Unknown error");
            c1233040iBy.LIZLLL();
        }
        C1B3Q c1b3q2 = C1B3Q.LIZ;
        String str7 = this.LLLJ;
        String str8 = this.LLLIIII.LIZJ;
        boolean z2 = this.LLLILZJ;
        String strLIZ2 = C2198601B3a.LIZ(getArguments());
        String str9 = this.LLLIIIL;
        if (str9 == null) {
            str9 = null;
        }
        String str10 = this.LLLL;
        String str11 = this.LLLJ;
        c1b3q2.getClass();
        C2344009Gk c2344009GkLIZ2 = C1B3Q.LIZ(str7, str8, strLIZ2, str9, str10, null, str11, z2);
        c2344009GkLIZ2.LJIIIIZZ("pattern", this.LLLLIIL.getValue());
        C20684815ws.LJIILLIIL("access_details_show", c2344009GkLIZ2.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        Bundle bundle2 = bundleRequireArguments.getBundle("_bytedance_params_extra");
        C1B3S c1b3s = new C1B3S(bundleRequireArguments);
        this.LLLIIII = c1b3s;
        if (c1b3s.callerPackage == null) {
            c1b3s.callerPackage = requireActivity().getCallingPackage();
        }
        this.LLLI = new AwemeAuthorizePlatformDepend(this);
        getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.LLLI;
        C19H7 c19h7 = null;
        if (awemeAuthorizePlatformDepend == null) {
            awemeAuthorizePlatformDepend = null;
        }
        this.LLLII = new C19H7(awemeAuthorizePlatformDepend);
        Application application = requireActivity().getApplication();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.LLLI;
        if (awemeAuthorizePlatformDepend2 == null) {
            awemeAuthorizePlatformDepend2 = null;
        }
        C19H7 c19h72 = this.LLLII;
        if (c19h72 != null) {
            c19h7 = c19h72;
        }
        this.LLLFZ = (AuthCommonViewModel) ViewModelProviders.of(requireActivity(), new C19H6(application, awemeAuthorizePlatformDepend2, c19h7, this.LLLIIII, C1B3X.LIZ(bundleRequireArguments))).get(AuthCommonViewModel.class);
        this.LLLIIIIL = C2198601B3a.LIZ(bundleRequireArguments);
        String string = bundleRequireArguments.getString("_aweme_params_caller_open_sdk_version");
        String str = "";
        if (string == null) {
            string = "";
        }
        this.LLLIIIL = string;
        this.LLLIZZ = bundleRequireArguments.getBoolean("is_ttbc_auth");
        this.LLLIIL = (OAuthPage) bundleRequireArguments.getSerializable("auth_page_info");
        if (bundle2 != null) {
            bundle2.getInt("authType");
        }
        this.LLLILZJ = bundleRequireArguments.getBoolean("key_qrcode_auth", false);
        String string2 = bundleRequireArguments.getString("key_qrcode_token");
        if (string2 != null) {
            str = string2;
        }
        this.LLLILZLLLI = str;
        this.LLLJIL = Intrinsics.LJFF(bundleRequireArguments.getString("_bytedance_params_source"), "jsb");
        this.LLLLLLZZ = bundleRequireArguments.getString("_bytedance_params_initiate_url");
        bundleRequireArguments.getString("key_qrcode_redirect_uri");
        bundleRequireArguments.getString("_bytedance_params_redirect_uri");
        bundleRequireArguments.getString("_bytedance_params_code_challenge");
        this.LLLJL = bundleRequireArguments.getString("_bytedance_params_enter_source");
        this.LLLL = bundleRequireArguments.getString("_bytedance_params_enter_method");
        this.LLLLII = bundleRequireArguments.getString("_bytedance_params_enter_from");
        this.LLLLIIIILLL = bundleRequireArguments.getBoolean("_bytedance_params_auto_auth_disabled", false);
    }

    @Override // X.InterfaceC2198731B3n
    public final void u8(String str) {
        IProfileService iProfileService = (IProfileService) ServiceManager.get().getService(IProfileService.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("need_skip_restart", true);
        String str2 = this.LLLIIIIL;
        String str3 = null;
        if (str2 == null) {
            str2 = null;
        }
        C786410Ut5.LJJJI("sdk_name", str2, bundle);
        String str4 = this.LLLIIIL;
        if (str4 == null) {
            str4 = null;
        }
        C786410Ut5.LJJJI("sdk_version", str4, bundle);
        String str5 = this.LLLJL;
        if (str5 != null) {
            C786410Ut5.LJJJI("enter_source", str5, bundle);
        }
        String str6 = this.LLLJ;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = this.LLLLII;
        if (str7 == null) {
            str7 = "authorize_screen";
        }
        String str8 = this.LLLIIII.LIZJ;
        String str9 = this.LLLIIIIL;
        if (str9 == null) {
            str9 = null;
        }
        String str10 = this.LLLIIIL;
        if (str10 != null) {
            str3 = str10;
        }
        try {
            iProfileService.showInChooseAccountBottomSheet(requireActivity().getSupportFragmentManager(), new C1255390im1(str7, str, str8, str9, str3, this.LLLLIIL.getValue(), this.LLLJL, str6), "", bundle, new DialogInterface.OnDismissListener() { // from class: X.1B3g
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                }
            }, new DialogInterface.OnCancelListener() { // from class: X.1B3h
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                }
            });
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            C1233040iBy c1233040iBy = new C1233040iBy(getActivity());
            c1233040iBy.LIZJ("Unknown error");
            c1233040iBy.LIZLLL();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1233040iBy c1233040iBy2 = new C1233040iBy(getActivity());
            c1233040iBy2.LIZJ("Unknown error");
            c1233040iBy2.LIZLLL();
        }
        C2344009Gk c2344009GkZR = ZR();
        c2344009GkZR.LJIIIIZZ("pattern", this.LLLLIIL.getValue());
        C20684815ws.LJIILLIIL("auth_switch_account_pressed", c2344009GkZR.LIZ);
    }

    public final void YS(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        C786410Ut5.q2(spannableStringBuilder, new C2248981D0u(this, uRLSpan, 0), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
        spannableStringBuilder.removeSpan(uRLSpan);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        boolean z;
        boolean z2;
        super.onViewCreated(view, bundle);
        if (this.LLLLLZL) {
            TuxTextView tuxTextViewQS = QS();
            if (tuxTextViewQS != null) {
                C1428310nGv.LJI(0, tuxTextViewQS, false);
            }
            LinearLayout linearLayoutUR = UR();
            if (linearLayoutUR != null) {
                linearLayoutUR.setPadding(UR().getPaddingLeft(), UR().getPaddingTop(), UR().getPaddingRight(), 0);
            }
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("has_been_initialized", false)) {
            z = true;
        } else {
            z = false;
        }
        this.LLLLIILL = z;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z2 = arguments2.getBoolean("is_minis", false);
        } else {
            z2 = false;
        }
        OAuthPage oAuthPage = this.LLLIIL;
        if (oAuthPage == null) {
            oAuthPage = null;
        }
        XS(oAuthPage, z2);
        LinearLayout linearLayoutUS = uS();
        if (linearLayoutUS != null && linearLayoutUS.getVisibility() == 0 && (!this.LLLF.isEmpty())) {
            hT();
            Iterator<C21411818qq> it2 = this.LLLF.iterator();
            while (it2.hasNext()) {
                final int i = 0;
                C786410Ut5.C7(it2.next(), new CompoundButton.OnCheckedChangeListener(this, i) { // from class: X.1D0y
                    public final int $t;
                    public Object l0;

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                        switch (this.$t) {
                            case 0:
                                onCheckedChanged$0(this, compoundButton, z3);
                                break;
                            case 1:
                                onCheckedChanged$1(this, compoundButton, z3);
                                break;
                        }
                    }

                    {
                        this.$t = i;
                        this.l0 = this;
                    }

                    public static final void onCheckedChanged$0(C2249021D0y c2249021D0y, CompoundButton compoundButton, boolean z3) {
                        ((I18nAuthorizeFragment) c2249021D0y.l0).hT();
                    }

                    public static final void onCheckedChanged$1(C2249021D0y c2249021D0y, CompoundButton compoundButton, boolean z3) {
                        boolean z4;
                        List<C21411818qq> list = ((I18nAuthorizeFragment) c2249021D0y.l0).LLLLLLLLL;
                        boolean z5 = true;
                        if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
                            z4 = true;
                        } else {
                            Iterator it3 = ((ArrayList) list).iterator();
                            while (it3.hasNext()) {
                                if (!(!((CompoundButton) it3.next()).isChecked())) {
                                    z4 = false;
                                    break;
                                }
                            }
                            z4 = true;
                        }
                        List<C21411818qq> list2 = ((I18nAuthorizeFragment) c2249021D0y.l0).LLLLLLLLL;
                        if (!(list2 instanceof Collection) || !((ArrayList) list2).isEmpty()) {
                            Iterator it4 = ((ArrayList) list2).iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                } else if (!((CompoundButton) it4.next()).isChecked()) {
                                    z5 = false;
                                    break;
                                }
                            }
                        }
                        if (z4) {
                            I18nAuthorizeFragment i18nAuthorizeFragment = (I18nAuthorizeFragment) c2249021D0y.l0;
                            i18nAuthorizeFragment.hS().setEnabled(false);
                            i18nAuthorizeFragment.hS().setClickable(false);
                            i18nAuthorizeFragment.hS().setButtonVariant(0);
                        } else {
                            ((I18nAuthorizeFragment) c2249021D0y.l0).PR();
                        }
                        if (z5) {
                            ((I18nAuthorizeFragment) c2249021D0y.l0).US().setTextColorRes(R.attr.a1k);
                        } else {
                            ((I18nAuthorizeFragment) c2249021D0y.l0).US().setTextColorRes(R.attr.a1h);
                        }
                        ((I18nAuthorizeFragment) c2249021D0y.l0).GS();
                        Bundle arguments3 = ((I18nAuthorizeFragment) c2249021D0y.l0).getArguments();
                        if (arguments3 != null) {
                            C786410Ut5.LJJJI("toggledOnScopes", C13LP.LJJLIIIJ(((I18nAuthorizeFragment) c2249021D0y.l0).LLLLLLZ, ",", null, null, 0, null, null, 62), arguments3);
                        }
                        Bundle arguments4 = ((I18nAuthorizeFragment) c2249021D0y.l0).getArguments();
                        if (arguments4 != null) {
                            C786410Ut5.LJJJI("toggledOffScopes", C13LP.LJJLIIIJ(((I18nAuthorizeFragment) c2249021D0y.l0).LLLLLLLZIL, ",", null, null, 0, null, null, 62), arguments4);
                        }
                    }
                });
            }
        }
        C786410Ut5.U8(hS(), new ACListenerS168S0100000_34(this, 6));
        C786410Ut5.U8(gS(), new ACListenerS168S0100000_34(this, 7));
        ZS("show");
        C786410Ut5.LJZL(0, VR());
        C786410Ut5.R7(VR(), new ACListenerS168S0100000_34(this, 8));
        if (US() != null) {
            C786410Ut5.h9(US(), new ACListenerS168S0100000_34(this, 9));
        }
        Iterator it3 = ((ArrayList) this.LLLLLLLLL).iterator();
        while (it3.hasNext()) {
            final int i2 = 1;
            C786410Ut5.C7((C21411818qq) it3.next(), new CompoundButton.OnCheckedChangeListener(this, i2) { // from class: X.1D0y
                public final int $t;
                public Object l0;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                    switch (this.$t) {
                        case 0:
                            onCheckedChanged$0(this, compoundButton, z3);
                            break;
                        case 1:
                            onCheckedChanged$1(this, compoundButton, z3);
                            break;
                    }
                }

                {
                    this.$t = i2;
                    this.l0 = this;
                }

                public static final void onCheckedChanged$0(C2249021D0y c2249021D0y, CompoundButton compoundButton, boolean z3) {
                    ((I18nAuthorizeFragment) c2249021D0y.l0).hT();
                }

                public static final void onCheckedChanged$1(C2249021D0y c2249021D0y, CompoundButton compoundButton, boolean z3) {
                    boolean z4;
                    List<C21411818qq> list = ((I18nAuthorizeFragment) c2249021D0y.l0).LLLLLLLLL;
                    boolean z5 = true;
                    if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
                        z4 = true;
                    } else {
                        Iterator it32 = ((ArrayList) list).iterator();
                        while (it32.hasNext()) {
                            if (!(!((CompoundButton) it32.next()).isChecked())) {
                                z4 = false;
                                break;
                            }
                        }
                        z4 = true;
                    }
                    List<C21411818qq> list2 = ((I18nAuthorizeFragment) c2249021D0y.l0).LLLLLLLLL;
                    if (!(list2 instanceof Collection) || !((ArrayList) list2).isEmpty()) {
                        Iterator it4 = ((ArrayList) list2).iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            } else if (!((CompoundButton) it4.next()).isChecked()) {
                                z5 = false;
                                break;
                            }
                        }
                    }
                    if (z4) {
                        I18nAuthorizeFragment i18nAuthorizeFragment = (I18nAuthorizeFragment) c2249021D0y.l0;
                        i18nAuthorizeFragment.hS().setEnabled(false);
                        i18nAuthorizeFragment.hS().setClickable(false);
                        i18nAuthorizeFragment.hS().setButtonVariant(0);
                    } else {
                        ((I18nAuthorizeFragment) c2249021D0y.l0).PR();
                    }
                    if (z5) {
                        ((I18nAuthorizeFragment) c2249021D0y.l0).US().setTextColorRes(R.attr.a1k);
                    } else {
                        ((I18nAuthorizeFragment) c2249021D0y.l0).US().setTextColorRes(R.attr.a1h);
                    }
                    ((I18nAuthorizeFragment) c2249021D0y.l0).GS();
                    Bundle arguments3 = ((I18nAuthorizeFragment) c2249021D0y.l0).getArguments();
                    if (arguments3 != null) {
                        C786410Ut5.LJJJI("toggledOnScopes", C13LP.LJJLIIIJ(((I18nAuthorizeFragment) c2249021D0y.l0).LLLLLLZ, ",", null, null, 0, null, null, 62), arguments3);
                    }
                    Bundle arguments4 = ((I18nAuthorizeFragment) c2249021D0y.l0).getArguments();
                    if (arguments4 != null) {
                        C786410Ut5.LJJJI("toggledOffScopes", C13LP.LJJLIIIJ(((I18nAuthorizeFragment) c2249021D0y.l0).LLLLLLLZIL, ",", null, null, 0, null, null, 62), arguments4);
                    }
                }
            });
        }
        C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.1B36
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int iLIZIZ;
                OAuthScopeStruct scopeListStruct;
                List<OAuthScope> list;
                OAuthScopeStruct scopeListStruct2;
                List<OAuthScope> list2;
                List<OAuthPageText> textList;
                int size = 0;
                if (C2197221Az2.LIZ(this.LL.LLLIIII.LIZJ)) {
                    int measuredHeight = this.LL.RS().getMeasuredHeight();
                    int measuredHeight2 = this.LL.iS().getMeasuredHeight();
                    int measuredHeight3 = this.LL.hS().getMeasuredHeight();
                    OAuthPage oAuthPage2 = this.LL.LLLIIL;
                    if (oAuthPage2 == null) {
                        oAuthPage2 = null;
                    }
                    OAuthPageDetail oAuthPageDetail = oAuthPage2.pageDetail;
                    if (oAuthPageDetail == null || (textList = oAuthPageDetail.getTextList()) == null) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (OAuthPageText oAuthPageText : textList) {
                            if (Intrinsics.LJFF(oAuthPageText.textKey, "key_authorize_minigame_user_info_basic_footer")) {
                                arrayList.add(oAuthPageText);
                            }
                        }
                        iLIZIZ = this.LL.kS().getMeasuredHeight();
                    }
                    OAuthPage oAuthPage3 = this.LL.LLLIIL;
                    if (oAuthPage3 == null) {
                        oAuthPage3 = null;
                    }
                    OAuthPageDetail oAuthPageDetail2 = oAuthPage3.pageDetail;
                    int size2 = (oAuthPageDetail2 == null || (scopeListStruct2 = oAuthPageDetail2.getScopeListStruct()) == null || (list2 = scopeListStruct2.requestScopeList) == null) ? 0 : list2.size();
                    OAuthPage oAuthPage4 = this.LL.LLLIIL;
                    OAuthPageDetail oAuthPageDetail3 = (oAuthPage4 != null ? oAuthPage4 : null).pageDetail;
                    if (oAuthPageDetail3 != null && (scopeListStruct = oAuthPageDetail3.getScopeListStruct()) != null && (list = scopeListStruct.requestScopeListToggleOff) != null) {
                        size = list.size();
                    }
                    int iLIZIZ2 = measuredHeight + measuredHeight2 + iLIZIZ + measuredHeight3 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(size2 + size > 1 ? 60 : 35))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    View view2 = this.LL.LLLLLZIL;
                    if (view2 != null) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams.height != iLIZIZ2) {
                            layoutParams.height = iLIZIZ2;
                            C786410Ut5.W5(view2, layoutParams);
                        }
                    }
                } else if (view.findViewById(R.id.bbo).getHeight() > view.findViewById(R.id.q9r).getHeight()) {
                    View viewRS = this.LL.rS();
                    if (viewRS != null) {
                        C786410Ut5.LJLLLLLL(0, viewRS);
                    }
                } else {
                    View viewRS2 = this.LL.rS();
                    if (viewRS2 != null) {
                        C786410Ut5.LJLLLLLL(8, viewRS2);
                    }
                }
                C786410Ut5.C3(view.getViewTreeObserver(), this);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewSd;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (C2197221Az2.LIZ(this.LLLIIII.LIZJ)) {
            viewSd = C786410Ut5.Sd(R.layout.dmw, layoutInflater, null);
        } else {
            viewSd = C786410Ut5.Sd(R.layout.c4c, layoutInflater, null);
        }
        this.LLLLLZIL = viewSd;
        if (!(viewSd instanceof View)) {
            viewSd = null;
        }
        if (viewSd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewSd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewSd, this);
                viewSd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewSd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewSd;
    }
}
