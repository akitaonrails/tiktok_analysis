package com.ss.android.ugc.aweme.choosemusic.widgets;

import X.AbstractC21673619ry;
import X.C0RD4;
import X.C0WZX;
import X.C15H4;
import X.C15H5;
import X.C15H6;
import X.C15H8;
import X.C15HG;
import X.C15HO;
import X.C15HU;
import X.C20448714zt;
import X.C2204961BRm;
import X.InterfaceC1908130zkp;
import X.InterfaceC20448814zu;
import X.ViewOnClickListenerC1910120zo2;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class MusicClassWidget extends ListItemWidget<C15H5> implements Observer<C0RD4>, C15HU {
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public final int LLJILJIL;
    public final boolean LLJILJILJ;
    public long LLJILLL;
    public long LLJJ;
    public String LLJJI;
    public C15HG LLJJIII;
    public final Fragment LLJJIJI;
    public final HashSet<C15HO> LLJJIJIIJIL = new HashSet<>();

    @Override // X.C15HU
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        this.LLILZ.yQ2("list", this, false);
        this.LLJIJIL = ((Integer) this.LLILZ.get("key_choose_music_type")).intValue();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void LJIILL(C15H8 c15h8) {
        this.LLIZLLLIL = c15h8;
        LJIIZILJ((List) this.LLILZ.get("list"));
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final boolean LJIILLIIL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C15H5) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.15H3] */
    public final void LJIIZILJ(List<InterfaceC20448814zu> list) {
        if (list == null || list.size() < 1 || !(ListProtector.get(list, this.LLJ) instanceof C20448714zt)) {
            return;
        }
        final List<MusicCollectionItem> list2 = ((C20448714zt) ListProtector.get(list, this.LLJ)).LIZ;
        final C15H5 c15h5 = (C15H5) this.LLIZLLLIL;
        final int i = this.LLJIJIL;
        RecyclerView recyclerView = c15h5.LLILLJJLI;
        final boolean z = c15h5.LLILZLL;
        recyclerView.setAdapter(new AbstractC21673619ry<ViewOnClickListenerC1910120zo2>() { // from class: X.0zo3
            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                List list3 = list2;
                if (list3 == null) {
                    return 0;
                }
                return list3.size();
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                ViewOnClickListenerC1910120zo2 viewOnClickListenerC1910120zo2 = (ViewOnClickListenerC1910120zo2) viewHolder;
                MusicCollectionItem musicCollectionItem = (MusicCollectionItem) ListProtector.get(list2, i2);
                if (musicCollectionItem != null) {
                    musicCollectionItem.setPlaylistOrder(i2);
                    viewOnClickListenerC1910120zo2.LLILLL = musicCollectionItem;
                    viewOnClickListenerC1910120zo2.LL.setText(musicCollectionItem.mcName);
                    C1324840ka2.LJFF(viewOnClickListenerC1910120zo2.LLILLJJLI, viewOnClickListenerC1910120zo2.LLILLL.awemeCover);
                    if (c15h5.LLILZIL != null) {
                        C15HO c15ho = new C15HO("change_music_page", musicCollectionItem.mcName, "", C15IK.LIZ);
                        c15ho.LIZIZ(musicCollectionItem.mcId);
                        c15h5.LLILZIL.LIZ(c15ho, "playlist");
                    }
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                int i3;
                if (C1911780zqi.LIZJ(z)) {
                    i3 = R.layout.cx_;
                } else {
                    i3 = R.layout.cx9;
                }
                ViewOnClickListenerC1910120zo2 viewOnClickListenerC1910120zo2 = new ViewOnClickListenerC1910120zo2(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i3, viewGroup, false), i, c15h5.LLILZ);
                try {
                    View view = viewOnClickListenerC1910120zo2.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                viewOnClickListenerC1910120zo2.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (viewOnClickListenerC1910120zo2.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(ViewOnClickListenerC1910120zo2.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i2);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) viewOnClickListenerC1910120zo2.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(viewOnClickListenerC1910120zo2.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = ViewOnClickListenerC1910120zo2.class.getName();
                return viewOnClickListenerC1910120zo2;
            }
        });
        C15H5 c15h52 = (C15H5) this.LLIZLLLIL;
        c15h52.LLILLL = new C15H4(this);
        c15h52.LLILZ = new InterfaceC1908130zkp() { // from class: X.15H3
            @Override // X.InterfaceC1908130zkp
            public final void LIZ(MusicCollectionItem musicCollectionItem) {
                MusicClassWidget musicClassWidget = this.LIZ;
                musicClassWidget.getClass();
                Intent intent = new Intent(musicClassWidget.LL, (Class<?>) MusicDetailListActivity.class);
                intent.putExtra("music_type", 2);
                intent.putExtra("music_class_id", musicCollectionItem.mcId);
                intent.putExtra("music_class_name", musicCollectionItem.mcName);
                intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicClassWidget.LLJIJIL);
                intent.putExtra("music_class_enter_method", "click_category_list");
                intent.putExtra("music_class_level", musicCollectionItem.level);
                intent.putExtra("sound_page_scene", musicClassWidget.LLJILJIL);
                intent.putExtra("max_video_duration", musicClassWidget.LLJILLL);
                intent.putExtra("shoot_video_length", musicClassWidget.LLJJ);
                intent.putExtra("playlist_order_in_csp", musicCollectionItem.playlistOrder);
                intent.putExtra("music_discovery_type", 3);
                intent.putExtra("extra_key_from_page", "song_selection_page");
                intent.putExtra("tab_name", musicClassWidget.LLJJI);
                intent.putExtra("key_show_lyric_tag", (Boolean) musicClassWidget.LLILZ.get("key_show_lyric_tag"));
                musicClassWidget.LJIILJJIL(intent, musicClassWidget.LLJI);
                C15IK.LJIIIZ(1, musicCollectionItem.mcName, "click_category_list", "", "change_music_page", musicCollectionItem.mcId, musicClassWidget.LLJJI, null, "song_selection_page");
            }
        };
        c15h52.LLILZIL = new C15H6(this);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        C0RD4 c0rd42 = c0rd4;
        if (this.LLIZLLLIL != null && c0rd42 != null) {
            String str = c0rd42.LIZ;
            str.getClass();
            if (str.equals("list")) {
                Object obj = c0rd42.LIZIZ;
                if (obj == null) {
                    obj = null;
                }
                LJIIZILJ((List) obj);
            }
        }
    }

    @Override // X.C15HU
    public final void LJIIIIZZ(int i, int i2) {
        Fragment fragment = this.LLJJIJI;
        if (fragment != null && fragment.getUserVisibleHint() && !this.LLJJIJIIJIL.isEmpty() && this.LLJJIII != null) {
            Iterator<C15HO> it2 = this.LLJJIJIIJIL.iterator();
            while (it2.hasNext()) {
                this.LLJJIII.LIZ(it2.next(), "playlist");
            }
            this.LLJJIJIIJIL.clear();
        }
    }

    public MusicClassWidget(int i, Fragment fragment, boolean z) {
        this.LLJJIJI = fragment;
        this.LLJILJIL = i;
        this.LLJILJILJ = z;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIL(int i, int i2, Intent intent) throws Throwable {
        if (i2 == -1 && i == this.LLJI) {
            C2204961BRm.LJIIL(-1, LJIIIZ(), intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f33NTkoWIPuAGCzTCJ0sK/dmpoWc7Nx/3Tg==", null));
            LJIIIZ().finish();
        }
    }
}
