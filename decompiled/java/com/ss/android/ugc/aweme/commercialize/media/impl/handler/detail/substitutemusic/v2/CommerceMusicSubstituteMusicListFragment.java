package com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2;

import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.C01GW;
import X.C0DXR;
import X.C1006040cHq;
import X.C1058610ded;
import X.C13BV;
import X.C13LE;
import X.C15438062q;
import X.C1838950xxF;
import X.C1838980xxI;
import X.C1839010xxL;
import X.C1839120xxW;
import X.C1850180yFM;
import X.C1850190yFN;
import X.C19744212Mu;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import X.C862220Xs4;
import X.C997320c3m;
import X.EnumC1839020xxM;
import X.EnumC1839040xxO;
import X.InterfaceC1010530cP5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS139S0100000_4;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class CommerceMusicSubstituteMusicListFragment extends Fragment implements InterfaceC1010530cP5<C1838980xxI> {
    public static final C1839010xxL LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiJCo3ISRiICIjJGskKCE3JCA+Zys2PCQlHELIOSJWEgPSc/PSYnPTEpJDogISZiP319CyohJCohKyABPDw6KxY5KzwnITE5PSoePTYlKgM6OzEKOy40JSAiPQ==";
    public C1838980xxI LL;
    public final C997320c3m LLILLJJLI;
    public final C997320c3m LLILLL;
    public final C01GW LLILZ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0xxL] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceMusicSubstituteMusicListFragment.class, "musicDetail", "getMusicDetail()Lcom/ss/android/ugc/aweme/music/model/MusicDetail;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(CommerceMusicSubstituteMusicListFragment.class, "logger", "getLogger()Lcom/ss/android/ugc/aweme/commercialize/media/impl/logging/CommerceMusicLogger;", 0)};
        LLILZIL = new Object() { // from class: X.0xxL
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

    public CommerceMusicSubstituteMusicListFragment() {
        super(R.layout.b06);
        this.LLILLJJLI = new C997320c3m(AFwS269S0000000_27.get$arr$(48));
        this.LLILLL = new C997320c3m(AFwS269S0000000_27.get$arr$(47));
        this.LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 219));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ScopedMusicPlayer scopedMusicPlayer = ((CommerceMusicSubstituteMusicListViewModel) this.LLILZ.getValue()).LLILLJJLI;
        if (scopedMusicPlayer == null) {
            scopedMusicPlayer = null;
        }
        scopedMusicPlayer.pause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ?? arrayList;
        String musicName;
        super.onCreate(bundle);
        CommerceMusicSubstituteMusicListViewModel commerceMusicSubstituteMusicListViewModel = (CommerceMusicSubstituteMusicListViewModel) this.LLILZ.getValue();
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        MusicDetail musicDetail = (MusicDetail) c997320c3m.LIZ(this);
        ScopedMusicPlayer scopedMusicPlayer = new ScopedMusicPlayer(requireContext(), this);
        CommerceMusicLogger commerceMusicLoggerMR = MR();
        commerceMusicSubstituteMusicListViewModel.LL = musicDetail;
        commerceMusicSubstituteMusicListViewModel.LLILLJJLI = scopedMusicPlayer;
        commerceMusicSubstituteMusicListViewModel.LLILLL = commerceMusicLoggerMR;
        C2252321DDq c2252321DDq = commerceMusicSubstituteMusicListViewModel.LLILZLL;
        List<Music> list = musicDetail.recommendMusicList;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (Music music : list) {
                String musicName2 = music.getMusicName();
                String authorName = music.getAuthorName();
                int duration = music.getDuration();
                int userCount = music.getUserCount();
                String recommendTag = music.getRecommendTag();
                String strLIZ = C1838950xxF.LIZ(music.getCoverMedium());
                if (strLIZ == null && (strLIZ = C1838950xxF.LIZ(music.getCoverLarge())) == null) {
                    strLIZ = C1838950xxF.LIZ(music.getCoverThumb());
                }
                arrayList.add(new C1839120xxW(musicName2, authorName, duration, userCount, recommendTag, strLIZ, EnumC1839040xxO.PAUSED));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        Music music2 = musicDetail.music;
        if (music2 == null || (musicName = music2.getMusicName()) == null) {
            musicName = "";
        }
        c2252321DDq.setValue(new C1006040cHq(arrayList, musicName, true));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(commerceMusicSubstituteMusicListViewModel), null, null, new C862220Xs4(commerceMusicSubstituteMusicListViewModel, null), 3);
        CommerceMusicLogger commerceMusicLoggerMR2 = MR();
        C1850190yFN.LIZ.getClass();
        commerceMusicLoggerMR2.withParam(C1850190yFN.LJIIJJI, EnumC1839020xxM.NEW_UI_2_MUSIC_LIST_SHEET);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CommerceMusicLogger commerceMusicLoggerMR = MR();
        C1850180yFM.LIZ.getClass();
        commerceMusicLoggerMR.log(C1850180yFM.LJI);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sxh);
        final View viewFindViewById = view.findViewById(R.id.wlb);
        final CommerceMusicSubstituteMusicListViewModel commerceMusicSubstituteMusicListViewModel = (CommerceMusicSubstituteMusicListViewModel) this.LLILZ.getValue();
        final CommerceMusicLogger commerceMusicLoggerMR2 = MR();
        final AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(this, recyclerView, 30);
        recyclerView.setAdapter(new AbstractC21673619ry<RecyclerView.ViewHolder>(commerceMusicSubstituteMusicListViewModel, this, commerceMusicLoggerMR2, awS393S0200000_27) { // from class: X.0iF5
            public final CommerceMusicSubstituteMusicListViewModel LL;
            public final LifecycleOwner LLILLJJLI;
            public final CommerceMusicLogger LLILLL;
            public final Function1<MusicModel, Unit> LLILZ;

            @Override // X.AbstractC21673619ry
            public final int getItemViewType(int i) {
                return i == 0 ? 101 : 102;
            }

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return ((C1006040cHq) C09IC.LIZIZ(this.LL.LLILZLL).getValue()).LIZ.size() + 1;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (viewHolder instanceof C1839130xxX) {
                    ((C1839130xxX) viewHolder).LLJILLL.setValue(Integer.valueOf(i - 1));
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                RecyclerView.ViewHolder c1006120cHy;
                if (i == 101) {
                    c1006120cHy = new C1006120cHy(C09IC.LIZIZ(this.LL.LLILZLL), C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b04, viewGroup, false), this.LLILLJJLI);
                } else {
                    C1839130xxX c1839130xxX = new C1839130xxX(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b05, viewGroup, false), this.LLILLJJLI, this.LLILLL, this.LLILZ);
                    LifecycleOwnerKt.getLifecycleScope(c1839130xxX.LLILLJJLI).launchWhenStarted(new C1006000cHm(this.LL, c1839130xxX, null));
                    c1006120cHy = c1839130xxX;
                }
                try {
                    View view2 = c1006120cHy.itemView;
                    if (view2 != null) {
                        view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c1006120cHy.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c1006120cHy.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(c1006120cHy.getClass().getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c1006120cHy.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c1006120cHy.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = c1006120cHy.getClass().getName();
                return c1006120cHy;
            }

            {
                this.LL = commerceMusicSubstituteMusicListViewModel;
                this.LLILLJJLI = this;
                this.LLILLL = commerceMusicLoggerMR2;
                this.LLILZ = awS393S0200000_27;
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        C19744212Mu c19744212Mu = C19744212Mu.LIZ;
        C0DXR c0dxr = new C0DXR() { // from class: X.03wl
            public final int LL;
            public final int LLILLJJLI;

            {
                Float fValueOf = Float.valueOf(0.0f);
                this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
                this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                super.LIZIZ(rect, view2, recyclerView2, c21673919s1);
                AbstractC21673619ry adapter = recyclerView2.getAdapter();
                if (adapter != null) {
                    int itemCount = adapter.getItemCount();
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
                    if (childAdapterPosition == 0) {
                        rect.top = this.LLILLJJLI;
                        rect.bottom = this.LL / 2;
                    } else if (childAdapterPosition == itemCount - 1) {
                        int i = this.LL;
                        rect.top = i / 2;
                        rect.bottom = i;
                    } else {
                        int i2 = this.LL / 2;
                        rect.top = i2;
                        rect.bottom = i2;
                    }
                }
            }
        };
        c19744212Mu.getClass();
        C19744212Mu.LJFF(recyclerView, c0dxr);
        C786410Ut5.LLIZLLLIL(recyclerView, 0);
        C1058610ded.LIZ(MR(), C1850180yFM.LJIIIZ, recyclerView, new AwS641S0100000_27(this, 14));
        recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0DKI
            public int LL;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView2, int i, int i2) {
                this.LL += i2;
                View view2 = viewFindViewById;
                GradientDrawable gradientDrawable = new GradientDrawable();
                RecyclerView recyclerView3 = recyclerView;
                gradientDrawable.setShape(1);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.br, recyclerView3.getContext());
                if (numLIZJ != null) {
                    numLIZJ.intValue();
                }
                gradientDrawable.setColor(Integer.valueOf(Color.argb(C13LZ.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL))) / 2, 0, 16), 22, 24, 35)).intValue());
                view2.setBackground(gradientDrawable);
            }
        });
        C786410Ut5.I7(new ACListenerS139S0100000_4(this, 13), viewFindViewById);
    }
}
