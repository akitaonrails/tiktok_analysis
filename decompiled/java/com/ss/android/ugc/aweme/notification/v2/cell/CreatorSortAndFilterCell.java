package com.ss.android.ugc.aweme.notification.v2.cell;

import X.AbstractC624280OeA;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0OM1;
import X.C0SY5;
import X.C1076050e6l;
import X.C1250250idj;
import X.C1250300ido;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C1900830zZ3;
import X.C1901600zaI;
import X.C1901610zaJ;
import X.C1902110zb7;
import X.C1902140zbA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426770GoN;
import X.C444960Hcc;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C747370TTj;
import X.C786410Ut5;
import X.C787990Uvd;
import X.C946803n0;
import X.C994003uc;
import X.EnumC1155150gAL;
import X.EnumC638250P1r;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.sheet.selectsheet.TuxMultiSelectionSheet;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import com.ss.android.ugc.aweme.notification.creator.widget.SortPopupWindow;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class CreatorSortAndFilterCell extends PowerCell<C1901600zaI> implements View.OnClickListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public TuxMultiSelectionSheet LLIZLLLIL;
    public List<NoticeSortModel> LLJ;
    public List<NoticeFilterModel> LLJI;
    public int LLJIJIL;
    public SortPopupWindow LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 413));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 414));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 407));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 409));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 404));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 406));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 411));
    public List<Integer> LLJILJIL = C13BV.INSTANCE;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CreatorSortAndFilterCell.class, "resultViewModel", "getResultViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/BaseNotificationResultViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a_v;
    }

    public CreatorSortAndFilterCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BaseNotificationResultViewModel.class);
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(c19719912DlLIZ, 429);
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(182);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS572S0100000_28(c19719912DlLIZ, 412), awS572S0100000_28, AFwS217S0000000_28.get$arr$(301), new AwS572S0100000_28((C03K6) this, 415), new AwS572S0100000_28((C03K6) this, 417), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 419), aFwS271S0000000_28, new AwS572S0100000_28((C03K6) this, 421), null, new AwS572S0100000_28((C03K6) this, 422));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS572S0100000_28 awS572S0100000_282 = new AwS572S0100000_28((C03K6) this, 416);
            AwS572S0100000_28 awS572S0100000_283 = new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 418);
            AwS572S0100000_28 awS572S0100000_284 = new AwS572S0100000_28(c19719912DlLIZ, 420);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS429S0200000_28((InterfaceC451590HnJ) obj, awS572S0100000_282, 42));
            AwS572S0100000_28 awS572S0100000_285 = new AwS572S0100000_28(c01gwLIZIZ, 423);
            AwS572S0100000_28 awS572S0100000_286 = new AwS572S0100000_28(c01gwLIZIZ, 424);
            AwS572S0100000_28 awS572S0100000_287 = new AwS572S0100000_28(c01gwLIZIZ, 425);
            AwS572S0100000_28 awS572S0100000_288 = new AwS572S0100000_28(c01gwLIZIZ, 426);
            AwS572S0100000_28 awS572S0100000_289 = new AwS572S0100000_28(c01gwLIZIZ, 427);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS572S0100000_284, awS572S0100000_28, new C452080Ho6(), awS572S0100000_285, awS572S0100000_286, awS572S0100000_283, aFwS271S0000000_28, awS572S0100000_287, awS572S0100000_288, awS572S0100000_289);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS572S0100000_28(c19719912DlLIZ, 428), awS572S0100000_28, AFwS217S0000000_28.get$arr$(302), new AwS572S0100000_28((C03K6) this, 430), new AwS572S0100000_28((C03K6) this, 431), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) this, 432), aFwS271S0000000_28, new AwS572S0100000_28((C03K6) this, 433), null, new AwS572S0100000_28((C03K6) this, 434));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS572S0100000_28(c19719912DlLIZ, 435), awS572S0100000_28, AFwS217S0000000_28.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), new AwS572S0100000_28((C03K6) this, 403), new AwS572S0100000_28((C03K6) this, 405), new AwS572S0100000_28((C03K6) this, 408), aFwS271S0000000_28, null, null, new AwS572S0100000_28((C03K6) this, 410));
        }
        this.LLJILLL = assemVMLazy;
        this.LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 402));
    }

    public final TextView I5() {
        return (TextView) this.LLILZ.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(this, (View) this.LLILLJJLI.getValue());
        C786410Ut5.I7(this, (View) this.LLILLL.getValue());
    }

    public final void L5(List<Integer> list) {
        int iIntValue;
        int iIntValue2;
        I5().setText(I5().getResources().getString(2131830250));
        C786410Ut5.LLIL(I5(), 0);
        if (!list.isEmpty()) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0d, this.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            I5().setTextColor(iIntValue2);
            ((C426770GoN) this.LLILZIL.getValue()).setCount(list.size());
            C786410Ut5.LLLLLLIL((C426770GoN) this.LLILZIL.getValue(), 0);
            C786410Ut5.LJLLLLLL(8, (View) this.LLILZLL.getValue());
            return;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, this.itemView.getContext());
        if (numLIZJ2 != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = 0;
        }
        I5().setTextColor(iIntValue);
        C786410Ut5.LLLLLLIL((C426770GoN) this.LLILZIL.getValue(), 8);
        C786410Ut5.LJLLLLLL(0, (View) this.LLILZLL.getValue());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        NoticeSortModel next;
        String str;
        C1901600zaI c1901600zaI = (C1901600zaI) interfaceC1891350zJl;
        super.onBindItemView(c1901600zaI);
        List<NoticeSortModel> list = c1901600zaI.LLILZ;
        this.LLJ = list;
        this.LLJI = c1901600zaI.LLILZIL;
        int i = c1901600zaI.LL;
        if (i != EnumC1155150gAL.UN_SUPPORT.getId() && list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(8, (View) this.LLILLJJLI.getValue());
        } else {
            C786410Ut5.LJLLLLLL(0, (View) this.LLILLJJLI.getValue());
            List<NoticeSortModel> list2 = this.LLJ;
            if (list2 != null) {
                TextView textView = (TextView) this.LL.getValue();
                Iterator<NoticeSortModel> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.sortId == i) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NoticeSortModel noticeSortModel = next;
                if (noticeSortModel == null || (str = noticeSortModel.sortName) == null) {
                    str = "";
                }
                textView.setText(str);
            }
            this.LLJIJIL = i;
        }
        List<Integer> list3 = c1901600zaI.LLILLJJLI;
        if (C1900830zZ3.LIZ("filter_vh", this.LLJI)) {
            C786410Ut5.LLIL(I5(), 8);
        } else {
            L5(list3);
            this.LLJILJIL = list3;
        }
        SortPopupWindow sortPopupWindow = this.LLJILJILJ;
        if (sortPopupWindow != null) {
            sortPopupWindow.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        List<NoticeSortModel> list;
        Lifecycle lifecycle;
        int iIntValue;
        FragmentManager fragmentManager;
        TuxMultiSelectionSheet tuxMultiSelectionSheet;
        C747370TTj c747370TTj;
        String str;
        String str2 = null;
        if (view != null) {
            numValueOf = Integer.valueOf(view.getId());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() != R.id.vp_ && numValueOf.intValue() != R.id.vp8 && numValueOf.intValue() != R.id.vpe) {
                if (numValueOf.intValue() == R.id.hyj || numValueOf.intValue() == R.id.hy4 || numValueOf.intValue() == R.id.aw9 || numValueOf.intValue() == R.id.hxr) {
                    AbstractC624280OeA<C1902140zbA> abstractC624280OeA = new AbstractC624280OeA<C1902140zbA>() { // from class: X.0zbA
                    };
                    abstractC624280OeA.LIZJ = "notification_page";
                    C1901600zaI item = getItem();
                    if (item != null) {
                        str2 = item.LLILLL;
                    }
                    abstractC624280OeA.LIZLLL = str2;
                    abstractC624280OeA.LJII();
                    TuxMultiSelectionSheet tuxMultiSelectionSheet2 = this.LLIZLLLIL;
                    if (tuxMultiSelectionSheet2 != null && tuxMultiSelectionSheet2.isVisible()) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    List<NoticeFilterModel> list2 = this.LLJI;
                    if (list2 != null) {
                        for (NoticeFilterModel noticeFilterModel : list2) {
                            String str3 = "";
                            if (this.LLJILJIL.contains(Integer.valueOf(noticeFilterModel.filterId))) {
                                String str4 = noticeFilterModel.filterName;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                str = null;
                                c747370TTj = new C747370TTj(str4, null, true, noticeFilterModel, null, 18);
                            } else {
                                String str5 = noticeFilterModel.filterName;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                str = null;
                                c747370TTj = new C747370TTj(str5, null, false, noticeFilterModel, null, 22);
                            }
                            arrayList.add(c747370TTj);
                            String str6 = noticeFilterModel.filterName;
                            if (str6 != null) {
                                str3 = str6;
                            }
                            arrayList2.add(new C747370TTj(str3, str, false, noticeFilterModel, str, 22));
                        }
                    }
                    C1076050e6l c1076050e6l = new C1076050e6l();
                    C0OM1 c0om1 = new C0OM1();
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, this.itemView.getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c0om1.LIZJ(iIntValue);
                    C1250300ido c1250300ido = new C1250300ido();
                    c1250300ido.LIZJ = this.itemView.getResources().getString(2131830251);
                    c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
                    c1250300ido.LJ = true;
                    c1250300ido.LIZ(new AwS572S0100000_28(this, 829));
                    c0om1.LJ(c1250300ido);
                    C1250250idj c1250250idj = new C1250250idj();
                    c1250250idj.LIZJ = this.itemView.getResources().getString(2131830250);
                    c0om1.LIZJ = c1250250idj;
                    C1250300ido c1250300ido2 = new C1250300ido();
                    c1250300ido2.LIZJ = this.itemView.getResources().getString(2131830252);
                    c1250300ido2.LIZLLL = EnumC638250P1r.PRIMARY;
                    c1250300ido2.LJ = true;
                    c1250300ido2.LIZ(new AwS572S0100000_28(this, 830));
                    c0om1.LIZIZ(c1250300ido2);
                    c0om1.LIZLLL = true;
                    TuxMultiSelectionSheet tuxMultiSelectionSheet3 = c1076050e6l.LIZ;
                    tuxMultiSelectionSheet3.LLJJIII = c0om1;
                    tuxMultiSelectionSheet3.LLJJIJI = 0;
                    tuxMultiSelectionSheet3.LLJJIJIL = arrayList;
                    c1076050e6l.LIZ.LLJJJJ = this.itemView.getResources().getString(2131830215);
                    c1076050e6l.LIZ.LLJJJIL = new AwS607S0100000_28(this, 259);
                    AwS642S0100000_28 awS642S0100000_28 = new AwS642S0100000_28(this, 83);
                    TuxMultiSelectionSheet tuxMultiSelectionSheet4 = c1076050e6l.LIZ;
                    tuxMultiSelectionSheet4.LLJJJ = awS642S0100000_28;
                    this.LLIZLLLIL = tuxMultiSelectionSheet4;
                    Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
                    if (fragmentLIZ == null || (fragmentManager = fragmentLIZ.getFragmentManager()) == null || (tuxMultiSelectionSheet = this.LLIZLLLIL) == null) {
                        return;
                    }
                    tuxMultiSelectionSheet.show(fragmentManager, "filter");
                    return;
                }
                return;
            }
            String strLIZJ = C1901610zaJ.LIZJ(this.LLJIJIL, this.LLJ);
            C1902110zb7 c1902110zb7 = new C1902110zb7();
            c1902110zb7.LIZJ = "notification_page";
            C1901600zaI item2 = getItem();
            if (item2 != null) {
                str2 = item2.LLILLL;
            }
            c1902110zb7.LIZLLL = str2;
            c1902110zb7.LJI = strLIZJ;
            c1902110zb7.LJII();
            Context context = ((View) this.LLIZ.getValue()).getContext();
            if (context == null || (list = this.LLJ) == null) {
                return;
            }
            SortPopupWindow sortPopupWindow = new SortPopupWindow(context, list, new AwS607S0100000_28(this, 260));
            sortPopupWindow.setOutsideTouchable(true);
            sortPopupWindow.setTouchable(true);
            sortPopupWindow.setFocusable(true);
            sortPopupWindow.setElevation(32.0f);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1j);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            Drawable drawableLIZ = c384050F3z.LIZ(context);
            LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(context);
            if (lifecycleOwnerLIZIZ != null && (lifecycle = lifecycleOwnerLIZIZ.getLifecycle()) != null) {
                lifecycle.addObserver(sortPopupWindow);
            }
            sortPopupWindow.setBackgroundDrawable(drawableLIZ);
            View view2 = (View) this.LLIZ.getValue();
            if (view2 != null) {
                int[] iArr = new int[2];
                view2.getLocationInWindow(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                int paddingStart = i + view2.getPaddingStart();
                int height = i2 + view2.getHeight();
                if (C444960Hcc.LIZJ(view2.getContext())) {
                    sortPopupWindow.showAtLocation(view2, 8388661, paddingStart, height);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJI(sortPopupWindow);
                    C787990Uvd.LIZ.getClass();
                    C994003uc.LIZ();
                } else {
                    sortPopupWindow.showAtLocation(view2, 8388659, paddingStart, height);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJI(sortPopupWindow);
                    C787990Uvd.LIZ.getClass();
                    C994003uc.LIZ();
                }
            }
            this.LLJILJILJ = sortPopupWindow;
        }
    }
}
