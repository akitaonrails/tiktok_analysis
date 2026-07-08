package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import webcast.data.multi_guest_play.WallpaperContent;

/* JADX INFO: loaded from: classes.dex */
public final class WallpaperMessage extends AbstractC1136060ffY {

    @C09CT("message_type")
    public int messageType;

    @C09CT("wallpaper_content")
    public WallpaperContent wallpaperContent;

    public WallpaperMessage() {
        this.type = C001A.WALLPAPER_MESSAGE;
    }
}
