package com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive;

import X.AbstractC2172971A2l;
import X.AbstractC883730Ylf;
import X.C019F;
import X.C01GW;
import X.C05RV;
import X.C06A0;
import X.C0CYK;
import X.C0CYM;
import X.C0Z8I;
import X.C0Z8K;
import X.C0Z8Q;
import X.C0Z8V;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C1391960mKI;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LQ;
import X.C1490105sR;
import X.C1490205sS;
import X.C1492305sn;
import X.C1513005w8;
import X.C1516305wf;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1704306lt;
import X.C1717906o5;
import X.C19212010Ec;
import X.C19659111vp;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C343820Dds;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C426770GoN;
import X.C452501pT;
import X.C461720I8s;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C877210Yb9;
import X.C878460YdA;
import X.C878470YdB;
import X.C878950Ydx;
import X.C878970Ydz;
import X.C879510Yer;
import X.C879640Yf4;
import X.C879670Yf7;
import X.C879760YfG;
import X.C879780YfI;
import X.C879830YfN;
import X.C879870YfR;
import X.C879920YfW;
import X.C879980Yfc;
import X.C880020Yfg;
import X.C880050Yfj;
import X.C880130Yfr;
import X.C880350YgD;
import X.C880490YgR;
import X.C880730Ygp;
import X.C881210Yhb;
import X.C881400Yhu;
import X.C881430Yhx;
import X.C881470Yi1;
import X.C881500Yi4;
import X.C881530Yi7;
import X.C881570YiB;
import X.C881600YiE;
import X.C881610YiF;
import X.C881740YiS;
import X.C881830Yib;
import X.C881860Yie;
import X.C881910Yij;
import X.C881970Yip;
import X.C882050Yix;
import X.C882150Yj7;
import X.C882250YjH;
import X.C882310YjN;
import X.C883760Yli;
import X.C883780Ylk;
import X.C883800Ylm;
import X.C883850Ylr;
import X.C883860Yls;
import X.C883870Ylt;
import X.C883900Ylw;
import X.C883930Ylz;
import X.C884080YmE;
import X.C884160YmM;
import X.C884270YmX;
import X.C884380Ymi;
import X.C885040Ynm;
import X.C885050Ynn;
import X.C887150YrB;
import X.C887160YrC;
import X.C887530Yrn;
import X.EnumC880480YgQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC884050YmB;
import Y.AObserverS218S0100000_14;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.ArchivePageViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.NewSessionListSingleChatVH;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBotChatVH;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatVH;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.inbox.widget.InboxArchiveNoticeViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class InboxArchivePageChatListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final Keva LLJILJILJ;
    public boolean LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxArchivePageChatListAssem.class, "archivePageVM", "getArchivePageVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/archive/ArchivePageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InboxArchivePageChatListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ArchivePageViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 248), AFwS248S0000000_14.get$arr$(72), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 246));
        this.LLJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 249));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 247));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 245));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inbox_archive_page:");
        sbLIZ.append(C461720I8s.LIZIZ());
        this.LLJILJILJ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final ArchivePageViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (ArchivePageViewModel) assemVMLazy.getValue();
    }

    public final RecyclerView LLII() {
        return (RecyclerView) this.LLJIJIL.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        C19EG c19egLIZ;
        C19EG c19egLIZ2;
        C19EG c19egLIZ3;
        FragmentManager supportFragmentManager;
        int i;
        View viewSd;
        super.onResume();
        if (this.LLJILLL) {
            return;
        }
        this.LLJILLL = true;
        if (C0CYM.LIZJ.LJIIIIZZ()) {
            C878970Ydz.LIZIZ(ArchiveSettingPageViewModel.LL, false, false, true, new AwS593S0100000_14(this, 31), 3);
            return;
        }
        if (!C0CYK.LIZJ.LJIIIIZZ() || (c19egLIZ = C724240Sb0.LIZ(this)) == null || c19egLIZ.isFinishing() || (c19egLIZ2 = C724240Sb0.LIZ(this)) == null || c19egLIZ2.isDestroyed() || (c19egLIZ3 = C724240Sb0.LIZ(this)) == null || (supportFragmentManager = c19egLIZ3.getSupportFragmentManager()) == null || !(!supportFragmentManager.LJLJJI()) || (i = this.LLJILJILJ.getInt("bb_archive_intro_shown_time", 0)) > 0) {
            return;
        }
        C1391960mKI c1391960mKI = new C1391960mKI();
        Context context = getContext();
        if (context == null) {
            viewSd = null;
        } else {
            viewSd = C786410Ut5.Sd(R.layout.d5q, C786410Ut5.ne(context), null);
            View viewFindViewById = viewSd.findViewById(R.id.b7n);
            if (viewFindViewById != null) {
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                int[] iArr = new int[2];
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1c, context);
                iArr[0] = numLIZJ != null ? numLIZJ.intValue() : 0;
                iArr[1] = 0;
                GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
                gradientDrawable.setGradientType(0);
                viewFindViewById.setBackground(gradientDrawable);
            }
            View viewFindViewById2 = viewSd.findViewById(R.id.b7p);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1f);
            c384050F3z.LIZJ = Float.valueOf(context.getResources().getDimensionPixelOffset(R.dimen.sb));
            Drawable drawableLIZ = c384050F3z.LIZ(context);
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(8);
            c19659111vp.LJ = Integer.valueOf(R.attr.ox);
            c19659111vp.LIZ = context.getResources().getDimensionPixelOffset(R.dimen.sb);
            viewFindViewById2.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(context)));
            C426770GoN c426770GoN = (C426770GoN) viewSd.findViewById(R.id.b7o);
            c426770GoN.setVariant(1);
            c426770GoN.setCount(2);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, context);
            c426770GoN.setBadgeBackgroundColor(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, context);
            c426770GoN.setBadgeContentColor(numLIZJ3 != null ? numLIZJ3.intValue() : 0);
        }
        c1391960mKI.LJFF = viewSd;
        c1391960mKI.LJI = 2;
        c1391960mKI.LJII = Ho().getString(2131830273);
        c1391960mKI.LJIIIIZZ = Ho().getString(2131830271);
        c1391960mKI.LIZIZ(Ho().getString(2131830268), null);
        c1391960mKI.LJIILJJIL = true;
        c1391960mKI.LIZ = false;
        c1391960mKI.LIZ().LIZ.show(supportFragmentManager, "archive_guide_intro_panel");
        this.LLJILJILJ.storeInt("bb_archive_intro_shown_time", i + 1);
    }

    public final Context Ho() {
        Context context = getContext();
        return context == null ? C1383370m6R.LIZ : context;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InboxArchiveNoticeViewModel inboxArchiveNoticeViewModel = (InboxArchiveNoticeViewModel) this.LLJ.getValue();
        if (inboxArchiveNoticeViewModel != null) {
            inboxArchiveNoticeViewModel.vQ2();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C19719912Dl c19719912DlLIZ;
        C19719912Dl c19719912DlLIZ2;
        C19719912Dl c19719912DlLIZ3;
        C19719912Dl c19719912DlLIZ4;
        C19719912Dl c19719912DlLIZ5;
        C19719912Dl c19719912DlLIZ6;
        C19719912Dl c19719912DlLIZ7;
        C19719912Dl c19719912DlLIZ8;
        MutableLiveData mutableLiveDataWQ2;
        super.onViewCreated(view);
        RecyclerView recyclerViewLLII = LLII();
        C19719912Dl c19719912DlLIZ9 = null;
        if (recyclerViewLLII != null) {
            recyclerViewLLII.setLayoutManager(new LinearLayoutManager(recyclerViewLLII.getContext()));
            final AwS593S0100000_14 awS593S0100000_14 = new AwS593S0100000_14(this, 366);
            recyclerViewLLII.setAdapter(new AbstractC2172971A2l<InterfaceC1891350zJl, RecyclerView.ViewHolder>(awS593S0100000_14) { // from class: X.0Z36
                public final Function1<RecyclerView.ViewHolder, Unit> LLILLJJLI;
                public final HashMap<C13IQ<? extends InterfaceC1891350zJl>, Integer> LLILLL;
                public int LLILZ;

                {
                    super(new AbstractC339510DSr<InterfaceC1891350zJl>() { // from class: X.0zI6
                        @Override // X.AbstractC339510DSr
                        public final boolean LIZ(InterfaceC1891350zJl interfaceC1891350zJl, InterfaceC1891350zJl interfaceC1891350zJl2) {
                            return interfaceC1891350zJl.areContentsTheSame(interfaceC1891350zJl2);
                        }

                        @Override // X.AbstractC339510DSr
                        public final boolean LIZIZ(InterfaceC1891350zJl interfaceC1891350zJl, InterfaceC1891350zJl interfaceC1891350zJl2) {
                            return interfaceC1891350zJl.areItemTheSame(interfaceC1891350zJl2);
                        }
                    });
                    this.LLILLJJLI = awS593S0100000_14;
                    this.LLILLL = new HashMap<>();
                }

                @Override // X.AbstractC21673619ry
                public final int getItemViewType(int i) {
                    InterfaceC1891350zJl interfaceC1891350zJlLLLFZ = LLLFZ(i);
                    Integer num = this.LLILLL.get(C13LE.LIZ(interfaceC1891350zJlLLLFZ.getClass()));
                    if (num != null) {
                        return num.intValue();
                    }
                    int i2 = this.LLILZ + 1;
                    this.LLILZ = i2;
                    this.LLILLL.put(C13LE.LIZ(interfaceC1891350zJlLLLFZ.getClass()), Integer.valueOf(i2));
                    return i2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC21673619ry
                public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                    C0Z32 c0z32;
                    super.onViewAttachedToWindow(viewHolder);
                    if ((viewHolder instanceof C0Z32) && (c0z32 = (C0Z32) viewHolder) != null) {
                        c0z32.onAttach();
                    }
                    this.LLILLJJLI.invoke(viewHolder);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC21673619ry
                public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
                    InterfaceC892580Yzw interfaceC892580Yzw;
                    C0Z32 c0z32;
                    super.onViewDetachedFromWindow(viewHolder);
                    InterfaceC887660Ys0<?> interfaceC887660Ys0 = null;
                    if ((viewHolder instanceof C0Z32) && (c0z32 = (C0Z32) viewHolder) != null) {
                        c0z32.onDetach();
                    }
                    Integer numValueOf = Integer.valueOf(viewHolder.getBindingAdapterPosition());
                    if (numValueOf.intValue() != -1) {
                        int iIntValue = numValueOf.intValue();
                        if ((viewHolder instanceof InterfaceC892580Yzw) && (interfaceC892580Yzw = (InterfaceC892580Yzw) viewHolder) != null) {
                            InterfaceC1891350zJl interfaceC1891350zJlLLLFZ = LLLFZ(iIntValue);
                            if (interfaceC1891350zJlLLLFZ instanceof InterfaceC887660Ys0) {
                                interfaceC887660Ys0 = (InterfaceC887660Ys0) interfaceC1891350zJlLLLFZ;
                            }
                            interfaceC892580Yzw.LJLJI(interfaceC887660Ys0);
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC21673619ry
                public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
                    C0Z9B c0z9b;
                    super.onViewRecycled(viewHolder);
                    if ((viewHolder instanceof C0Z9B) && (c0z9b = (C0Z9B) viewHolder) != null) {
                        c0z9b.LJLJI(null);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    InterfaceC892580Yzw interfaceC892580Yzw;
                    C0Z37 c0z37;
                    InterfaceC1891350zJl interfaceC1891350zJlLLLFZ = LLLFZ(i);
                    InterfaceC887660Ys0<?> interfaceC887660Ys0 = null;
                    if ((viewHolder instanceof C0Z37) && (c0z37 = (C0Z37) viewHolder) != null) {
                        c0z37.LJZI(i, interfaceC1891350zJlLLLFZ);
                    }
                    if ((viewHolder instanceof InterfaceC892580Yzw) && (interfaceC892580Yzw = (InterfaceC892580Yzw) viewHolder) != null) {
                        if (interfaceC1891350zJlLLLFZ instanceof InterfaceC887660Ys0) {
                            interfaceC887660Ys0 = (InterfaceC887660Ys0) interfaceC1891350zJlLLLFZ;
                        }
                        interfaceC892580Yzw.LJLJI(interfaceC887660Ys0);
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    boolean zLIZ;
                    C13IQ<? extends InterfaceC1891350zJl> c13iq;
                    Object next;
                    RecyclerView.ViewHolder viewHolderLJJJJLI;
                    boolean z;
                    Iterator<T> it2 = this.LLILLL.entrySet().iterator();
                    while (true) {
                        zLIZ = true;
                        c13iq = null;
                        if (it2.hasNext()) {
                            next = it2.next();
                            Integer num = (Integer) ((Map.Entry) next).getValue();
                            if (num != null && num.intValue() == i) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry != null) {
                        c13iq = (C13IQ) entry.getKey();
                    }
                    if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C0Z7H.class))) {
                        viewHolderLJJJJLI = new NewSessionListSingleChatVH(viewGroup);
                    } else if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C0Z7I.class))) {
                        viewHolderLJJJJLI = new SessionListGroupChatVH(viewGroup);
                    } else if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C0Z7G.class))) {
                        viewHolderLJJJJLI = new SessionListBotChatVH(viewGroup);
                    } else {
                        viewHolderLJJJJLI = C19212010Ec.LIZJ.LJJJJLI(viewGroup, c13iq);
                    }
                    if (viewHolderLJJJJLI != null) {
                        try {
                            View view2 = viewHolderLJJJJLI.itemView;
                            if (view2 != null) {
                                view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    viewHolderLJJJJLI.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (viewHolderLJJJJLI.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                                zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (zLIZ) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("onCreateViewHolder getParent() != null crash hook,");
                                stringBuffer.append(" holder ");
                                stringBuffer.append(viewHolderLJJJJLI.getClass().getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) viewHolderLJJJJLI.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(viewHolderLJJJJLI.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = viewHolderLJJJJLI.getClass().getName();
                    return viewHolderLJJJJLI;
                }
            });
            recyclerViewLLII.setItemAnimator(null);
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0YoX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C887580Yrs) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 102), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0Yrp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C887580Yrs) obj).LLILLJJLI;
            }
        }, null, new AwS628S0100000_14(this, 103), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0Yrt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C887580Yrs) obj).LL;
            }
        }, null, new AwS628S0100000_14(this, 104), 6);
        InboxArchiveNoticeViewModel inboxArchiveNoticeViewModel = (InboxArchiveNoticeViewModel) this.LLJ.getValue();
        if (inboxArchiveNoticeViewModel != null && (mutableLiveDataWQ2 = inboxArchiveNoticeViewModel.wQ2()) != null) {
            mutableLiveDataWQ2.observe(this, new AObserverS218S0100000_14(this, 38));
        } else {
            Go().yQ2(C13BV.INSTANCE);
        }
        final ArchivePageViewModel archivePageViewModelGo = Go();
        FilterTabType filterTabType = FilterTabType.ARCHIVE;
        Set setSingleton = Collections.singleton(EnumC880480YgQ.ALL);
        C878950Ydx c878950Ydx = new C878950Ydx("archive_page", filterTabType, setSingleton, SystemClock.elapsedRealtime(), 17);
        C877210Yb9 c877210Yb9 = new C877210Yb9(filterTabType, setSingleton);
        C880490YgR c880490YgR = new C880490YgR(filterTabType, setSingleton);
        List listLJIIL = C1697810uHb.LJIIL(new Pair(C13LE.LIZ(C878460YdA.class), new C878470YdB(c878950Ydx, c877210Yb9)));
        C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
        if (c19212010Ec.LJJLIIIJL()) {
            c19719912DlLIZ = C13LE.LIZ(C885050Ynn.class);
        } else {
            c19719912DlLIZ = null;
        }
        List listLJIIL2 = C1697810uHb.LJIIL(c19719912DlLIZ);
        C13IQ[] c13iqArr = new C13IQ[12];
        c13iqArr[0] = C13LE.LIZ(C1490105sR.class);
        c13iqArr[1] = C13LE.LIZ(C880130Yfr.class);
        c13iqArr[2] = C13LE.LIZ(C881600YiE.class);
        c13iqArr[3] = C13LE.LIZ(C06A0.class);
        if (C1717906o5.LIZ()) {
            c19719912DlLIZ9 = C13LE.LIZ(C881530Yi7.class);
        }
        c13iqArr[4] = c19719912DlLIZ9;
        if (C1717906o5.LIZ()) {
            c19719912DlLIZ2 = C13LE.LIZ(C880350YgD.class);
        } else {
            c19719912DlLIZ2 = null;
        }
        c13iqArr[5] = c19719912DlLIZ2;
        c13iqArr[6] = C13LE.LIZ(C881970Yip.class);
        c13iqArr[7] = C13LE.LIZ(C1516305wf.class);
        c13iqArr[8] = C13LE.LIZ(C1704306lt.class);
        if (C343820Dds.LIZ()) {
            c19719912DlLIZ3 = C13LE.LIZ(C1490205sS.class);
        } else {
            c19719912DlLIZ3 = null;
        }
        c13iqArr[9] = c19719912DlLIZ3;
        c13iqArr[10] = C13LE.LIZ(C1513005w8.class);
        c13iqArr[11] = C13LE.LIZ(C881910Yij.class);
        List listLJIJI = C13LQ.LJIJI(c13iqArr);
        Pair pair = new Pair(C13LE.LIZ(C879780YfI.class), new C879760YfG(c878950Ydx, c880490YgR));
        C13IQ[] c13iqArr2 = new C13IQ[23];
        c13iqArr2[0] = C13LE.LIZ(C879870YfR.class);
        c13iqArr2[1] = C13LE.LIZ(C879980Yfc.class);
        c13iqArr2[2] = C13LE.LIZ(C882150Yj7.class);
        C05RV c05rvLIZJ = c19212010Ec.LIZJ();
        C05RV c05rv = C05RV.BUSINESS_INBOX;
        if (c05rvLIZJ != c05rv) {
            c19719912DlLIZ4 = C13LE.LIZ(C887530Yrn.class);
        } else {
            c19719912DlLIZ4 = null;
        }
        c13iqArr2[3] = c19719912DlLIZ4;
        c13iqArr2[4] = C13LE.LIZ(C880050Yfj.class);
        c13iqArr2[5] = C13LE.LIZ(C880730Ygp.class);
        c13iqArr2[6] = C13LE.LIZ(C879920YfW.class);
        c13iqArr2[7] = C13LE.LIZ(C881740YiS.class);
        c13iqArr2[8] = C13LE.LIZ(C882050Yix.class);
        c13iqArr2[9] = C13LE.LIZ(C879510Yer.class);
        c13iqArr2[10] = C13LE.LIZ(C881570YiB.class);
        c13iqArr2[11] = C13LE.LIZ(C881400Yhu.class);
        c13iqArr2[12] = C13LE.LIZ(C879640Yf4.class);
        c13iqArr2[13] = C13LE.LIZ(C881830Yib.class);
        c13iqArr2[14] = C13LE.LIZ(C879670Yf7.class);
        if (C343820Dds.LIZ()) {
            c19719912DlLIZ5 = C13LE.LIZ(C882250YjH.class);
        } else {
            c19719912DlLIZ5 = null;
        }
        c13iqArr2[15] = c19719912DlLIZ5;
        c13iqArr2[16] = C13LE.LIZ(C879830YfN.class);
        c13iqArr2[17] = C13LE.LIZ(C881430Yhx.class);
        c13iqArr2[18] = C13LE.LIZ(C881470Yi1.class);
        c13iqArr2[19] = C13LE.LIZ(C880020Yfg.class);
        c13iqArr2[20] = C13LE.LIZ(C881860Yie.class);
        if (C1717906o5.LIZ()) {
            c19719912DlLIZ6 = C13LE.LIZ(C881610YiF.class);
        } else {
            c19719912DlLIZ6 = null;
        }
        c13iqArr2[21] = c19719912DlLIZ6;
        if (C883930Ylz.LIZ(setSingleton)) {
            c19719912DlLIZ7 = C13LE.LIZ(C881210Yhb.class);
        } else {
            c19719912DlLIZ7 = null;
        }
        c13iqArr2[22] = c19719912DlLIZ7;
        List listLJIJI2 = C13LQ.LJIJI(c13iqArr2);
        List listLJIJI3 = C13LQ.LJIJI(new C13IQ[]{C13LE.LIZ(C887150YrB.class), C13LE.LIZ(C887160YrC.class)});
        C13IQ[] c13iqArr3 = new C13IQ[4];
        if (c19212010Ec.LIZJ() != c05rv) {
            c19719912DlLIZ8 = C13LE.LIZ(C0Z8Q.class);
        } else {
            c19719912DlLIZ8 = null;
        }
        c13iqArr3[0] = c19719912DlLIZ8;
        c13iqArr3[1] = C13LE.LIZ(C0Z8K.class);
        c13iqArr3[2] = C13LE.LIZ(C0Z8V.class);
        c13iqArr3[3] = C13LE.LIZ(C0Z8I.class);
        List listLJIJI4 = C13LQ.LJIJI(c13iqArr3);
        C884380Ymi c884380Ymi = new C884380Ymi(false, C13BV.INSTANCE, null, null, C884080YmE.LIZ().minSizeToStopLoad, C884080YmE.LIZ().minSizeToDisplay, false, C1492305sn.LIZ(), 408);
        C881500Yi4 c881500Yi4 = AbstractC883730Ylf.LJIIIIZZ;
        C885040Ynm c885040Ynm = new C885040Ynm(c878950Ydx, listLJIIL, listLJIIL2, listLJIJI, pair, listLJIJI2, listLJIJI3, listLJIJI4, c884380Ymi, new C883860Yls(c881500Yi4), new C883800Ylm(c881500Yi4), new C883870Ylt(c881500Yi4), new C883760Yli(c881500Yi4), new C882310YjN(c881500Yi4), new C883850Ylr(c881500Yi4), new C883900Ylw(c881500Yi4), new C883780Ylk(c881500Yi4));
        IChatListEngine.LIZ.getClass();
        C884270YmX c884270YmXLJIIJ = C884160YmM.LIZ().LJIIJ(c885040Ynm);
        c884270YmXLJIIJ.LJIILJJIL(new InterfaceC884050YmB() { // from class: X.0YmL
            @Override // X.InterfaceC884050YmB
            public final String LIZ() {
                return " archive_page_viewmodel";
            }

            @Override // X.InterfaceC884050YmB
            public final void LIZJ(InterfaceC884020Ym8 interfaceC884020Ym8, List<? extends InterfaceC884440Ymo> list, boolean z, String str) {
                if (a0.LJJIIZI(str, "ChatListConversationDataSource", false)) {
                    archivePageViewModelGo.LLILZLL = z;
                }
                ArrayList arrayList = new ArrayList();
                for (InterfaceC884440Ymo interfaceC884440Ymo : list) {
                    if (interfaceC884440Ymo instanceof InterfaceC885810Yp1) {
                        arrayList.add(interfaceC884440Ymo);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C890610Ywl c890610YwlLIZIZ = C0Z8J.LIZIZ((InterfaceC885810Yp1) it2.next(), false);
                    if (c890610YwlLIZIZ != null) {
                        arrayList2.add(c890610YwlLIZIZ);
                    }
                }
                ArchivePageViewModel archivePageViewModel = archivePageViewModelGo;
                archivePageViewModel.LLILLL = arrayList2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set dmArchiveItems: ");
                sbLIZ.append(Integer.valueOf(arrayList2.size()));
                C2188811AlT.LIZIZ(sbLIZ);
                archivePageViewModel.xQ2();
            }
        });
        c884270YmXLJIIJ.c5("new_page_no_cache_load_more");
        archivePageViewModelGo.LL = c884270YmXLJIIJ;
    }
}
