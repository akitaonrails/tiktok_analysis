package com.ss.android.ugc.aweme.nimblecard.tako.component.user;

import X.C01GW;
import X.C01U3;
import X.C0HHT;
import X.C0PEM;
import X.C0XQ7;
import X.C1308910kAL;
import X.C1387050mCN;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C1843500y4a;
import X.C19719912Dl;
import X.C19ME;
import X.C2217381BqS;
import X.C23250099c;
import X.C337180DJs;
import X.C341940Daq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C427690Gpr;
import X.C452501pT;
import X.C689130R1j;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC689370R2h;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.vm.NimbleVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBlockInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoFollowInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS446S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS659S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class NimbleUserAssem extends ReusedUISlotAssem<NimbleUserAssem> implements InterfaceC712990Rxx<InterfaceC689370R2h> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final int LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final C01GW LLJLIL;
    public int LLJLILLLLZIIL;
    public User LLJLL;
    public String LLJLLIL;
    public View LLJLLL;
    public C427660Gpo LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxTextView LLL;
    public TuxTextView LLLF;
    public RelationButton LLLFF;
    public boolean LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NimbleUserAssem.class, "userViewModel", "getUserViewModel()Lcom/ss/android/ugc/aweme/nimblecard/tako/vm/NimbleVM;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public NimbleUserAssem() {
        this((Object) null);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final INimbleUserDependAbility tp() {
        return (INimbleUserDependAbility) this.LLJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public NimbleUserAssem(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NimbleVM.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 193), null, AFwS241S0000000_10.get$arr$(135));
        this.LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 194));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById = view.findViewById(R.id.p9m);
        this.LLJLLL = viewFindViewById;
        if (viewFindViewById != null) {
            view = viewFindViewById;
        }
        INimbleUserDependAbility iNimbleUserDependAbilityTp = tp();
        if (iNimbleUserDependAbilityTp != null) {
            iNimbleUserDependAbilityTp.Py2();
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZ(R.attr.c3, view.getContext());
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(12.0f)));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        c384050F3z.LJ = C1308910kAL.LIZ(R.attr.a01, view.getContext());
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        this.LLJZ = (C427660Gpo) view.findViewById(R.id.l5i);
        this.LLJZIJLIL = (TuxTextView) view.findViewById(R.id.z4u);
        this.LLL = (TuxTextView) view.findViewById(R.id.z7n);
        this.LLLF = (TuxTextView) view.findViewById(R.id.z41);
        this.LLLFF = (RelationButton) view.findViewById(R.id.t4f);
        C427690Gpr.LJII(view);
        INimbleUserDependAbility iNimbleUserDependAbilityTp2 = tp();
        if (iNimbleUserDependAbilityTp2 != null) {
            new AwS659S0100000_10(this, 2);
            iNimbleUserDependAbilityTp2.eW0();
        }
        INimbleUserDependAbility iNimbleUserDependAbilityTp3 = tp();
        if (iNimbleUserDependAbilityTp3 != null) {
            new AwS589S0100000_10(this, 114);
            iNimbleUserDependAbilityTp3.Bo0();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void op(User user) {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Resources resources;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        TuxTextView tuxTextView = this.LLLF;
        if (tuxTextView == null) {
            return;
        }
        if (user != null && user.isBlock) {
            z = true;
        } else {
            z = false;
        }
        String quantityString = null;
        marginLayoutParams = null;
        ViewGroup.MarginLayoutParams marginLayoutParams3 = null;
        quantityString = null;
        if (z) {
            Context context = getContext();
            if (context != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.bv, context);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                tuxTextView.setBackground(c384050F3z.LIZ(context));
            }
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.topMargin = C341940Daq.LIZ(5.0d);
                marginLayoutParams3 = marginLayoutParams2;
            }
            C786410Ut5.R6(tuxTextView, marginLayoutParams3);
            tuxTextView.setPadding(C341940Daq.LIZ(4.0d), tuxTextView.getPaddingTop(), tuxTextView.getPaddingEnd(), tuxTextView.getPaddingBottom());
            tuxTextView.setTuxFont(61);
            tuxTextView.setTextColorRes(R.attr.ef);
            tuxTextView.setTuxFont(92);
            tuxTextView.setTextColorRes(R.attr.ud);
            tuxTextView.setText(2131847193);
            return;
        }
        tuxTextView.setBackground(null);
        ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
        if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.topMargin = C341940Daq.LIZ(2.0d);
        } else {
            marginLayoutParams = null;
        }
        C786410Ut5.R6(tuxTextView, marginLayoutParams);
        tuxTextView.setTextColorRes(R.attr.a1k);
        if (this.LLJJLIIIJLLLLLLLZ == R.layout.dsz) {
            tuxTextView.setTuxFont(71);
        } else {
            tuxTextView.setPadding(0, tuxTextView.getPaddingTop(), tuxTextView.getPaddingEnd(), tuxTextView.getPaddingBottom());
            tuxTextView.setTuxFont(61);
        }
        if (user == null) {
            return;
        }
        int followerCount = user.getFollowerCount();
        String strLIZIZ = C1843500y4a.LIZIZ(followerCount);
        Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null) {
            quantityString = resources.getQuantityString(2131755688, followerCount, strLIZIZ);
        }
        tuxTextView.setText(quantityString);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC689370R2h interfaceC689370R2h) {
        String uid;
        User userS10;
        InterfaceC689370R2h interfaceC689370R2h2 = interfaceC689370R2h;
        TakoUserItem user = interfaceC689370R2h2.getUser();
        if (user != null && user.userId > 0) {
            User user2 = new User();
            user2.setUid(String.valueOf(user.userId));
            user2.setNickname(user.nickname);
            user2.setUniqueId(user.username);
            user2.signature = user.description;
            user2.setCustomVerify(user.certInfo.customVerify);
            TakoFollowInfo takoFollowInfo = user.relationInfo.followInfo;
            user2.setFollowStatus(takoFollowInfo.followStatus);
            user2.setFollowerStatus(takoFollowInfo.followerStatus);
            user2.setFollowerCount(takoFollowInfo.followerCount);
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(user.avatar.urlList);
            user2.setAvatarThumb(urlModel);
            TakoBlockInfo takoBlockInfo = user.relationInfo.blockInfo;
            user2.isBlock = takoBlockInfo.isBlock;
            user2.setBlocked(takoBlockInfo.isBlocked);
            user2.setPrivateAccount(user.privateInfo.isPrivateAccount);
            String uid2 = user2.getUid();
            if (uid2 != null && uid2.length() != 0) {
                C337180DJs.LIZJ(LJJIJL());
                String uid3 = user2.getUid();
                User user3 = this.LLJLL;
                if (user3 != null) {
                    uid = user3.getUid();
                } else {
                    uid = null;
                }
                boolean z = !Intrinsics.LJFF(uid3, uid);
                boolean z2 = !Intrinsics.LJFF(interfaceC689370R2h2.LJ(), this.LLJLLIL);
                INimbleUserDependAbility iNimbleUserDependAbilityTp = tp();
                if (iNimbleUserDependAbilityTp == null || (userS10 = iNimbleUserDependAbilityTp.s10(user2.getUid())) == null) {
                    userS10 = user2;
                }
                sp(userS10, interfaceC689370R2h2.LJ());
                if (z || z2) {
                    int i = this.LLJLILLLLZIIL + 1;
                    this.LLJLILLLLZIIL = i;
                    NimbleVM nimbleVM = (NimbleVM) this.LLJL.getValue(this, LLLFZ[0]);
                    String uid4 = user2.getUid();
                    AwS446S0200000_10 awS446S0200000_10 = new AwS446S0200000_10(this, interfaceC689370R2h2, 19);
                    nimbleVM.getClass();
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(nimbleVM), C0PEM.LIZJ, null, new C01U3(uid4, nimbleVM, awS446S0200000_10, i, null), 2);
                    return;
                }
                return;
            }
            C337180DJs.LIZ(LJJIJL());
            return;
        }
        C337180DJs.LIZ(LJJIJL());
    }

    public final void up(User user) {
        boolean z;
        if (TextUtils.equals(user.getUid(), C0XQ7.LJFF().getCurUserId())) {
            C337180DJs.LIZ(this.LLLFF);
            return;
        }
        if (user.getFollowStatus() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RelationButton relationButton = this.LLLFF;
            if (relationButton != null) {
                C1387050mCN c1387050mCN = new C1387050mCN(user);
                c1387050mCN.LJIIJJI = this;
                ViewModelStoreOwner viewModelStoreOwnerLJI = C724240Sb0.LJI(this);
                if (!(viewModelStoreOwnerLJI instanceof ViewModelStoreOwner) || viewModelStoreOwnerLJI == null) {
                    viewModelStoreOwnerLJI = C724240Sb0.LIZ(this);
                    if (!(viewModelStoreOwnerLJI instanceof ViewModelStoreOwner)) {
                        viewModelStoreOwnerLJI = null;
                    }
                }
                c1387050mCN.LJIIL = viewModelStoreOwnerLJI;
                relationButton.LLLLZIL(c1387050mCN.LIZ());
            }
            C337180DJs.LIZJ(this.LLLFF);
        } else {
            C337180DJs.LIZ(this.LLLFF);
        }
        RelationButton relationButton2 = this.LLLFF;
        if (relationButton2 != null) {
            relationButton2.setFollowClickInterceptor(new C689130R1j(user, this, null));
        }
        RelationButton relationButton3 = this.LLLFF;
        if (relationButton3 != null) {
            relationButton3.setDataChangeListener(new AwS376S0200000_10(this, user, 28));
        }
        RelationButton relationButton4 = this.LLLFF;
        if (relationButton4 != null) {
            relationButton4.setTracker(new AwS411S0200000_10(this, user, 19));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC689370R2h interfaceC689370R2h) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC689370R2h interfaceC689370R2h) {
    }

    public /* synthetic */ NimbleUserAssem(Object obj) {
        this(R.layout.dsz);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(com.ss.android.ugc.aweme.profile.model.User r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nimblecard.tako.component.user.NimbleUserAssem.sp(com.ss.android.ugc.aweme.profile.model.User, java.lang.String):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
