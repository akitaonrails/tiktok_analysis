package com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C0DX2;
import X.C1058610ded;
import X.C13BV;
import X.C13LE;
import X.C15438062q;
import X.C1784340wXA;
import X.C1786400waU;
import X.C1838970xxH;
import X.C1838980xxI;
import X.C1838990xxJ;
import X.C1850180yFM;
import X.C1850190yFN;
import X.C19744212Mu;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C436790HAv;
import X.C452501pT;
import X.C786410Ut5;
import X.C997320c3m;
import X.EnumC1782860wUm;
import X.EnumC1839020xxM;
import X.InterfaceC1010530cP5;
import X.InterfaceC1484830ok5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS161S0100000_27;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class CommerceMusicSubstituteMusicVideoFragment extends Fragment implements InterfaceC1010530cP5<C1838980xxI> {
    public static final C1838990xxJ LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiJCo3ISRiICIjJGskKCE3JCA+Zys2PCQlHELIOSJWEgPSc/PSYnPTEpJDogISZiP359CyohJCohKyABPDw6KxY5KzwnITE5PSoePTYlKhk6LCAjDz0yLygpJzs=";
    public C1838980xxI LL;
    public final C997320c3m LLILLJJLI;
    public final C997320c3m LLILLL;
    public final C01GW LLILZ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0xxJ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceMusicSubstituteMusicVideoFragment.class, "musicDetail", "getMusicDetail()Lcom/ss/android/ugc/aweme/music/model/MusicDetail;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(CommerceMusicSubstituteMusicVideoFragment.class, "logger", "getLogger()Lcom/ss/android/ugc/aweme/commercialize/media/impl/logging/CommerceMusicLogger;", 0)};
        LLILZIL = new Object() { // from class: X.0xxJ
        };
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    public final CommerceMusicLogger MR() {
        C997320c3m c997320c3m = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (CommerceMusicLogger) c997320c3m.LIZ(this);
    }

    @Override // X.InterfaceC1010530cP5
    public final C1838980xxI Mh() {
        C1838980xxI c1838980xxI = this.LL;
        if (c1838980xxI == null) {
            return null;
        }
        return c1838980xxI;
    }

    public CommerceMusicSubstituteMusicVideoFragment() {
        super(R.layout.b08);
        this.LLILLJJLI = new C997320c3m(AFwS269S0000000_27.get$arr$(46));
        this.LLILLL = new C997320c3m(AFwS269S0000000_27.get$arr$(45));
        this.LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 216));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        CommerceMusicSubstituteMusicVideoViewModel commerceMusicSubstituteMusicVideoViewModel = (CommerceMusicSubstituteMusicVideoViewModel) this.LLILZ.getValue();
        C2252321DDq c2252321DDq = commerceMusicSubstituteMusicVideoViewModel.LLILLL;
        C436790HAv c436790HAv = (C436790HAv) c2252321DDq.getValue();
        List<C1786400waU> list = ((C436790HAv) commerceMusicSubstituteMusicVideoViewModel.LLILLL.getValue()).LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1786400waU> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1786400waU.LIZ(it2.next(), EnumC1782860wUm.PAUSED));
        }
        c2252321DDq.setValue(C436790HAv.LIZ(c436790HAv, arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ?? arrayList;
        String musicName;
        super.onCreate(bundle);
        CommerceMusicSubstituteMusicVideoViewModel commerceMusicSubstituteMusicVideoViewModel = (CommerceMusicSubstituteMusicVideoViewModel) this.LLILZ.getValue();
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        MusicDetail musicDetail = (MusicDetail) c997320c3m.LIZ(this);
        commerceMusicSubstituteMusicVideoViewModel.LL = musicDetail;
        C2252321DDq c2252321DDq = commerceMusicSubstituteMusicVideoViewModel.LLILLL;
        List<Aweme> list = musicDetail.aiRecommendVideoList;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1786400waU(it2.next(), EnumC1782860wUm.INITIAL));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        Music music = musicDetail.music;
        if (music == null || (musicName = music.getMusicName()) == null) {
            musicName = "";
        }
        c2252321DDq.setValue(new C436790HAv(arrayList, musicName));
        CommerceMusicLogger commerceMusicLoggerMR = MR();
        C1850190yFN.LIZ.getClass();
        commerceMusicLoggerMR.withParam(C1850190yFN.LJIIJJI, EnumC1839020xxM.NEW_UI_2_MV_LIST_SHEET);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CommerceMusicLogger commerceMusicLoggerMR = MR();
        C1850180yFM.LIZ.getClass();
        commerceMusicLoggerMR.log(C1850180yFM.LJI);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C1784340wXA(this, (TextView) view.findViewById(R.id.wlc), null));
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 33), view.findViewById(R.id.wlb));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sxh);
        final CommerceMusicSubstituteMusicVideoViewModel commerceMusicSubstituteMusicVideoViewModel = (CommerceMusicSubstituteMusicVideoViewModel) this.LLILZ.getValue();
        final CommerceMusicLogger commerceMusicLoggerMR2 = MR();
        final AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(this, recyclerView, 29);
        recyclerView.setAdapter(new AbstractC21673619ry<C1838970xxH>(commerceMusicSubstituteMusicVideoViewModel, this, commerceMusicLoggerMR2, awS393S0200000_27) { // from class: X.0xxG
            public final CommerceMusicSubstituteMusicVideoViewModel LL;
            public final LifecycleOwner LLILLJJLI;
            public final CommerceMusicLogger LLILLL;
            public final Function1<MusicModel, Unit> LLILZ;

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return ((C436790HAv) C09IC.LIZIZ(this.LL.LLILLL).getValue()).LIZ.size();
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                ((C1838970xxH) viewHolder).LLIZLLLIL.setValue(Integer.valueOf(i));
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                final C1838970xxH c1838970xxH = new C1838970xxH(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b07, viewGroup, false), this.LLILLJJLI, this.LLILLL, this.LL, this.LLILZ);
                InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C05RH(new C414301jJ(C09IC.LIZIZ(c1838970xxH.LLILZ.LLILLL), c1838970xxH.LLIZLLLIL, new C436760HAs(null))));
                C786410Ut5.U8((C197039127h) c1838970xxH.LLJI.getValue(), new ACListenerS161S0100000_27(c1838970xxH, 186));
                C786410Ut5.a9((TuxIconView) c1838970xxH.LLJIJIL.getValue(), new ACListenerS161S0100000_27(c1838970xxH, 187));
                C786410Ut5.Q8((SmartImageView) c1838970xxH.LLJILJILJ.getValue(), new ACListenerS161S0100000_27(c1838970xxH, 188));
                C786410Ut5.O7((FrameLayout) c1838970xxH.LLJ.getValue(), new ACListenerS161S0100000_27(c1838970xxH, 189));
                c1838970xxH.LLILLJJLI.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoViewHolder$bindUiState$5
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_PAUSE) {
                            ((InterfaceC1484830ok5) c1838970xxH.LLIZ.getValue()).stop();
                        }
                    }
                });
                ((InterfaceC1484830ok5) c1838970xxH.LLIZ.getValue()).LJIILLIIL(c1838970xxH);
                LifecycleOwnerKt.getLifecycleScope(c1838970xxH.LLILLJJLI).launchWhenStarted(new C436770HAt(interfaceC346201WaLJIILL, c1838970xxH, null));
                try {
                    View view2 = c1838970xxH.itemView;
                    if (view2 != null) {
                        view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c1838970xxH.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c1838970xxH.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C1838970xxH.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c1838970xxH.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c1838970xxH.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C1838970xxH.class.getName();
                return c1838970xxH;
            }

            {
                this.LL = commerceMusicSubstituteMusicVideoViewModel;
                this.LLILLJJLI = this;
                this.LLILLL = commerceMusicLoggerMR2;
                this.LLILZ = awS393S0200000_27;
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        C19744212Mu c19744212Mu = C19744212Mu.LIZ;
        C0DX2 c0dx2 = new C0DX2(8.0f, recyclerView.getContext());
        c19744212Mu.getClass();
        C19744212Mu.LJFF(recyclerView, c0dx2);
        C1058610ded.LIZ(MR(), C1850180yFM.LJII, recyclerView, new AwS641S0100000_27(this, 13));
    }
}
