package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0PEM;
import X.C10HO;
import X.C118300cf;
import X.C1243330iSZ;
import X.C1243410iSh;
import X.C1244050iTj;
import X.C1247000iYU;
import X.C1250090idT;
import X.C1250100idU;
import X.C1250110idV;
import X.C1250120idW;
import X.C1257420ipI;
import X.C1261250ivT;
import X.C1261270ivV;
import X.C1261860iwS;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1748440vbG;
import X.C19EG;
import X.C20012913Sd;
import X.C2187451AjH;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C300130Bpb;
import X.EnumC1261300ivY;
import X.InterfaceC1243310iSX;
import X.InterfaceC20013113Sf;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcAvatarViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS53S0500000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS53S0500000_19 awS53S0500000_19, Object obj) {
        C1261270ivV c1261270ivV = (C1261270ivV) obj;
        c1261270ivV.LIZ = (String) ((C259800zU) awS53S0500000_19.l0).element;
        c1261270ivV.LJII = (String) ((C259800zU) awS53S0500000_19.l1).element;
        c1261270ivV.LIZIZ = (String) ((C259800zU) awS53S0500000_19.l2).element;
        c1261270ivV.LIZLLL = (String) ((C259800zU) awS53S0500000_19.l3).element;
        c1261270ivV.LJIILL = ((C013C) awS53S0500000_19.l4).element;
        c1261270ivV.LJIILLIIL = "friends_list";
        c1261270ivV.LJIJ = "suggested_account";
        c1261270ivV.LJIJI = "friends_tab";
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS53S0500000_19 awS53S0500000_19, Object obj) {
        String str;
        C1250090idT c1250090idT = C1250090idT.LIZ;
        Context context = (Context) awS53S0500000_19.l0;
        C1250110idV c1250110idV = (C1250110idV) awS53S0500000_19.l1;
        int i = ((C1250120idW) awS53S0500000_19.l2).LIZ;
        c1250090idT.getClass();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "";
                    } else {
                        str = "lemon8";
                    }
                } else {
                    str = "twitter";
                }
            } else {
                str = "youtube";
            }
        } else {
            str = "instagram";
        }
        C1250090idT.LJ(context, c1250110idV, str);
        int i2 = ((C1250120idW) awS53S0500000_19.l2).LIZ;
        C10HO c10ho = (C10HO) awS53S0500000_19.l3;
        Context context2 = (Context) awS53S0500000_19.l0;
        if (c10ho != null && context2 != null) {
            if (C300130Bpb.LIZ()) {
                C1257420ipI.LIZIZ.startThirdSocialActivity(context2, c10ho, i2, true);
            } else {
                C1257420ipI.LIZIZ.startThirdSocialActivity(context2, c10ho, i2, false);
            }
        }
        C1250090idT.LJFF((User) awS53S0500000_19.l4, ((C1250120idW) awS53S0500000_19.l2).LIZ, (C1250110idV) awS53S0500000_19.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS53S0500000_19 awS53S0500000_19, Object obj) {
        int i = C2187451AjH.LIZ;
        C20012913Sd c20012913Sd = C20012913Sd.LIZ;
        final C19EG c19eg = (C19EG) awS53S0500000_19.l0;
        final ProfileAigcAvatarViewModel profileAigcAvatarViewModel = (ProfileAigcAvatarViewModel) awS53S0500000_19.l1;
        final C118300cf c118300cf = (C118300cf) awS53S0500000_19.l2;
        final C118300cf c118300cf2 = (C118300cf) awS53S0500000_19.l3;
        final List list = (List) awS53S0500000_19.l4;
        InterfaceC20013113Sf interfaceC20013113Sf = new InterfaceC20013113Sf() { // from class: X.0htA
            @Override // X.InterfaceC20013113Sf
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC20013113Sf
            public final void LIZJ(String str) {
                profileAigcAvatarViewModel.LLJI.LIZIZ(str, EnumC1997807s8.FILE_DOWNLOAD);
                profileAigcAvatarViewModel.LLJIJIL.LIZ();
            }

            @Override // X.InterfaceC20013113Sf
            public final void LIZ(Uri uri, String str) {
                String path;
                if (uri != null && (path = uri.getPath()) != null) {
                    ProfileAigcAvatarViewModel profileAigcAvatarViewModel2 = profileAigcAvatarViewModel;
                    C948503nH.LJI(profileAigcAvatarViewModel2, C0PEM.LIZJ, new C1221360ht8(profileAigcAvatarViewModel2, c19eg, path, str, c118300cf, c118300cf2, list, null));
                } else {
                    ProfileAigcAvatarViewModel profileAigcAvatarViewModel3 = profileAigcAvatarViewModel;
                    profileAigcAvatarViewModel3.LLJI.LIZIZ(str, EnumC1997807s8.FILE_DOWNLOAD);
                    profileAigcAvatarViewModel3.LLJIJIL.LIZ();
                }
            }
        };
        c20012913Sd.getClass();
        C20012913Sd.LIZIZ((String) obj, c19eg, interfaceC20013113Sf);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS53S0500000_19 awS53S0500000_19, Object obj) {
        String nickname;
        String str;
        String strLIZIZ;
        String string = a0.LJLIIIL(String.valueOf(((C1748440vbG) awS53S0500000_19.l0).getText())).toString();
        if (C1244050iTj.LIZ(string)) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ((Context) awS53S0500000_19.l1);
            if (c19egLIZIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJIIIZ(2131824790);
                c1389890mGx.LJIIJJI();
            }
        } else if ((string.length() != 0 || ((strLIZIZ = C1247000iYU.LIZIZ((User) awS53S0500000_19.l2)) != null && strLIZIZ.length() != 0)) && !Intrinsics.LJFF(string, C1247000iYU.LIZIZ((User) awS53S0500000_19.l2))) {
            User user = (User) awS53S0500000_19.l2;
            if (string.length() == 0) {
                nickname = user.getNickname();
            } else {
                nickname = string;
            }
            if (!((C1243410iSh) awS53S0500000_19.l3).LJ) {
                str = "add";
            } else {
                str = "edit";
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1243330iSZ((User) awS53S0500000_19.l2, string, (InterfaceC1243310iSX) awS53S0500000_19.l4, nickname, (C1243410iSh) awS53S0500000_19.l3, str, (Context) awS53S0500000_19.l1, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS53S0500000_19 awS53S0500000_19, Object obj) {
        String uid;
        int i;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String uid2 = null;
        IProfileService iProfileService = (IProfileService) PluggableExtentionKt.pluggableSpi$default(IProfileService.class, false, false, false, 14, null);
        if (iProfileService != null) {
            Context context = (Context) awS53S0500000_19.l0;
            Fragment fragment = (Fragment) awS53S0500000_19.l1;
            User user = (User) awS53S0500000_19.l2;
            String secUid = null;
            if (user != null) {
                uid2 = user.getUid();
            }
            User user2 = (User) awS53S0500000_19.l2;
            if (user2 != null) {
                secUid = user2.getSecUid();
            }
            if (zBooleanValue) {
                i = 4;
            } else {
                i = 0;
            }
            iProfileService.blockUser(context, fragment, uid2, secUid, 1, i);
        }
        FollowerViewModel followerViewModel = (FollowerViewModel) awS53S0500000_19.l3;
        User user3 = (User) awS53S0500000_19.l2;
        if (user3 == null || (uid = user3.getUid()) == null) {
            uid = "";
        }
        FollowerViewModel.AQ2(followerViewModel, "confirm", uid);
        ((FollowerViewModel) awS53S0500000_19.l3).wQ2((MusNotice) awS53S0500000_19.l4);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS53S0500000_19 awS53S0500000_19, Object obj) {
        Context context = (Context) awS53S0500000_19.l0;
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) awS53S0500000_19.l1;
        RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) awS53S0500000_19.l2;
        C1261860iwS c1261860iwS = (C1261860iwS) awS53S0500000_19.l4;
        C1261270ivV c1261270ivV = (C1261270ivV) awS53S0500000_19.l3;
        if (context != null && iUserCardListAbility != null && recUserCellTrackAbility != null) {
            C1261250ivT.LIZ.LJFF(context, c1261860iwS, recUserCellTrackAbility, c1261270ivV);
        }
        C1261270ivV c1261270ivV2 = (C1261270ivV) awS53S0500000_19.l3;
        if (c1261270ivV2 != null) {
            if (((C1261860iwS) awS53S0500000_19.l4).isAccuratePrivateAccount()) {
                C1261250ivT c1261250ivT = C1261250ivT.LIZ;
                EnumC1261300ivY enumC1261300ivY = EnumC1261300ivY.CANCEL_REQUEST;
                c1261250ivT.getClass();
                C1261250ivT.LIZJ(enumC1261300ivY, c1261270ivV2);
            } else {
                C1261250ivT c1261250ivT2 = C1261250ivT.LIZ;
                EnumC1261300ivY enumC1261300ivY2 = EnumC1261300ivY.UNFOLLOW;
                c1261250ivT2.getClass();
                C1261250ivT.LIZJ(enumC1261300ivY2, c1261270ivV2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS53S0500000_19 awS53S0500000_19, Object obj) {
        Context context = (Context) awS53S0500000_19.l0;
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) awS53S0500000_19.l1;
        RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) awS53S0500000_19.l2;
        C1261860iwS c1261860iwS = (C1261860iwS) awS53S0500000_19.l4;
        C1261270ivV c1261270ivV = (C1261270ivV) awS53S0500000_19.l3;
        if (context != null && iUserCardListAbility != null && recUserCellTrackAbility != null) {
            C1261250ivT.LIZ.LJFF(context, c1261860iwS, recUserCellTrackAbility, c1261270ivV);
        }
        C1261270ivV c1261270ivV2 = (C1261270ivV) awS53S0500000_19.l3;
        if (c1261270ivV2 != null) {
            if (((C1261860iwS) awS53S0500000_19.l4).isAccuratePrivateAccount()) {
                C1261250ivT c1261250ivT = C1261250ivT.LIZ;
                EnumC1261300ivY enumC1261300ivY = EnumC1261300ivY.CANCEL_REQUEST;
                c1261250ivT.getClass();
                C1261250ivT.LIZJ(enumC1261300ivY, c1261270ivV2);
            } else {
                C1261250ivT c1261250ivT2 = C1261250ivT.LIZ;
                EnumC1261300ivY enumC1261300ivY2 = EnumC1261300ivY.UNFOLLOW;
                c1261250ivT2.getClass();
                C1261250ivT.LIZJ(enumC1261300ivY2, c1261270ivV2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS53S0500000_19 awS53S0500000_19, Object obj) {
        Context context = (Context) awS53S0500000_19.l0;
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) awS53S0500000_19.l1;
        RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) awS53S0500000_19.l2;
        C1261860iwS c1261860iwS = (C1261860iwS) awS53S0500000_19.l4;
        C1261270ivV c1261270ivV = (C1261270ivV) awS53S0500000_19.l3;
        if (context != null && iUserCardListAbility != null && recUserCellTrackAbility != null) {
            C1261250ivT.LIZ.getClass();
            C1261250ivT.LIZ(context, c1261860iwS, c1261270ivV);
        }
        C1261270ivV c1261270ivV2 = (C1261270ivV) awS53S0500000_19.l3;
        if (c1261270ivV2 != null) {
            C1261250ivT c1261250ivT = C1261250ivT.LIZ;
            EnumC1261300ivY enumC1261300ivY = EnumC1261300ivY.MESSAGE;
            c1261250ivT.getClass();
            C1261250ivT.LIZJ(enumC1261300ivY, c1261270ivV2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0500000_19(C013C c013c, C259800zU c259800zU, C259800zU c259800zU2, C259800zU c259800zU3, C259800zU c259800zU4, int i) {
        super(1);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c259800zU3;
        this.l3 = c259800zU4;
        this.l4 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0500000_19(C1748440vbG c1748440vbG, Context context, User user, C1243410iSh c1243410iSh, InterfaceC1243310iSX interfaceC1243310iSX, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1748440vbG;
        this.l1 = context;
        this.l2 = user;
        this.l3 = c1243410iSh;
        this.l4 = interfaceC1243310iSX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0500000_19(C19EG c19eg, ProfileAigcAvatarViewModel profileAigcAvatarViewModel, List list, C118300cf c118300cf, C118300cf c118300cf2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = profileAigcAvatarViewModel;
        this.l2 = c118300cf;
        this.l3 = c118300cf2;
        this.l4 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0500000_19(Context context, C1250100idU c1250100idU, User user, C1250120idW c1250120idW, C1250110idV c1250110idV, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c1250110idV;
        this.l2 = c1250120idW;
        this.l3 = c1250100idU;
        this.l4 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0500000_19(Context context, C1261860iwS c1261860iwS, IUserCardListAbility iUserCardListAbility, RecUserCellTrackAbility recUserCellTrackAbility, C1261270ivV c1261270ivV, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = iUserCardListAbility;
        this.l2 = recUserCellTrackAbility;
        this.l3 = c1261270ivV;
        this.l4 = c1261860iwS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0500000_19(Context context, Fragment fragment, User user, FollowerViewModel followerViewModel, MusNotice musNotice, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = fragment;
        this.l2 = user;
        this.l3 = followerViewModel;
        this.l4 = musNotice;
    }
}
