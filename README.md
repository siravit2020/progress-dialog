# Preview
![111](https://user-images.githubusercontent.com/70007943/92309500-63833280-efd0-11ea-9771-201241e40d27.jpg)
![112](https://user-images.githubusercontent.com/70007943/92309502-654cf600-efd0-11ea-976f-e3ea2d147c11.jpg)
![113](https://user-images.githubusercontent.com/70007943/92309505-6aaa4080-efd0-11ea-81c7-031473e5ac1d.jpg)

# Setup
Add it in your root build.gradle at the end of repositories:
```

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
```
Step 2. Add the dependency
```

dependencies {
	        implementation 'com.github.siravit2020:progress-dialog:1.2.1'
	}
  
```
# Usage
### Simple
* kotlin
```

val d = maiProgressDialog(this).returnDialog()
d.show()

```
* Java
```

Dialog d = new maiProgressDialog(this).returnDialog();
d.show();
	
```
When you want to close. use **d.dismiss()**

### Custom

##### setCorner(int)
	defalut is 15
##### setText(string)
	default is "Loading..."
##### setTextSize(int)
##### setTextColor(int) 
	color resource
##### setDialogWidth(Double)
	default 0.8
	form 0.00 - 1.00
	0.95 is 95 percent of the screen
	If you want to use WRAP_CONTENT setDialogWidth(0)
##### setColorDialog(int)
	default color white
	color resource
##### setColorProgress(int)
	default is the same color as colorAccent in your app
	color resource


* Kotlin
```

val d = ProgressDialogMai(this)
        d.setCorner(30)
        d.setText("LOL")
        d.setTextColor(R.color.colorPrimary)
        d.setDialogWidth(0.9)
        d.setTextSize(7)
        d.setColorProgress(R.color.colorAccent)
        d.setColorDialog(R.color.colorPrimaryDark)
val dialog = d.dialog()
dialog.show()
        
```
* Java
```

ProgressDialogMai d= new ProgressDialogMai(this);
        d.setCorner(30)
        d.setText("LOL")
        d.setTextColor(R.color.colorPrimary)
        d.setDialogWidth(0.9)
        d.setTextSize(7)
        d.setColorProgress(R.color.colorAccent)
        d.setColorDialog(R.color.colorPrimaryDark)
Dialog dialog = d.dialog();
dialog.show();
	
```
When you want to close. use **dialog.dismiss()**
