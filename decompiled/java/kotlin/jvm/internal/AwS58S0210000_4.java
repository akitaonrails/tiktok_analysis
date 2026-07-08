package kotlin.jvm.internal;

import X.C09AY;
import X.C1308910kAL;
import X.C13LP;
import X.C197039127h;
import X.C330070Cwn;
import X.C339250DRr;
import X.C418440Gaw;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowItem;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowVM;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.SimpleUser;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursInviteFriendsViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS58S0210000_4 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS58S0210000_4 awS58S0210000_4, Object obj) {
        GradientDrawable.Orientation orientation;
        int iIntValue;
        C197039127h c197039127h = (C197039127h) obj;
        GradientDrawable gradientDrawable = new GradientDrawable();
        int[] iArr = (int[]) awS58S0210000_4.l0;
        boolean z = awS58S0210000_4.z2;
        Context context = (Context) awS58S0210000_4.l1;
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            Integer numLIZJ = C1308910kAL.LIZJ(i, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        gradientDrawable.setColors(C13LP.LLII(arrayList));
        if (z) {
            orientation = GradientDrawable.Orientation.BL_TR;
        } else {
            orientation = GradientDrawable.Orientation.TL_BR;
        }
        gradientDrawable.setOrientation(orientation);
        c197039127h.setBackground(gradientDrawable);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS58S0210000_4 awS58S0210000_4, Object obj) {
        Set<SimpleUser> set = ((C339250DRr) obj).LL.LIZ;
        if (awS58S0210000_4.z2) {
            set.add(((ManageFollowItem) awS58S0210000_4.l0).simpleUser);
        } else {
            set.remove(((ManageFollowItem) awS58S0210000_4.l0).simpleUser);
        }
        ((ManageFollowVM) awS58S0210000_4.l1).setState(new AwS583S0100000_4(set, (Set<SimpleUser>) 205));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS58S0210000_4 awS58S0210000_4, Object obj) {
        ArrayList arrayList = new ArrayList(((C330070Cwn) obj).LL);
        if (awS58S0210000_4.z2 && !arrayList.contains((UserInvitee) awS58S0210000_4.l0)) {
            arrayList.add((UserInvitee) awS58S0210000_4.l0);
        } else if (!awS58S0210000_4.z2) {
            arrayList.remove((UserInvitee) awS58S0210000_4.l0);
        }
        ((AddYoursInviteFriendsViewModel) awS58S0210000_4.l1).setState(new AwS583S0100000_4(arrayList, (List<GroupUnsubscribeSetting>) 207));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS58S0210000_4 awS58S0210000_4, Object obj) {
        GradientDrawable.Orientation orientation;
        int iIntValue;
        C197039127h c197039127h = (C197039127h) obj;
        GradientDrawable gradientDrawable = new GradientDrawable();
        int[] iArr = (int[]) awS58S0210000_4.l0;
        boolean z = awS58S0210000_4.z2;
        Context context = (Context) awS58S0210000_4.l1;
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            Integer numLIZJ = C1308910kAL.LIZJ(i, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        gradientDrawable.setColors(C13LP.LLII(arrayList));
        if (z) {
            orientation = GradientDrawable.Orientation.BL_TR;
        } else {
            orientation = GradientDrawable.Orientation.TL_BR;
        }
        gradientDrawable.setOrientation(orientation);
        c197039127h.setBackground(gradientDrawable);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS58S0210000_4(Context context, boolean z, int[] iArr, int i) {
        super(1);
        this.$t = i;
        this.l0 = iArr;
        this.z2 = z;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS58S0210000_4(boolean z, UserInvitee userInvitee, AddYoursInviteFriendsViewModel addYoursInviteFriendsViewModel, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = userInvitee;
        this.l1 = addYoursInviteFriendsViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS58S0210000_4(boolean z, ManageFollowItem manageFollowItem, ManageFollowVM manageFollowVM, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = manageFollowItem;
        this.l1 = manageFollowVM;
    }
}
