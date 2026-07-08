package kotlin.jvm.internal;

import X.C09AY;
import X.C1251850igJ;
import X.C1253040iiE;
import X.C1537480q70;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1623606Xi;
import X.C2399609ak;
import X.C627660Ojc;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1216690hlb;
import X.EnumC1217960hne;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.hybrid.spark.SparkContext;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.following.ui.viewholder.assem.RelationUserCellAssem;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public class AFwS341S0000000_19 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(9);
    public final int $t;

    public static AFwS341S0000000_19 get$arr$(int i) {
        AFwS341S0000000_19 aFwS341S0000000_19 = (AFwS341S0000000_19) arr$.get(i);
        if (aFwS341S0000000_19 != null) {
            return aFwS341S0000000_19;
        }
        arr$.compareAndSet(i, null, new AFwS341S0000000_19(i));
        return (AFwS341S0000000_19) arr$.get(i);
    }

    public static final Object invoke$4(AFwS341S0000000_19 aFwS341S0000000_19, Object obj, Object obj2, Object obj3) {
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // X.InterfaceC1631620sYq
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS341S0000000_19(int i) {
        super(3);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS341S0000000_19 aFwS341S0000000_19, Object obj, Object obj2, Object obj3) {
        ((Number) obj2).longValue();
        ((Number) obj3).intValue();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AFwS341S0000000_19 aFwS341S0000000_19, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        View viewFindViewById = ((UIAssem) obj).LJJIJL().findViewById(EnumC1216690hlb.DESTRUCTIVE.getId());
        int i = 0;
        if (!zBooleanValue && !zBooleanValue2) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AFwS341S0000000_19 aFwS341S0000000_19, Object obj, Object obj2, Object obj3) {
        List<ITEM> list;
        int i;
        UIAssem uIAssem = (UIAssem) obj;
        C627660Ojc c627660Ojc = (C627660Ojc) obj2;
        if ((c627660Ojc.LL instanceof C1623606Xi) && (list = c627660Ojc.LLILZ) != 0) {
            View viewLJJIJL = uIAssem.LJJIJL();
            if ((!list.isEmpty()) && obj3 == EnumC1217960hne.BATCH) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewLJJIJL);
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS341S0000000_19 aFwS341S0000000_19, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS341S0000000_19 aFwS341S0000000_19, Object obj, Object obj2, Object obj3) {
        RelationUserCellAssem relationUserCellAssem = (RelationUserCellAssem) obj;
        C736680Sv4.LJIJJ(relationUserCellAssem.R5(), new AwS103S0201000_19(relationUserCellAssem, (C1253040iiE) obj2, ((Number) obj3).intValue(), 1));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$6(AFwS341S0000000_19 aFwS341S0000000_19, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        return null;
    }

    public static final Object invoke$7(AFwS341S0000000_19 aFwS341S0000000_19, Object obj, Object obj2, Object obj3) {
        SparkContext sparkContext;
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            sparkContext = (SparkContext) c1537480q70;
        } else {
            sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        sparkContext.usePreload = true;
        c1537900q7g.getClass();
        return new C1541950qED(context, sparkContext).LIZ(false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object invoke$8(AFwS341S0000000_19 aFwS341S0000000_19, Object obj, Object obj2, Object obj3) {
        n nVar;
        n nVar2;
        n nVar3;
        int iIntValue;
        n nVar4;
        n nVar5;
        User user = (User) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        List<? extends ProfileComponents> list = ((ProfileComponents) obj).components;
        if (list != null) {
            for (ProfileComponents profileComponents : list) {
                C1251850igJ c1251850igJ = C1251850igJ.LIZ;
                n nVar6 = profileComponents.bizData;
                c1251850igJ.getClass();
                C1251850igJ.LIZJ = nVar6;
                String str = profileComponents.componentName;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1812764903:
                            if (str.equals("cta_social_entrance") && (nVar5 = profileComponents.bizData) != null) {
                                C1251850igJ.LIZ(nVar5, user);
                            }
                            break;
                        case -1403948337:
                            if (str.equals("cta_social_interaction") && !zBooleanValue && (nVar4 = profileComponents.bizData) != null) {
                                nVar4.LJJIJL("can_message_follow_status_list");
                                h hVar = new h();
                                List<Integer> canMessageFollowStatusList = user.getCanMessageFollowStatusList();
                                if (canMessageFollowStatusList != null) {
                                    Iterator<Integer> it2 = canMessageFollowStatusList.iterator();
                                    while (it2.hasNext()) {
                                        hVar.LJJII(it2.next());
                                    }
                                }
                                nVar4.LJJIFFI("can_message_follow_status_list", hVar);
                                h hVar2 = new h();
                                List<Integer> newMessageInInboxFollowStatusList = user.getNewMessageInInboxFollowStatusList();
                                if (newMessageInInboxFollowStatusList != null) {
                                    Iterator<Integer> it3 = newMessageInInboxFollowStatusList.iterator();
                                    while (it3.hasNext()) {
                                        hVar2.LJJII(it3.next());
                                    }
                                }
                                nVar4.LJJIFFI("new_message_in_inbox_follow_status_list", hVar2);
                                nVar4.LJJIJL("show_messaging_entrance_on_profile");
                                nVar4.LJJII(Boolean.valueOf(user.isShowMessageEntrance), "show_messaging_entrance_on_profile");
                            }
                            break;
                        case 405386819:
                            if (str.equals("cta_edit_profile") && (nVar3 = profileComponents.bizData) != null) {
                                Integer numLIZIZ = C2399609ak.LIZIZ(nVar3, "lemon8_profile_settings");
                                int iIntValue2 = 0;
                                if (numLIZIZ != null) {
                                    iIntValue = numLIZIZ.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                Integer numLIZIZ2 = C2399609ak.LIZIZ(nVar3, "lemon8_account_type");
                                if (numLIZIZ2 != null) {
                                    iIntValue2 = numLIZIZ2.intValue();
                                }
                                user.setLemon8ProfileSettings(iIntValue);
                                user.setLemon8AccountType(iIntValue2);
                            }
                            break;
                        case 825461572:
                            if (str.equals("cta_social_message") && !zBooleanValue && (nVar2 = profileComponents.bizData) != null) {
                                nVar2.LJJIJL("can_message_follow_status_list");
                                h hVar3 = new h();
                                List<Integer> canMessageFollowStatusList2 = user.getCanMessageFollowStatusList();
                                if (canMessageFollowStatusList2 != null) {
                                    Iterator<Integer> it4 = canMessageFollowStatusList2.iterator();
                                    while (it4.hasNext()) {
                                        hVar3.LJJII(it4.next());
                                    }
                                }
                                nVar2.LJJIFFI("can_message_follow_status_list", hVar3);
                                h hVar4 = new h();
                                List<Integer> newMessageInInboxFollowStatusList2 = user.getNewMessageInInboxFollowStatusList();
                                if (newMessageInInboxFollowStatusList2 != null) {
                                    Iterator<Integer> it5 = newMessageInInboxFollowStatusList2.iterator();
                                    while (it5.hasNext()) {
                                        hVar4.LJJII(it5.next());
                                    }
                                }
                                nVar2.LJJIFFI("new_message_in_inbox_follow_status_list", hVar4);
                                nVar2.LJJIJL("show_messaging_entrance_on_profile");
                                nVar2.LJJII(Boolean.valueOf(user.isShowMessageEntrance), "show_messaging_entrance_on_profile");
                            }
                            break;
                        case 2110357576:
                            if (str.equals("cta_add_friends") && (nVar = profileComponents.bizData) != null) {
                                nVar.LJJIJL("maf_count");
                                nVar.LJJIII(Integer.valueOf(user.mafRedCount), "maf_count");
                                nVar.LJJIJL("new_friend_count");
                                nVar.LJJIII(Integer.valueOf(user.newFriendsCount), "new_friend_count");
                            }
                            break;
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
