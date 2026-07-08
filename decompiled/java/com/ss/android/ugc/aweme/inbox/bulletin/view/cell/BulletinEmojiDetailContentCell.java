package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0DTR;
import X.C0OSZ;
import X.C0QSJ;
import X.C1196320hEk;
import X.C1220000hqw;
import X.C127G;
import X.C12ES;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1558520qew;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C340320DVu;
import X.C438710HIf;
import X.C452070Ho5;
import X.C452080Ho6;
import X.C452501pT;
import X.C621500OZg;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ACListenerS144S0100000_9;
import Y.AComparatorS28S0000000_9;
import Y.AObjectS384S0100000_9;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.scope.BulletinSelectEmojiSheetScope;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinEmojiDetailContentCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinSelectEmojiSheetAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmojiTab;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiDetailContentCell extends PowerCell<C621500OZg> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(175));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 674));
    public final AssemVMLazy LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C736950SvV LLILZLL;
    public final C736950SvV LLIZ;
    public C127G LLIZLLLIL;
    public InterfaceC665370Q7z LLJ;
    public C0QSJ LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinEmojiDetailContentCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinEmojiDetailListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinSelectEmojiSheetScope.class, BulletinFragmentScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a6w;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinSelectEmojiSheetScope.class);
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    public BulletinEmojiDetailContentCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinEmojiDetailListViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 677);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(326);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 659), awS553S0100000_9, AFwS195S0000000_9.get$arr$(174), new AwS553S0100000_9((C03K6) this, 662), new AwS553S0100000_9((C03K6) this, 664), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 666), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 668), null, new AwS553S0100000_9((C03K6) this, 669));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((C03K6) this, 663);
            AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 665);
            AwS553S0100000_9 awS553S0100000_94 = new AwS553S0100000_9(c19719912DlLIZ, 667);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_92, 30));
            AwS553S0100000_9 awS553S0100000_95 = new AwS553S0100000_9(c01gwLIZIZ, 670);
            AwS553S0100000_9 awS553S0100000_96 = new AwS553S0100000_9(c01gwLIZIZ, 671);
            AwS553S0100000_9 awS553S0100000_97 = new AwS553S0100000_9(c01gwLIZIZ, 672);
            AwS553S0100000_9 awS553S0100000_98 = new AwS553S0100000_9(c01gwLIZIZ, 673);
            AwS553S0100000_9 awS553S0100000_99 = new AwS553S0100000_9(c01gwLIZIZ, 675);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS553S0100000_94, awS553S0100000_9, new C452080Ho6(), awS553S0100000_95, awS553S0100000_96, awS553S0100000_93, aFwS240S0000000_9, awS553S0100000_97, awS553S0100000_98, awS553S0100000_99);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 676), awS553S0100000_9, AFwS195S0000000_9.get$arr$(176), new AwS553S0100000_9((C03K6) this, 678), new AwS553S0100000_9((C03K6) this, 679), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 680), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 681), null, new AwS553S0100000_9((C03K6) this, 682));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 683), awS553S0100000_9, AFwS195S0000000_9.get$arr$(173), new AwS553S0100000_9((C03K6) this, 653), new AwS553S0100000_9((C03K6) this, 655), new AwS553S0100000_9((C03K6) this, 657), aFwS240S0000000_9, null, null, new AwS553S0100000_9((C03K6) this, 658));
        }
        this.LLILLL = assemVMLazy;
        this.LLILZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 661));
        this.LLILZIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 654));
        AwS553S0100000_9 awS553S0100000_910 = new AwS553S0100000_9(this, 660);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinProfileViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_92 = AFwS240S0000000_9.get$arr$(327);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLILZLL = new C736950SvV(c19719912DlLIZ2, awS553S0100000_910, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_92, null, null, null);
        AwS553S0100000_9 awS553S0100000_911 = new AwS553S0100000_9(this, 656);
        this.LLIZ = new C736950SvV(C13LE.LIZ(BulletinEmojiDetailViewModel.class), awS553S0100000_911, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(328), null, null, null);
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I5() {
        final C621500OZg item;
        BulletinSelectEmojiSheetAbility bulletinSelectEmojiSheetAbility;
        C621500OZg item2 = getItem();
        if (item2 == null || !item2.LLILLL || !((BulletinProfileViewModel) this.LLILZLL.getValue()).q11() || (item = getItem()) == null) {
            return;
        }
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        AssemSingleListViewModel assemSingleListViewModel = (AssemSingleListViewModel) assemVMLazy.getValue();
        C340320DVu c340320DVu = (C340320DVu) assemSingleListViewModel.getState();
        c340320DVu.getClass();
        List<C621500OZg> list = c340320DVu.getListState().LLILZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(item);
            assemSingleListViewModel.listSetItems(arrayList);
            assemSingleListViewModel.setState(new AwS588S0100000_9(arrayList, (List<InterfaceC1891350zJl>) 544));
        }
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
        if (interfaceC665370Q7zLIZ == null || (bulletinSelectEmojiSheetAbility = (BulletinSelectEmojiSheetAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinSelectEmojiSheetAbility.class, null)) == null) {
            return;
        }
        bulletinSelectEmojiSheetAbility.y6(item.LLILLJJLI, new C0OSZ() { // from class: X.0Obj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0OSZ
            public final void LIZ() {
                AssemVMLazy assemVMLazy2 = this.LIZ.LLILLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = BulletinEmojiDetailContentCell.LLJIJIL;
                AssemSingleListViewModel assemSingleListViewModel2 = (AssemSingleListViewModel) assemVMLazy2.getValue();
                C621500OZg c621500OZg = item;
                C340320DVu c340320DVu2 = (C340320DVu) assemSingleListViewModel2.getState();
                c340320DVu2.getClass();
                List<C621500OZg> list2 = c340320DVu2.getListState().LLILZ;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList(list2);
                    arrayList2.add(c621500OZg);
                    if (arrayList2.size() > 1) {
                        C08XD.LJJ(arrayList2, new AComparatorS28S0000000_9(15));
                    }
                    assemSingleListViewModel2.listSetItems(arrayList2);
                    assemSingleListViewModel2.setState(new AwS588S0100000_9(arrayList2, (List<InterfaceC1891350zJl>) 516));
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0OSZ
            public final void LIZIZ() {
                Object next;
                BulletinEmojiDetailViewModel bulletinEmojiDetailViewModel = (BulletinEmojiDetailViewModel) this.LIZ.LLIZ.getValue();
                C621500OZg c621500OZg = item;
                if (bulletinEmojiDetailViewModel.LLILZ.containsKey(c621500OZg.LLILLJJLI)) {
                    List list2 = (List) ((LinkedHashMap) bulletinEmojiDetailViewModel.LLILZ).get(c621500OZg.LLILLJJLI);
                    if (list2 != null) {
                        list2.add(c621500OZg.LL);
                    }
                } else {
                    bulletinEmojiDetailViewModel.LLILZ.put(c621500OZg.LLILLJJLI, C1697810uHb.LJIILJJIL(c621500OZg.LL));
                }
                BulletinEmojiTab bulletinEmojiTab = bulletinEmojiDetailViewModel.LLILZIL;
                if (bulletinEmojiTab != null) {
                    bulletinEmojiDetailViewModel.LLILZIL = bulletinEmojiTab.copy(bulletinEmojiTab.tabType, bulletinEmojiTab.tabName, bulletinEmojiTab.count - 1, bulletinEmojiTab.selected);
                }
                Iterator it2 = C13LP.LLIIL(bulletinEmojiDetailViewModel.getState().LLILLJJLI).iterator();
                while (true) {
                    C717610SCx c717610SCx = (C717610SCx) it2;
                    if (!c717610SCx.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = c717610SCx.next();
                        if (Intrinsics.LJFF(((BulletinEmojiTab) ((IndexedValue) next).LIZIZ).tabName, c621500OZg.LLILLJJLI)) {
                            break;
                        }
                    }
                }
                IndexedValue indexedValue = (IndexedValue) next;
                if (indexedValue != null) {
                    bulletinEmojiDetailViewModel.setState(new AwS588S0100000_9(indexedValue, (IndexedValue<BulletinEmojiTab>) 521));
                }
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLIZLLLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLIZLLLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinEmojiDetailListViewModel.class, new AObjectS384S0100000_9(this, 2)}, defaultViewModelProviderFactory);
                    this.LLIZLLLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) this.itemView.findViewById(R.id.d0j);
        if (smartAvatarImageView != null) {
            C786410Ut5.G9(smartAvatarImageView, new ACListenerS144S0100000_9(this, 51));
        }
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.d0n);
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS144S0100000_9(this, 52));
        }
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.d0l);
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS144S0100000_9(this, 53));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C621500OZg c621500OZg = (C621500OZg) interfaceC1891350zJl;
        super.onBindItemView(c621500OZg);
        UrlModel avatarThumb = c621500OZg.LL.getAvatarThumb();
        if (avatarThumb != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
            c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.d0j));
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            TextView textView = (TextView) this.itemView.findViewById(R.id.d0m);
            String nickname = c621500OZg.LL.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            textView.setText(nickname);
            ((TextView) this.itemView.findViewById(R.id.d0l)).setText(c621500OZg.LLILLJJLI);
            if (c621500OZg.LLILLL && ((BulletinProfileViewModel) this.LLILZLL.getValue()).q11()) {
                C12ES.LJIILL(0, this.itemView.findViewById(R.id.d0k));
            } else {
                C0DTR.LIZIZ(this.itemView.findViewById(R.id.d0k));
            }
            if (c621500OZg.LLILZ) {
                C12ES.LJIILL(0, this.itemView.findViewById(R.id.d0l));
            } else {
                C0DTR.LIZIZ(this.itemView.findViewById(R.id.d0l));
            }
        }
    }
}
