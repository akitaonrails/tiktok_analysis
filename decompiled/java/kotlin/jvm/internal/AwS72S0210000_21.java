package kotlin.jvm.internal;

import X.AbstractC1347290lAF;
import X.C06V1;
import X.C098200Yq;
import X.C09AY;
import X.C0I0B;
import X.C0WZX;
import X.C1223430hwT;
import X.C1344460l5g;
import X.C1345260l6y;
import X.C1345760l7m;
import X.C1346480l8w;
import X.C1346520l90;
import X.C1346550l93;
import X.C1346950l9h;
import X.C1347090l9v;
import X.C1347100l9w;
import X.C1347110l9x;
import X.C1347120l9y;
import X.C1353500lKG;
import X.C1353820lKm;
import X.C1361720lXW;
import X.C1362120lYA;
import X.C1362170lYF;
import X.C1362190lYH;
import X.C1362370lYZ;
import X.C1365110lcz;
import X.C1365330ldL;
import X.C1370970lmR;
import X.C13LP;
import X.C15438062q;
import X.C1623606Xi;
import X.C189200o6;
import X.C2204961BRm;
import X.C2450909j1;
import X.C291001Au;
import X.C627260Oiy;
import X.C627660Ojc;
import X.C631370Opb;
import X.C786410Ut5;
import X.InterfaceC1346530l91;
import X.InterfaceC1353860lKq;
import X.InterfaceC1361290lWp;
import X.InterfaceC1361730lXX;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import android.text.Editable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardEditAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.experiment.CommentSampleRateSetting;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3InputFloatAssem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.ShareTextBoxViewModel;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM;
import com.ss.android.ugc.now.interaction.assem.LikeItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS72S0210000_21 extends C09AY implements Function1 {
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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS72S0210000_21 awS72S0210000_21, Object obj) {
        ((KeyboardVMV2) awS72S0210000_21.l0).setState(new AwS107S0110000_21((Comment) awS72S0210000_21.l1, awS72S0210000_21.z2, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS72S0210000_21 awS72S0210000_21, Object obj) throws Exception {
        Object c098200Yq;
        String str;
        IKeyboardEditAbility iKeyboardEditAbilityLIZIZ;
        C1353500lKG c1353500lKGZy1;
        CommentKeyboardModel keyboardModel;
        Fragment fragment;
        CommentCommonModel commonModel;
        Fragment fragment2;
        C1346950l9h c1346950l9h = (C1346950l9h) obj;
        AbstractC1347290lAF abstractC1347290lAF = (AbstractC1347290lAF) awS72S0210000_21.l0;
        C1347120l9y c1347120l9y = C1347120l9y.LIZ;
        if (!Intrinsics.LJFF(abstractC1347290lAF, c1347120l9y)) {
            KeyboardVMV2 keyboardVMV2 = (KeyboardVMV2) awS72S0210000_21.l1;
            keyboardVMV2.getClass();
            keyboardVMV2.withState(new AwS600S0100000_21(keyboardVMV2, 421));
            CommentContextSource commentContextSourceBQ2 = ((KeyboardVMV2) awS72S0210000_21.l1).BQ2();
            if (commentContextSourceBQ2 != null && (commonModel = commentContextSourceBQ2.getCommonModel()) != null && commonModel.choosePhotoFromInnerPage) {
                KeyboardVMV2 keyboardVMV22 = (KeyboardVMV2) awS72S0210000_21.l1;
                InterfaceC665370Q7z interfaceC665370Q7z = keyboardVMV22.LL;
                if (interfaceC665370Q7z != null) {
                    WeakReference<Fragment> weakReference = keyboardVMV22.LLILLJJLI;
                    if (weakReference != null) {
                        fragment2 = weakReference.get();
                    } else {
                        fragment2 = null;
                    }
                    ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(fragment2, interfaceC665370Q7z);
                    if (iCommentListAssemAbilityLIZLLL != null) {
                        iCommentListAssemAbilityLIZLLL.qA1(false, true);
                    }
                }
            } else {
                KeyboardVMV2 keyboardVMV23 = (KeyboardVMV2) awS72S0210000_21.l1;
                InterfaceC665370Q7z interfaceC665370Q7z2 = keyboardVMV23.LL;
                if (interfaceC665370Q7z2 != null) {
                    WeakReference<Fragment> weakReference2 = keyboardVMV23.LLILLJJLI;
                    if (weakReference2 != null) {
                        fragment = weakReference2.get();
                    } else {
                        fragment = null;
                    }
                    ICommentListAssemAbility iCommentListAssemAbilityLIZLLL2 = C1345760l7m.LIZLLL(fragment, interfaceC665370Q7z2);
                    if (iCommentListAssemAbilityLIZLLL2 != null) {
                        iCommentListAssemAbilityLIZLLL2.qA1(true, true);
                    }
                }
            }
        }
        KeyboardVMV2 keyboardVMV24 = (KeyboardVMV2) awS72S0210000_21.l1;
        AbstractC1347290lAF abstractC1347290lAF2 = (AbstractC1347290lAF) awS72S0210000_21.l0;
        boolean z = awS72S0210000_21.z2;
        try {
            keyboardVMV24.YQ2(c1346950l9h, abstractC1347290lAF2, c1346950l9h.LL);
            keyboardVMV24.setState(new AwS387S0200000_21(keyboardVMV24, c1346950l9h, 108));
            if (PersonalizedEmojiExperiment.LIZIZ() && Intrinsics.LJFF(c1346950l9h.LL, c1347120l9y)) {
                keyboardVMV24.setState(AFwS259S0000000_21.get$arr$(450));
            }
            if (C1345260l6y.LIZ(c1346950l9h.LL) && !C1345260l6y.LIZ(abstractC1347290lAF2)) {
                keyboardVMV24.KQ2();
                keyboardVMV24.withState(new AwS600S0100000_21(keyboardVMV24, 414));
                Iterator<InterfaceC1346530l91> it2 = keyboardVMV24.LLILZIL.iterator();
                while (it2.hasNext()) {
                    it2.next().onDismiss();
                }
            } else if (!C1345260l6y.LIZ(c1346950l9h.LL) && C1345260l6y.LIZ(abstractC1347290lAF2)) {
                keyboardVMV24.LQ2();
                keyboardVMV24.withState(new AwS600S0100000_21(keyboardVMV24, 414));
                if (!Intrinsics.LJFF(abstractC1347290lAF2, C1347110l9x.LIZ)) {
                    if (Intrinsics.LJFF(abstractC1347290lAF2, C1347090l9v.LIZ)) {
                        str = "emoji";
                    } else if (!Intrinsics.LJFF(abstractC1347290lAF2, C1347100l9w.LIZ)) {
                        str = "";
                    } else {
                        str = "gift";
                    }
                } else {
                    str = "input";
                }
                C1344460l5g.LIZ.getClass();
                if (CommentSampleRateSetting.LIZ(0.15f, "input_panel_load_time")) {
                    C1346520l90 c1346520l90 = C1344460l5g.LIZJ;
                    c1346520l90.LJ = str;
                    c1346520l90.LJFF = "";
                    c1346520l90.LIZIZ = System.currentTimeMillis();
                }
                Iterator<InterfaceC1346530l91> it3 = keyboardVMV24.LLILZIL.iterator();
                while (it3.hasNext()) {
                    it3.next().onShow();
                }
            }
            AbstractC1347290lAF abstractC1347290lAF3 = c1346950l9h.LL;
            C1347100l9w c1347100l9w = C1347100l9w.LIZ;
            if ((Intrinsics.LJFF(abstractC1347290lAF3, c1347100l9w) && Intrinsics.LJFF(abstractC1347290lAF2, C1347120l9y.LIZ)) || (Intrinsics.LJFF(abstractC1347290lAF2, c1347100l9w) && Intrinsics.LJFF(c1346950l9h.LL, C1347120l9y.LIZ))) {
                keyboardVMV24.setState(AFwS259S0000000_21.get$arr$(452));
            }
            keyboardVMV24.cR2(c1346950l9h, abstractC1347290lAF2);
            keyboardVMV24.bR2(c1346950l9h, abstractC1347290lAF2);
            keyboardVMV24.aR2(c1346950l9h, abstractC1347290lAF2);
            if (!z) {
                keyboardVMV24.setState(new AwS600S0100000_21(abstractC1347290lAF2, 68));
            } else {
                keyboardVMV24.setState(new AwS600S0100000_21(abstractC1347290lAF2, 67));
            }
            if (Intrinsics.LJFF(abstractC1347290lAF2, C1347120l9y.LIZ)) {
                keyboardVMV24.ZQ2(c1346950l9h);
                CommentContextSource commentContextSourceBQ22 = keyboardVMV24.BQ2();
                if (commentContextSourceBQ22 != null && (keyboardModel = commentContextSourceBQ22.getKeyboardModel()) != null) {
                    keyboardModel.setPostMethod(null);
                }
            }
            C1346480l8w c1346480l8w = c1346950l9h.LLILZIL;
            InterfaceC665370Q7z interfaceC665370Q7z3 = keyboardVMV24.LL;
            if (interfaceC665370Q7z3 != null && (iKeyboardEditAbilityLIZIZ = C1346550l93.LIZIZ(interfaceC665370Q7z3)) != null && (c1353500lKGZy1 = iKeyboardEditAbilityLIZIZ.Zy1()) != null && !TextUtils.isEmpty(C2204961BRm.LLLZZIL(c1353500lKGZy1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B3g+N9DL+NozB/45Y=", null)))) {
                keyboardVMV24.setState(new AwS600S0100000_21(c1346480l8w, 419));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return Unit.LIZ;
        }
        throw new Exception(thM5exceptionOrNullimpl);
    }

    public static final Object invoke$2(AwS72S0210000_21 awS72S0210000_21, Object obj) {
        C1223430hwT c1223430hwT = (C1223430hwT) obj;
        if (!awS72S0210000_21.z2 && (((C627660Ojc) awS72S0210000_21.l0).LL instanceof C1623606Xi) && c1223430hwT.LL != null) {
            C2450909j1.LIZJ(new AwS565S0100000_21((FriendsV3InputFloatAssem) awS72S0210000_21.l1, 593));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS72S0210000_21 awS72S0210000_21, Object obj) {
        boolean z;
        String uid;
        C1361720lXW c1361720lXW;
        C1362120lYA c1362120lYA;
        SharePackage sharePackage;
        C1362190lYH c1362190lYH = (C1362190lYH) obj;
        boolean zGr0 = ((ShareContactListViewModel) awS72S0210000_21.l0).gr0(c1362190lYH);
        Set setLLIIIZ = C13LP.LLIIIZ(c1362190lYH.LLILLL);
        if (awS72S0210000_21.z2) {
            setLLIIIZ.add((IMContact) awS72S0210000_21.l1);
        } else {
            setLLIIIZ.remove((IMContact) awS72S0210000_21.l1);
        }
        ArrayList arrayList = null;
        C1362190lYH c1362190lYHLIZ = C1362190lYH.LIZ(c1362190lYH, null, null, setLLIIIZ, false, false, null, null, false, null, 1019);
        if (zGr0 != ((ShareContactListViewModel) awS72S0210000_21.l0).gr0(c1362190lYHLIZ)) {
            z = true;
        } else {
            z = false;
        }
        ShareContactListViewModel shareContactListViewModel = (ShareContactListViewModel) awS72S0210000_21.l0;
        IMContact iMContact = (IMContact) awS72S0210000_21.l1;
        shareContactListViewModel.getClass();
        List<InterfaceC1361730lXX> list = c1362190lYHLIZ.LL;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (InterfaceC1361730lXX interfaceC1361730lXXLIZ : list) {
                if ((!(interfaceC1361730lXXLIZ instanceof C1362370lYZ) || z || Intrinsics.LJFF(((C1362370lYZ) interfaceC1361730lXXLIZ).LL, iMContact)) && (c1361720lXW = shareContactListViewModel.LLILZLL) != null && (c1362120lYA = shareContactListViewModel.LLILLJJLI) != null && (sharePackage = c1362120lYA.LL) != null) {
                    interfaceC1361730lXXLIZ = c1361720lXW.LIZ(interfaceC1361730lXXLIZ, new C1362170lYF(c1362190lYHLIZ, shareContactListViewModel, sharePackage, null), null);
                }
                arrayList.add(interfaceC1361730lXXLIZ);
            }
            IMContact iMContact2 = (IMContact) awS72S0210000_21.l1;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                IMContact iMContactLJLJJI = ((InterfaceC1361730lXX) it2.next()).LJLJJI();
                if (iMContactLJLJJI != null) {
                    uid = iMContactLJLJJI.getUid();
                } else {
                    uid = null;
                }
                if (Intrinsics.LJFF(uid, iMContact2.getUid())) {
                    break;
                }
            }
        }
        ((ShareContactListViewModel) awS72S0210000_21.l0).setState(new AwS387S0200000_21(arrayList, (List<? extends InterfaceC1361730lXX>) setLLIIIZ, (Set<IMContact>) 29));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS72S0210000_21 awS72S0210000_21, Object obj) {
        C291001Au<Long> c291001Au;
        C1353820lKm c1353820lKm = (C1353820lKm) obj;
        c1353820lKm.getClass();
        List listLIZ = C627260Oiy.LIZ(c1353820lKm);
        Object obj2 = null;
        if (listLIZ != null) {
            InteractionBubbleListAssem interactionBubbleListAssem = (InteractionBubbleListAssem) awS72S0210000_21.l1;
            Iterator it2 = listLIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) next;
                if ((interfaceC1891350zJl instanceof LikeItem) && Intrinsics.LJFF(((LikeItem) interfaceC1891350zJl).getUser().getUid(), interactionBubbleListAssem.getUser().getUid())) {
                    obj2 = next;
                    break;
                }
            }
            obj2 = (InterfaceC1891350zJl) obj2;
        }
        Boolean bool = (Boolean) awS72S0210000_21.l0;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2) && obj2 == null) {
            InteractionBubbleListVM interactionBubbleListVMUp = ((InteractionBubbleListAssem) awS72S0210000_21.l1).up();
            int iLJIIIIZZ = ((InteractionBubbleListAssem) awS72S0210000_21.l1).tp().getState().LJIIIIZZ();
            int iOp = ((InteractionBubbleListAssem) awS72S0210000_21.l1).op();
            if (iLJIIIIZZ > iOp) {
                iLJIIIIZZ = iOp;
            }
            interactionBubbleListVMUp.listAddItemAt(iLJIIIIZZ, new LikeItem(((InteractionBubbleListAssem) awS72S0210000_21.l1).getUser(), ((InterfaceC1353860lKq) C631370Opb.LIZ((InteractionBubbleListAssem) awS72S0210000_21.l1)).getAweme(), ((InteractionBubbleListAssem) awS72S0210000_21.l1).sp()));
            ((InteractionBubbleListAssem) awS72S0210000_21.l1).zp();
        } else if (!Intrinsics.LJFF((Boolean) awS72S0210000_21.l0, bool2) && obj2 != null) {
            InteractionBubbleListAssem interactionBubbleListAssem2 = (InteractionBubbleListAssem) awS72S0210000_21.l1;
            boolean z = awS72S0210000_21.z2;
            interactionBubbleListAssem2.up().listRemoveItem(obj2);
            if (z && (c291001Au = ((C1353820lKm) interactionBubbleListAssem2.up().getState()).LLILZLL) != null) {
                long jLongValue = c291001Au.LIZ.longValue() - 1;
                if (jLongValue < 0) {
                    jLongValue = 0;
                }
                interactionBubbleListAssem2.up().setState(new AwS36S0000100_21(jLongValue, 1));
            }
            if (((InteractionBubbleListAssem) awS72S0210000_21.l1).tp().getState().LJIIIIZZ() == 0) {
                ((InteractionBubbleListAssem) awS72S0210000_21.l1).tp().LJJI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS72S0210000_21 awS72S0210000_21, Object obj) throws Throwable {
        List<? extends IMContact> list = (List) obj;
        C1365110lcz c1365110lcz = (C1365110lcz) awS72S0210000_21.l0;
        ShareTextBoxViewModel shareTextBoxViewModel = c1365110lcz.LJII;
        String string = null;
        Editable editableLLJILLL = C2204961BRm.LLJILLL(c1365110lcz.LJIIJJI, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzG3SDhT2DsSx9m1G5IYHvFWqNTg3AHF25Rh5qYck0uetpcfiGdxb6vYMk8fzSktOvb4CmLxw==", null));
        if (editableLLJILLL != null) {
            string = editableLLJILLL.toString();
        }
        boolean z = awS72S0210000_21.z2;
        shareTextBoxViewModel.LL.extras.putBoolean("show_tips_until_cancel", false);
        C786410Ut5.LJJJI("is_share_pop_up", "1", shareTextBoxViewModel.LL.extras);
        Boolean value = shareTextBoxViewModel.LLILZIL.getValue();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(value, bool)) {
            shareTextBoxViewModel.LLILZIL.postValue(bool);
        }
        String string2 = UUID.randomUUID().toString();
        shareTextBoxViewModel.yQ2(list);
        C1365330ldL.LIZ.LJI(list, string, shareTextBoxViewModel.LL, null, null, null, null, string2, !z, null, null, null);
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZJ().LJIILLIIL(shareTextBoxViewModel.LL, string, new ArrayList(list), System.currentTimeMillis(), C0I0B.LJFF.LIZIZ(), -1);
        shareTextBoxViewModel.LLJJIJIL.setValue(bool);
        ((C06V1) awS72S0210000_21.l1).dismiss();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S0210000_21(AbstractC1347290lAF abstractC1347290lAF, KeyboardVMV2 keyboardVMV2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC1347290lAF;
        this.l1 = keyboardVMV2;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S0210000_21(C1365110lcz c1365110lcz, boolean z, C06V1 c06v1, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1365110lcz;
        this.z2 = z;
        this.l1 = c06v1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S0210000_21(KeyboardVMV2 keyboardVMV2, Comment comment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = keyboardVMV2;
        this.l1 = comment;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S0210000_21(ShareContactListViewModel shareContactListViewModel, boolean z, IMContact iMContact, int i) {
        super(1);
        this.$t = i;
        this.l0 = shareContactListViewModel;
        this.z2 = z;
        this.l1 = iMContact;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S0210000_21(Boolean bool, InteractionBubbleListAssem interactionBubbleListAssem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = bool;
        this.l1 = interactionBubbleListAssem;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS72S0210000_21(boolean z, boolean z2, C627660Ojc<InterfaceC1361290lWp> c627660Ojc, FriendsV3InputFloatAssem friendsV3InputFloatAssem) {
        super(1);
        this.$t = friendsV3InputFloatAssem;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = c627660Ojc;
    }
}
