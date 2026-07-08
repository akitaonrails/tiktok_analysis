package kotlin.jvm.internal;

import X.C09AY;
import X.C0OD6;
import X.C0P0X;
import X.C13LP;
import X.C1485060okS;
import X.C201955140j;
import X.C2188811AlT;
import X.C259800zU;
import X.C308560C7q;
import X.C633020OsG;
import X.C817250W4d;
import X.EnumC631120OpC;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.LogData;
import com.ss.android.ugc.aweme.music.model.MusicETBusinessModule;
import com.ss.android.ugc.aweme.music.model.TTToDspLogExtra;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicPlayViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursInviteBehavior;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS92S0210000_9 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS92S0210000_9 awS92S0210000_9) {
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        DspPlatform dspPlatform = (DspPlatform) awS92S0210000_9.l0;
        EnumC631120OpC enumC631120OpC = EnumC631120OpC.PROFILE_MUSIC_TAB;
        C0P0X c0p0x = C0P0X.SMALL;
        String str = "profile_music_tab_personal";
        if (!awS92S0210000_9.z2) {
            str = "profile_music_tab_others";
        }
        c633020OsG.LJI(true, new LogData(dspPlatform, enumC631120OpC, c0p0x, str, str, MusicETBusinessModule.MUSIC_TAB, null, ((MusicModel) awS92S0210000_9.l1).getMusic(), null, null, "", "", CardStruct.IStatusCode.DEFAULT, null, null, new TTToDspLogExtra(), "", null, null, false, 0, null));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS92S0210000_9 awS92S0210000_9) {
        String string;
        String string2;
        String string3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UserInvitee userInvitee : (List) awS92S0210000_9.l0) {
            arrayList.add(Integer.valueOf(C0OD6.LIZIZ(userInvitee.getFollowStatus(), userInvitee.getFollowerStatus())));
            arrayList2.add(userInvitee.getUid());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = awS92S0210000_9.z2;
        AddYoursInviteBehavior addYoursInviteBehavior = (AddYoursInviteBehavior) awS92S0210000_9.l1;
        List list = (List) awS92S0210000_9.l0;
        linkedHashMap.put("is_success", C308560C7q.LIZIZ(Boolean.valueOf(z)));
        Object obj = addYoursInviteBehavior.LIZ().get("enter_from");
        String string4 = null;
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        C817250W4d.LIZ("enter_from", string, linkedHashMap);
        Object obj2 = addYoursInviteBehavior.LIZ().get("enter_method");
        if (obj2 != null) {
            string2 = obj2.toString();
        } else {
            string2 = null;
        }
        C817250W4d.LIZ("enter_method", string2, linkedHashMap);
        Object obj3 = addYoursInviteBehavior.LIZ().get("topic_id");
        if (obj3 != null) {
            string3 = obj3.toString();
        } else {
            string3 = null;
        }
        C817250W4d.LIZ("add_yours_id", string3, linkedHashMap);
        C817250W4d.LIZ("invitee_cnt", String.valueOf(list.size()), linkedHashMap);
        Object obj4 = addYoursInviteBehavior.LIZ().get("extra_topic_title");
        if (obj4 != null) {
            string4 = obj4.toString();
        }
        C817250W4d.LIZ("add_yours_title", string4, linkedHashMap);
        linkedHashMap.put("follow_status", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        linkedHashMap.put("invitee_uid", C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
        return linkedHashMap;
    }

    public static final Object invoke$2(AwS92S0210000_9 awS92S0210000_9) {
        MusicPlayViewModel musicPlayViewModel = (MusicPlayViewModel) awS92S0210000_9.l0;
        C1485060okS c1485060okS = (C1485060okS) awS92S0210000_9.l1;
        boolean z = awS92S0210000_9.z2;
        int iIntValue = musicPlayViewModel.getState().LLILLL.LIZ.intValue() + 60;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playTime=");
        sbLIZ.append(iIntValue);
        C201955140j.LIZIZ("JDW", C2188811AlT.LIZIZ(sbLIZ));
        if (iIntValue >= c1485060okS.LIZLLL) {
            C201955140j.LIZIZ("JDW", "playCompleted");
            if (z) {
                musicPlayViewModel.xQ2(false);
                musicPlayViewModel.setState(AFwS240S0000000_9.get$arr$(887));
            } else {
                musicPlayViewModel.xQ2(true);
                musicPlayViewModel.setState(AFwS240S0000000_9.get$arr$(888));
            }
        } else {
            musicPlayViewModel.setState(new AwS24S0001000_9(iIntValue, 16));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS92S0210000_9 r23) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS92S0210000_9.invoke$3(kotlin.jvm.internal.AwS92S0210000_9):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S0210000_9(List list, C259800zU c259800zU, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.z2 = false;
        this.l1 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S0210000_9(DspPlatform dspPlatform, boolean z, MusicModel musicModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = dspPlatform;
        this.z2 = z;
        this.l1 = musicModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S0210000_9(MusicPlayViewModel musicPlayViewModel, C1485060okS c1485060okS, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = musicPlayViewModel;
        this.l1 = c1485060okS;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS92S0210000_9(List list, List<UserInvitee> list2, boolean z, AddYoursInviteBehavior addYoursInviteBehavior) {
        super(0);
        this.$t = addYoursInviteBehavior;
        this.l0 = list;
        this.z2 = list2;
        this.l1 = z;
    }
}
