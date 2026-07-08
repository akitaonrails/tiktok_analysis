package kotlin.jvm.internal;

import X.C09AY;
import X.C1389340mG4;
import X.C1390920mIc;
import X.C14NX;
import X.C19252910Tv;
import X.C19EG;
import X.C19EH;
import X.C259800zU;
import X.C343910De1;
import X.C343930De3;
import X.C418440Gaw;
import X.C730000SkI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC330080Cwo;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minidrama.common.component.limitedfree.BlockingLimitedFreeFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursInviteFriendsFragment;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.PadAdaptionFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS248S0300000_4 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS248S0300000_4 awS248S0300000_4) {
        C343910De1 c343910De1 = AddYoursInviteFriendsFragment.LLJJJIL;
        FragmentManager supportFragmentManager = ((C19EG) awS248S0300000_4.l0).getSupportFragmentManager();
        InterfaceC330080Cwo interfaceC330080Cwo = (InterfaceC330080Cwo) awS248S0300000_4.l1;
        C343930De3 c343930De3 = (C343930De3) awS248S0300000_4.l2;
        c343910De1.getClass();
        C730000SkI.LIZIZ.LIZIZ(249372162);
        AddYoursInviteFriendsFragment addYoursInviteFriendsFragment = new AddYoursInviteFriendsFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "invite_config", c343930De3);
        addYoursInviteFriendsFragment.setArguments(bundle);
        addYoursInviteFriendsFragment.LLJILLL = interfaceC330080Cwo;
        AddYoursInviteFriendsFragment.LLJJJJJIL = c343930De3.onSelected;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 0) {
            int iLIZLLL = C1389340mG4.LIZLLL();
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = addYoursInviteFriendsFragment;
            tuxSheet.LLJLL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            double d = iLIZLLL;
            c1390920mIc.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.74d * d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(d * 0.9d))));
            c1390920mIc.LJIIIIZZ(2);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJIJIIJIL = false;
            tuxSheet2.show(supportFragmentManager, "AYInviteFriends");
        } else {
            Integer numValueOf = Integer.valueOf(R.style.xm);
            PadAdaptionFragment padAdaptionFragment = new PadAdaptionFragment();
            padAdaptionFragment.LLILZ = addYoursInviteFriendsFragment;
            padAdaptionFragment.LLILZIL = numValueOf;
            try {
                Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
                declaredField.setAccessible(true);
                declaredField.set(padAdaptionFragment, Boolean.FALSE);
                Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
                declaredField2.setAccessible(true);
                declaredField2.set(padAdaptionFragment, Boolean.TRUE);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            if (padAdaptionFragment.isAdded()) {
                if (c19ehLJIIJ != null) {
                    c19ehLJIIJ.LJJIFFI(padAdaptionFragment);
                    c19ehLJIIJ.LJIIJ();
                }
            } else if (c19ehLJIIJ != null) {
                c19ehLJIIJ.LIZLLL(padAdaptionFragment, "PadAdaption");
                c19ehLJIIJ.LJIIJ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS248S0300000_4 awS248S0300000_4) {
        Object obj;
        Map map;
        Object objLJIIZILJ;
        String str;
        Map map2 = (Map) awS248S0300000_4.l0;
        if (map2 != null) {
            obj = map2.get("log_extra");
        } else {
            obj = null;
        }
        if (!(obj instanceof Map) || (map = (Map) obj) == null) {
            return null;
        }
        Map map3 = (Map) awS248S0300000_4.l1;
        C14NX c14nx = (C14NX) awS248S0300000_4.l2;
        for (Map.Entry entry : map.entrySet()) {
            String strValueOf = String.valueOf(entry.getKey());
            Object value = entry.getValue();
            if ((value instanceof String) && (str = (String) value) != null) {
                objLJIIZILJ = c14nx.LJIIZILJ(str);
            } else {
                objLJIIZILJ = null;
            }
            map3.put(strValueOf, String.valueOf(objLJIIZILJ));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AwS248S0300000_4 awS248S0300000_4) {
        Fragment fragment = (Fragment) ((C259800zU) awS248S0300000_4.l0).element;
        if (fragment != null) {
            C19EH c19ehLJIIJ = ((FragmentManager) awS248S0300000_4.l2).LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragment);
            c19ehLJIIJ.LJIIJ();
        }
        Function0 function0 = (Function0) awS248S0300000_4.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS248S0300000_4 awS248S0300000_4) {
        Object obj;
        Map map;
        Object objLJIIZILJ;
        String str;
        Map map2 = (Map) awS248S0300000_4.l0;
        if (map2 != null) {
            obj = map2.get("log_extra");
        } else {
            obj = null;
        }
        if (!(obj instanceof Map) || (map = (Map) obj) == null) {
            return null;
        }
        Map map3 = (Map) awS248S0300000_4.l1;
        C14NX c14nx = (C14NX) awS248S0300000_4.l2;
        for (Map.Entry entry : map.entrySet()) {
            String strValueOf = String.valueOf(entry.getKey());
            Object value = entry.getValue();
            if ((value instanceof String) && (str = (String) value) != null) {
                objLJIIZILJ = c14nx.LJIIZILJ(str);
            } else {
                objLJIIZILJ = null;
            }
            map3.put(strValueOf, String.valueOf(objLJIIZILJ));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS248S0300000_4 awS248S0300000_4) {
        Object obj;
        Map map;
        Object objLJIIZILJ;
        String str;
        Map map2 = (Map) awS248S0300000_4.l0;
        if (map2 != null) {
            obj = map2.get("media_params");
        } else {
            obj = null;
        }
        if (!(obj instanceof Map) || (map = (Map) obj) == null) {
            return null;
        }
        Map map3 = (Map) awS248S0300000_4.l1;
        C14NX c14nx = (C14NX) awS248S0300000_4.l2;
        for (Map.Entry entry : map.entrySet()) {
            String strValueOf = String.valueOf(entry.getKey());
            Object value = entry.getValue();
            if ((value instanceof String) && (str = (String) value) != null) {
                objLJIIZILJ = c14nx.LJIIZILJ(str);
            } else {
                objLJIIZILJ = null;
            }
            map3.put(strValueOf, String.valueOf(objLJIIZILJ));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS248S0300000_4 awS248S0300000_4) {
        Map map;
        Object objLJIIZILJ;
        String str;
        Object obj = ((Map) awS248S0300000_4.l0).get("log_extra");
        if (!(obj instanceof Map) || (map = (Map) obj) == null) {
            return null;
        }
        Map map2 = (Map) awS248S0300000_4.l1;
        C14NX c14nx = (C14NX) awS248S0300000_4.l2;
        for (Map.Entry entry : map.entrySet()) {
            String strValueOf = String.valueOf(entry.getKey());
            Object value = entry.getValue();
            if ((value instanceof String) && (str = (String) value) != null) {
                objLJIIZILJ = c14nx.LJIIZILJ(str);
            } else {
                objLJIIZILJ = null;
            }
            map2.put(strValueOf, String.valueOf(objLJIIZILJ));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS248S0300000_4 awS248S0300000_4) {
        ((CollabFeedInvitedPendingCell) awS248S0300000_4.l0).L5((Aweme) awS248S0300000_4.l1, "decline", "cancel", true);
        ((Function0) awS248S0300000_4.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS248S0300000_4 awS248S0300000_4) {
        ((CollabFeedInvitedCell) awS248S0300000_4.l0).R5((Aweme) awS248S0300000_4.l1, "exit", "cancel", true);
        ((Function0) awS248S0300000_4.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS248S0300000_4 awS248S0300000_4) {
        ((CollabFeedInvitedPendingCell) awS248S0300000_4.l0).L5((Aweme) awS248S0300000_4.l1, "authorize", "cancel", true);
        ((Function0) awS248S0300000_4.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS248S0300000_4 awS248S0300000_4) {
        Object objLJIIZILJ;
        List list;
        Map map;
        String str;
        Object obj = ((Map) awS248S0300000_4.l0).get("awemes");
        if ((obj instanceof String) && (str = (String) obj) != null) {
            objLJIIZILJ = ((C14NX) awS248S0300000_4.l1).LJIIZILJ(str);
        } else {
            objLJIIZILJ = null;
        }
        if (!(objLJIIZILJ instanceof List) || (list = (List) objLJIIZILJ) == null) {
            return null;
        }
        List list2 = (List) awS248S0300000_4.l2;
        for (Object obj2 : list) {
            if ((obj2 instanceof Map) && (map = (Map) obj2) != null) {
                Object obj3 = map.get("aweme_data");
                if ((obj3 instanceof Aweme) && obj3 != null) {
                    list2.add(obj3);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS248S0300000_4 awS248S0300000_4) {
        Map map;
        Object objLJIIZILJ;
        String str;
        Object obj = ((Map) awS248S0300000_4.l0).get("log_extra");
        if (!(obj instanceof Map) || (map = (Map) obj) == null) {
            return null;
        }
        Map map2 = (Map) awS248S0300000_4.l1;
        C14NX c14nx = (C14NX) awS248S0300000_4.l2;
        for (Map.Entry entry : map.entrySet()) {
            String strValueOf = String.valueOf(entry.getKey());
            Object value = entry.getValue();
            if ((value instanceof String) && (str = (String) value) != null) {
                objLJIIZILJ = c14nx.LJIIZILJ(str);
            } else {
                objLJIIZILJ = null;
            }
            map2.put(strValueOf, String.valueOf(objLJIIZILJ));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS248S0300000_4(C259800zU c259800zU, C259800zU<BlockingLimitedFreeFragment> c259800zU2, Function0<Unit> function0, FragmentManager fragmentManager) {
        super(0);
        this.$t = fragmentManager;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS248S0300000_4(C19EG c19eg, InterfaceC330080Cwo interfaceC330080Cwo, C343930De3 c343930De3, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = interfaceC330080Cwo;
        this.l2 = c343930De3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS248S0300000_4(CollabFeedInvitedCell collabFeedInvitedCell, CollabFeedInvitedCell collabFeedInvitedCell2, Aweme aweme, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = collabFeedInvitedCell;
        this.l1 = collabFeedInvitedCell2;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS248S0300000_4(CollabFeedInvitedPendingCell collabFeedInvitedPendingCell, CollabFeedInvitedPendingCell collabFeedInvitedPendingCell2, Aweme aweme, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = collabFeedInvitedPendingCell;
        this.l1 = collabFeedInvitedPendingCell2;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS248S0300000_4(Map map, Map<String, ? extends Object> map2, C14NX c14nx, List<Aweme> list) {
        super(0);
        this.$t = list;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = c14nx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS248S0300000_4(Map map, Map<String, ? extends Object> map2, Map<String, String> map3, C14NX c14nx) {
        super(0);
        this.$t = c14nx;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = map3;
    }
}
