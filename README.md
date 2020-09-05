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
	        implementation 'com.github.siravit2020:progress-dialog:1.1.5'
	}
  
```
# Usage
### Simple
* kotlin
```
val d = maiProgressDialog(this).returnDialog()
d.show()

```

### Custom
* kotlin
```
val d = maiProgressDialog(this)
        d.setCorner(30)
        d.setText("LOL")
        d.setTextColor(R.color.colorAccent)
        d.setDialogWidth(0.9)
        d.setColorDialog(R.color.colorPrimary)
val dialog = d.returnDialog()
dialog.show()
        
```
When you want to close. use dialog.dismiss()
