package lucassoares.com.menudrawer.Service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class InternetSite
{
    private Context context;
    public InternetSite(Context c) {
      context = c;
    }

    public void AcessarInternet(String site) {
        Uri uri = Uri.parse(site);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        context.startActivity(intent);
    }

    public void AcessarEmail(){
      String email = "malito:devlucassoares@gmail.com";
      Uri uriMail = Uri.parse(email);
      Intent intentMail = new Intent(Intent.ACTION_SENDTO, uriMail);
      context.startActivity(intentMail);
    }

    public void AcessarNumero(){
        Uri uri = Uri.parse("tel:21980150741");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        context.startActivity(intent);
    }
}
