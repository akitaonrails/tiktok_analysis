package com.ss.android.ugc.aweme.music.ui.widget;

import X.C11FP;
import X.C1391190mJ3;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1885907a5;
import X.C197043127l;
import X.C197044127m;
import X.C197045127n;
import X.C343970De7;
import X.C723590SZx;
import X.C724240Sb0;
import X.InterfaceC447510Hgj;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes30.dex */
public final class ChooseThirdMusicAssem extends UIContentAssem implements C11FP {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C197044127m.class, "music_info"), checkSupervisorPrepared());
    public Fragment LLJ;
    public C197043127l LLJI;

    @Override // X.C11FP, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    private final C197044127m Ho() {
        return (C197044127m) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.127n] */
    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: Go, reason: merged with bridge method [inline-methods] */
    public C197045127n lt() {
        return new InterfaceC447510Hgj() { // from class: X.127n
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    @Override // X.C11FP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C9(com.ss.android.ugc.aweme.music.model.ExternalMusicInfo r9) {
        /*
            r8 = this;
            X.127l r5 = r8.LLJI
            r1 = 0
            if (r5 != 0) goto L6
            r5 = r1
        L6:
            androidx.fragment.app.Fragment r0 = r8.LLJ
            if (r0 == 0) goto Lb
            r1 = r0
        Lb:
            r1.getContext()
            java.util.List r1 = java.util.Collections.singletonList(r9)
            r8.Ho()
            X.127m r0 = r8.Ho()
            java.lang.String r4 = r0.LLILZ
            r8.Ho()
            X.127m r0 = r8.Ho()
            X.0Oof r3 = r0.LLJIJIL
            r5.getClass()
            java.util.Iterator r7 = r1.iterator()
        L2b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r6 = r7.next()
            com.ss.android.ugc.aweme.music.model.ExternalMusicInfo r6 = (com.ss.android.ugc.aweme.music.model.ExternalMusicInfo) r6
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r1 = r6.getPartnerSongId()
            java.lang.String r0 = "music_id"
            r2.put(r0, r1)
            java.lang.String r1 = "music_from"
            java.lang.String r0 = r6.getPartnerName()
            r2.put(r1, r0)
            java.lang.String r1 = "process_id"
            java.lang.String r0 = r5.LIZ
            r2.put(r1, r0)
            if (r4 != 0) goto L90
            java.lang.String r1 = r5.LIZIZ
        L59:
            java.lang.String r0 = "song_id"
            r2.put(r0, r1)
            java.lang.String r1 = "group_id"
            java.lang.String r0 = r5.LIZJ
            r2.put(r1, r0)
            java.lang.String r1 = "button_name"
            java.lang.String r0 = "play_full_song"
            r2.put(r1, r0)
            java.lang.String r1 = "from_action"
            java.lang.String r0 = r5.LIZLLL
            r2.put(r1, r0)
            if (r3 == 0) goto L8e
            boolean r1 = r3.isPgc()
            r0 = 1
            if (r1 != r0) goto L8e
        L7c:
            if (r0 == 0) goto L8b
            java.lang.String r1 = "pgc_clip"
        L80:
            java.lang.String r0 = "from_music_type"
            r2.put(r0, r1)
            java.lang.String r0 = "show_copyright_music"
            X.C20684815ws.LJIILLIIL(r0, r2)
            goto L2b
        L8b:
            java.lang.String r1 = "original_song"
            goto L80
        L8e:
            r0 = 0
            goto L7c
        L90:
            r1 = r4
            goto L59
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.widget.ChooseThirdMusicAssem.C9(com.ss.android.ugc.aweme.music.model.ExternalMusicInfo):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        boolean z;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null) {
            return;
        }
        this.LLJ = fragmentLJI;
        fragmentLJI.getContext();
        Ho();
        this.LLJI = new C197043127l(Ho().LLILLL, Ho().LLILZ, Ho().LLILZIL, Ho().LLIZLLLIL, Ho().LLJI);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view;
        Fragment fragment = this.LLJ;
        if (fragment == null) {
            fragment = null;
        }
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(fragment.getContext()));
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(ThirdMusicViewHolder.class);
        viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        ArrayList arrayList = new ArrayList();
        int size = Ho().LL.size();
        int i = 0;
        for (ExternalMusicInfo externalMusicInfo : Ho().LL) {
            int i2 = i + 1;
            if (i >= 0) {
                ExternalMusicInfo externalMusicInfo2 = externalMusicInfo;
                if (i == size - 1) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C1885907a5(externalMusicInfo2, z));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(arrayList, null);
    }

    @Override // X.C11FP
    public void sR(ExternalMusicInfo externalMusicInfo) {
        Fragment fragment = this.LLJ;
        if (fragment == null) {
            return;
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(fragment, C343970De7.LIZ);
        Fragment fragment2 = this.LLJ;
        Fragment fragment3 = null;
        if (fragment2 == null) {
            fragment2 = null;
        }
        Fragment parentFragment = fragment2.getParentFragment();
        if (parentFragment != null && parentFragment.getFragmentManager() != null) {
            C197043127l c197043127l = this.LLJI;
            if (c197043127l == null) {
                c197043127l = null;
            }
            Fragment fragment4 = this.LLJ;
            if (fragment4 != null) {
                fragment3 = fragment4;
            }
            Context context = fragment3.getContext();
            Ho();
            String str2 = Ho().LLILZ;
            Ho();
            c197043127l.LIZ(context, externalMusicInfo, true, str2, Ho().LLJIJIL);
        }
    }
}
