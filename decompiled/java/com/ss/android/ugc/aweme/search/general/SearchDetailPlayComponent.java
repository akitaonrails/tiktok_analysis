package com.ss.android.ugc.aweme.search.general;

import X.C0Q5M;
import X.C0QO8;
import X.C0RD6;
import X.C664360Q4c;
import X.C664390Q4f;
import X.C664490Q4p;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDetailPlayComponent extends BasePanelComponent {
    public static final /* synthetic */ int LLJ = 0;
    public long LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public final String LL = "";
    public String LLILLJJLI = "";
    public final ConcurrentHashMap<String, C664390Q4f> LLIZLLLIL = new ConcurrentHashMap<>();

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        Bundle arguments;
        String string;
        super.onCreate();
        Fragment fragment = getPanelContext().LJ;
        String str = "";
        if (fragment != null && (arguments = fragment.getArguments()) != null && (string = arguments.getString("end_to_end_search_session_id", "")) != null) {
            str = string;
        }
        C0QO8.LIZ.LJIIIZ(str);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (!this.LLIZLLLIL.isEmpty()) {
            for (Map.Entry<String, C664390Q4f> entry : this.LLIZLLLIL.entrySet()) {
                entry.getValue().LIZJ(entry.getKey(), "search_inner");
            }
            this.LLIZLLLIL.clear();
        }
        C664360Q4c.LIZ.getClass();
        C664360Q4c.LIZLLL();
        C0QO8.LIZ.LIZ("detail");
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        C664390Q4f c664390Q4fRemove;
        super.onPause();
        if (!C664490Q4p.LIZ() || (c664390Q4fRemove = this.LLIZLLLIL.remove(this.LLILLJJLI)) == null) {
            return;
        }
        c664390Q4fRemove.LIZJ(this.LLILLJJLI, "search_inner");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_pre_play", new C0Q5M(this));
        c0rd6.LIZIZ("event_on_render_first_frame", new AwS589S0100000_10(this, 151));
        c0rd6.LIZIZ("event_on_request_resume_play", new AwS589S0100000_10(this, 152));
        c0rd6.LIZIZ("event_on_play_pause", new AwS589S0100000_10(this, 153));
        c0rd6.LIZIZ("event_on_buffering", new AwS589S0100000_10(this, 154));
        c0rd6.LIZIZ("event_on_play_failed", new AwS589S0100000_10(this, 155));
    }
}
