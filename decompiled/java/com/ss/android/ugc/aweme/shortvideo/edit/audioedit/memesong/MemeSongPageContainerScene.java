package com.ss.android.ugc.aweme.shortvideo.edit.audioedit.memesong;

import X.AbstractC214814194y;
import X.C0MGE;
import X.C13BV;
import X.C19549211e6;
import X.C19549411e8;
import X.C20684815ws;
import X.C2344009Gk;
import X.C383980F3s;
import X.C573640Meg;
import X.InterfaceC19549711eB;
import X.InterfaceC19549811eC;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class MemeSongPageContainerScene extends AbstractC214814194y implements C0MGE, InterfaceC19549711eB {
    public String LLJJIJIL;
    public String LLJJJ;
    public List<MemeSongModel> LLJJJIL;
    public C19549411e8 LLJJJJ;
    public String LLJJJJJIL;

    @Override // X.InterfaceC19549711eB
    public final void LJJIII() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("action_type", this.LLJJIJIL);
        C20684815ws.LJIILLIIL("generate_meme_song", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC19549711eB
    public final void LJJLIIIJL() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("action_type", this.LLJJIJIL);
        C20684815ws.LJIILLIIL("create_or_edit_meme_song", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC19549711eB
    public final void LLIIIL() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("action_type", this.LLJJIJIL);
        C20684815ws.LJIILLIIL("click_meme_song_random_lyric_shuffle_button", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC19549711eB
    public final void LLIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("action_type", this.LLJJIJIL);
        C20684815ws.LJIILLIIL("enter_meme_song_create_page", c2344009Gk.LIZ);
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        C19549411e8 c19549411e8 = this.LLJJJJ;
        if (c19549411e8 != null) {
            return c19549411e8.LIZ();
        }
        return false;
    }

    @Override // X.InterfaceC19549711eB
    public final void onLoading() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("action_type", this.LLJJIJIL);
        C20684815ws.LJIILLIIL("enter_meme_song_loading_page", c2344009Gk.LIZ);
    }

    public MemeSongPageContainerScene() {
        LLLLJ(AFwS239S0000000_8.get$arr$(69));
        disableSupportRestore();
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final void finish() {
        super.finish();
        C573640Meg.LIZIZ = null;
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        C19549411e8 c19549411e8 = this.LLJJJJ;
        if (c19549411e8 != null) {
            if (c19549411e8.LLJJIJI) {
                c19549411e8.getViewModel().LJ(false);
            } else {
                c19549411e8.LLJJIJI = true;
                c19549411e8.getViewModel().LJ(true);
            }
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStop() {
        InterfaceC19549811eC interfaceC19549811eCLIZLLL;
        super.onStop();
        C19549411e8 c19549411e8 = this.LLJJJJ;
        if (c19549411e8 != null) {
            C19549211e6 viewModel = c19549411e8.getViewModel();
            viewModel.LJ = false;
            InterfaceC19549811eC interfaceC19549811eCLIZLLL2 = viewModel.LIZLLL();
            if (interfaceC19549811eCLIZLLL2 == null || !interfaceC19549811eCLIZLLL2.isPlaying() || (interfaceC19549811eCLIZLLL = viewModel.LIZLLL()) == null) {
                return;
            }
            interfaceC19549811eCLIZLLL.pause();
        }
    }

    @Override // X.InterfaceC19549711eB
    public final void LJIIJJI(String str) {
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJJIL);
        if (str != null && str.length() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        c2344009Gk.LIZJ(i ^ 1, "has_text");
        C20684815ws.LJIILLIIL("exit_meme_song_create_page", c2344009Gk.LIZ);
        C383980F3s.LIZ(0L, new AwS573S0100000_29(C573640Meg.LIZIZ, (Function2<? super List<MemeSongModel>, ? super String, Unit>) 208));
        finish();
    }

    @Override // X.InterfaceC19549711eB
    public final void LJLLJ(boolean z) {
        Function2<? super List<MemeSongModel>, ? super String, Unit> function2;
        if (z && (function2 = C573640Meg.LIZIZ) != null) {
            function2.invoke(C13BV.INSTANCE, "MemeSongStartOver");
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("action_type", this.LLJJIJIL);
        C20684815ws.LJIILLIIL("recreate_meme_song", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC19549711eB
    public final void LLII(List<MemeSongModel> list) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("button_name", "share");
        C20684815ws.LJIILLIIL("click_meme_song_output_page_button", c2344009Gk.LIZ);
        Function2<? super List<MemeSongModel>, ? super String, Unit> function2 = C573640Meg.LIZIZ;
        if (function2 != null) {
            function2.invoke(list, "MemeSongShare");
        }
    }

    @Override // X.InterfaceC19549711eB
    public final void LLIILZL(long j) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("action_type", this.LLJJIJIL);
        c2344009Gk.LIZLLL(j, "loading_duration");
        C20684815ws.LJIILLIIL("enter_meme_song_output_page", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC19549711eB
    public final void LLF(List<MemeSongModel> list, boolean z) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("action_type", this.LLJJIJIL);
        if (z) {
            str = "done";
        } else {
            str = "use song";
        }
        c2344009Gk.LJIIIIZZ("button_name", str);
        C20684815ws.LJIILLIIL("click_meme_song_output_page_button", c2344009Gk.LIZ);
        Iterator<MemeSongModel> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().setHasConsumed(true);
        }
        C383980F3s.LIZ(0L, new AwS409S0200000_8((Function2) C573640Meg.LIZIZ, (Function2<? super List<MemeSongModel>, ? super String, Unit>) list, (List<MemeSongModel>) 28));
        finish();
    }

    @Override // X.InterfaceC19549711eB
    public final void LLILZIL(int i, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("action_type", this.LLJJIJIL);
        c2344009Gk.LIZJ(i, "rank");
        c2344009Gk.LJIIIIZZ("name", str);
        C20684815ws.LJIILLIIL("click_meme_song_random_lyric_title", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC19549711eB
    public final void LJIILLIIL(int i, String str, boolean z) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJJIL);
        c2344009Gk.LJIIIIZZ("action_type", this.LLJJIJIL);
        c2344009Gk.LJIIIIZZ("meme_song_style", str);
        c2344009Gk.LIZJ(i, "rank");
        if (z) {
            str2 = "auto";
        } else {
            str2 = "user";
        }
        c2344009Gk.LJIIIIZZ("method", str2);
        C20684815ws.LJIILLIIL("click_meme_song_style", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ViewGroup onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            android.os.Bundle r1 = r4.mArguments
            r3 = 0
            if (r1 == 0) goto L2e
            java.lang.String r0 = "MemeSongPageFrom"
            java.lang.String r0 = r1.getString(r0)
        Lb:
            r4.LLJJJ = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel> r0 = X.C573640Meg.LIZ
            if (r0 == 0) goto L30
            java.util.Iterator r1 = r0.iterator()
        L1a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel r0 = (com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel) r0
            com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel r0 = com.ss.android.ugc.aweme.shortvideo.model.MemeSongModelKt.deepClone(r0)
            r2.add(r0)
            goto L1a
        L2e:
            r0 = r3
            goto Lb
        L30:
            X.C573640Meg.LIZ = r3
            r4.LLJJJIL = r2
            java.lang.String r2 = r4.LLJJJ
            if (r2 == 0) goto Lb6
            int r1 = r2.hashCode()
            r0 = -1823757642(0xffffffff934baab6, float:-2.570637E-27)
            if (r1 == r0) goto Lab
            r0 = -219427671(0xfffffffff2ebcca9, float:-9.340979E30)
            if (r1 == r0) goto La0
            r0 = 1439192624(0x55c85630, float:2.7534062E13)
            if (r1 != r0) goto Lb6
            java.lang.String r0 = "RecordMusicPanel"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb6
            java.lang.String r0 = "video_shoot_page"
        L55:
            r4.LLJJJJJIL = r0
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel> r0 = r4.LLJJJIL
            if (r0 == 0) goto L9d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9d
            java.lang.String r0 = "edit"
        L65:
            r4.LLJJIJIL = r0
            android.view.Window r1 = r4.getWindow()
            if (r1 == 0) goto L72
            r0 = 1024(0x400, float:1.435E-42)
            r1.clearFlags(r0)
        L72:
            android.app.Activity r0 = r4.mActivity
            if (r0 == 0) goto Lb9
            X.C1741950vQn.LIZ(r0)
            android.view.Window r1 = r4.getWindow()
            if (r1 == 0) goto L84
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setNavigationBarColor(r0)
        L84:
            X.11e8 r1 = new X.11e8
            android.content.Context r0 = r4.requireSceneContext()
            r1.<init>(r0)
            r1.setActions(r4)
            java.lang.String r0 = r4.LLJJJ
            r1.setFrom(r0)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel> r0 = r4.LLJJJIL
            r1.setInitModels(r0)
            r4.LLJJJJ = r1
            return r1
        L9d:
            java.lang.String r0 = "create"
            goto L65
        La0:
            java.lang.String r0 = "EditMusicPanel"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb6
            java.lang.String r0 = "video_edit_page"
            goto L55
        Lab:
            java.lang.String r0 = "MusicDetail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb6
            java.lang.String r0 = "music_detail_page_create_song"
            goto L55
        Lb6:
            java.lang.String r0 = "unknown"
            goto L55
        Lb9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioedit.memesong.MemeSongPageContainerScene.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.ViewGroup");
    }
}
